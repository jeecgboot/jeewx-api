package org.jeewx.api.core.common;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.jeewx.api.core.exception.WexinReqException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONObject;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/**
 * 
 * @author xiaoqingfeng
 * 微信url请求公用方法
 * @
 */
public class WxstoreUtils {
	private static Logger logger = LoggerFactory.getLogger(WxstoreUtils.class);

	public static JSONObject httpRequest(String requestUrl,
			String requestMethod, String outputStr) {
		logger.debug("*********HTTPREQUEST START********");
		logger.debug("*********requestUrl is "+
				requestUrl+" END AND requestMethod IS"
				+requestMethod + " END AND  outputStr" 
				+outputStr +" END ********");
		JSONObject jsonObject = null;
		StringBuffer buffer = new StringBuffer();
		try {
			TrustManager[] tm = { new MyX509TrustManager() };
			SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
			sslContext.init(null, tm, new SecureRandom());

			SSLSocketFactory ssf = sslContext.getSocketFactory();

			URL url = new URL(requestUrl);
			HttpsURLConnection httpUrlConn = (HttpsURLConnection) url
					.openConnection();
			httpUrlConn.setSSLSocketFactory(ssf);

			httpUrlConn.setDoOutput(true);
			httpUrlConn.setDoInput(true);
			httpUrlConn.setUseCaches(false);

			httpUrlConn.setRequestMethod(requestMethod);

			if ("GET".equalsIgnoreCase(requestMethod)) {
				httpUrlConn.connect();
			}

			if (null != outputStr) {
				OutputStream outputStream = httpUrlConn.getOutputStream();

				outputStream.write(outputStr.getBytes("UTF-8"));
				outputStream.close();
			}

			InputStream inputStream = httpUrlConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(
					inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);

			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			bufferedReader.close();
			inputStreamReader.close();

			inputStream.close();
			inputStream = null;
			httpUrlConn.disconnect();
			jsonObject = JSONObject.fromObject(buffer.toString());
			if (jsonObject.containsKey("errcode") && jsonObject.getInt("errcode") != 0) {
				logger.debug("********* ERROR********{}",buffer.toString());
				logger.debug("*********HTTPREQUEST END********");
				throw new WexinReqException("httpRequest Method！errcode="
						+ jsonObject.getString("errcode") + ",errmsg = "
						+ jsonObject.getString("errmsg"));
			} else {
				logger.debug("********* SUCCESS END********");
			}
		} catch (ConnectException ce) {
			System.out.println("Weixin server connection timed out.");
		} catch (Exception e) {
			System.out.println("https request error:{}" + e.getMessage());
		}
		return jsonObject;
	}

	public static JSONObject httpRequest2(String requestUrl,
			String requestMethod, byte[] outputStr) {
		JSONObject jsonObject = null;
		StringBuffer buffer = new StringBuffer();
		try {
			TrustManager[] tm = { new MyX509TrustManager() };
			SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
			sslContext.init(null, tm, new SecureRandom());

			SSLSocketFactory ssf = sslContext.getSocketFactory();

			URL url = new URL(requestUrl);
			HttpsURLConnection httpUrlConn = (HttpsURLConnection) url
					.openConnection();
			httpUrlConn.setSSLSocketFactory(ssf);

			httpUrlConn.setDoOutput(true);
			httpUrlConn.setDoInput(true);
			httpUrlConn.setUseCaches(false);

			httpUrlConn.setRequestMethod(requestMethod);

			if ("GET".equalsIgnoreCase(requestMethod)) {
				httpUrlConn.connect();
			}

			if (null != outputStr) {
				OutputStream outputStream = httpUrlConn.getOutputStream();

				outputStream.write(outputStr);
				outputStream.close();
			}

			InputStream inputStream = httpUrlConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(
					inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);

			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			bufferedReader.close();
			inputStreamReader.close();

			inputStream.close();
			inputStream = null;
			httpUrlConn.disconnect();
			jsonObject = JSONObject.fromObject(buffer.toString());
		} catch (ConnectException ce) {
			System.out.print("Weixin server connection timed out.");
		} catch (Exception e) {
			System.out.print("https request error:{}" + e.getMessage());
		}
		return jsonObject;
	}

	public static void saveHttpImage(String requestUrl, String requestMethod,
			String outputStr, File target) {
		try {
			URL url = new URL(requestUrl);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod(requestMethod);

			conn.setConnectTimeout(5000);

			InputStream inStream = conn.getInputStream();

			byte[] data = readInputStream(inStream);

			FileOutputStream outStream = new FileOutputStream(target);

			outStream.write(data);

			outStream.close();
		} catch (Exception e) {
		}
	}

	public static String encode(byte[] bstr) {
		return new BASE64Encoder().encode(bstr);
	}

	public static byte[] decode(String str) {
		byte[] bt = null;
		try {
			BASE64Decoder decoder = new BASE64Decoder();
			bt = decoder.decodeBuffer(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bt;
	}

	public static byte[] readInputStream(InputStream inStream) throws Exception {
		ByteArrayOutputStream outstream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = inStream.read(buffer)) != -1) {
			outstream.write(buffer, 0, len);
		}
		outstream.close();
		inStream.close();

		return outstream.toByteArray();
	}

	/**
	 * 上传多媒体文件到微信公众平台
	 *
	 * @param requestUrl
	 * 
	 * @param file
	 *            文件
	 * @param content_type
	 *            文件类型
	 * @return 返回的字符串
	 * @throws Exception
	 */
	public static JSONObject uploadMediaFile(String requestUrl, File file,
			String content_type) {

		JSONObject jsonObject = null;
		StringBuffer bufferStr = new StringBuffer();
		String end = "\r\n";
		String twoHyphens = "--"; // 用于拼接
		String boundary = "*****"; // 用于拼接 可自定义
		URL submit = null;
		DataOutputStream dos = null;
