package org.jeewx.api.mp;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.mp.aes.WXBizMsgCrypt;
import org.jeewx.api.wxaccount.model.WxQrcode;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
	/**
	 * 微信--消息加解密接入
	 * @author lihongxuan
	 * 
	 * 提供接收和推送给公众平台消息的加解密接口(UTF8编码的字符串).
	 * <ol>
	 * 	<li>第三方回复加密消息给公众平台</li>
	 * 	<li>第三方收到公众平台发送的消息，验证消息的安全性，并对消息进行解密。</li>
	 * </ol>
	 * 说明：异常java.security.InvalidKeyException:illegal Key Size的解决方案
	 * <ol>
	 * 	<li>在官方网站下载JCE无限制权限策略文件（JDK7的下载地址：
	 *      http://www.oracle.com/technetwork/java/javase/downloads/jce-7-download-432124.html</li>
	 * 	<li>下载后解压，可以看到local_policy.jar和US_export_policy.jar以及readme.txt</li>
	 * 	<li>如果安装了JRE，将两个jar文件放到%JRE_HOME%\lib\security目录下覆盖原来的文件</li>
	 * 	<li>如果安装了JDK，将两个jar文件放到%JDK_HOME%\jre\lib\security目录下覆盖原来文件</li>
	 * </ol>
	 */
	public class JwMpAPI {
		/**
		 * 随机串，可以自己生成，也可以用URL参数的nonce
		 */
		public static String nonce = "xxxxxx";
		/**
		 *  时间戳，可以自己生成，也可以用URL参数的timestamp
		 */
		public static String timestamp = "1409304348";
		
		
		/*
		 *@param token: 第三方平台申请时填写的接收消息的校验token
		 *@param encodingAesKey: 公众号第三方平台的 EncodingAESKey（申请公众号第三方平台时填写的接收消息的加密symmetric_key）
		 *@param appId: 公众号第三方平台的appid
		 *@param replyMsg: 公众号待回复用户的消息，xml格式的字符串
		 */
		public static String miwen(String token, String encodingAesKey,
				String appId, String replyMsg) throws Exception {
			WXBizMsgCrypt pc = new WXBizMsgCrypt(token, encodingAesKey, appId);
			String mingwen = pc.encryptMsg(replyMsg, timestamp, nonce);
			return mingwen;
		}
		
		/*
		 *@param minwen: 秘文
		 *@param token: 第三方平台申请时填写的接收消息的校验token
		 *@param encodingAesKey: 公众号第三方平台的 EncodingAESKey（申请公众号第三方平台时填写的接收消息的加密symmetric_key）
		 *@param appId: 公众号第三方平台的appid
		 *@param replyMsg: 解密后的明文，当return返回0时有效
		*/
		public static String mingwen(String miwen,String token, String encodingAesKey,String appId) throws Exception{
			WXBizMsgCrypt pc = new WXBizMsgCrypt(token, encodingAesKey, appId);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			StringReader sr = new StringReader(miwen);
			InputSource is = new InputSource(sr);
			Document document = db.parse(is);
			Element root = document.getDocumentElement();
			NodeList nodelist1 = root.getElementsByTagName("Encrypt");
			NodeList nodelist2 = root.getElementsByTagName("MsgSignature");
			String encrypt = nodelist1.item(0).getTextContent();
			String msgSignature = nodelist2.item(0).getTextContent();
			String format = "<xml>" +
					"<ToUserName><![CDATA[toUser]]></ToUserName>" +
					"<Encrypt><![CDATA[%1$s]]></Encrypt>" +
					"</xml>";
			String fromXML = String.format(format, encrypt);
			String result2 = pc.decryptMsg(msgSignature, timestamp, nonce, fromXML);
			return result2;
		}
		
		public static void main(String[] args) throws Exception {
			
			String encodingAesKey = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFG";
			 String token = "pamtest";
			 String appId = "wxb11529c136998cb6";
			 String replyMsg = " 中文" +
					"<xml>" +
					"<ToUserName><![CDATA[oia2TjjewbmiOUlr6X-1crbLOvLw]]></ToUserName>" +
					"<FromUserName><![CDATA[gh_7f083739789a]]></FromUserName>" +
					"<CreateTime>1407743423</CreateTime>" +
					"<MsgType><![CDATA[video]]></MsgType>" +
					"<Video>" +
					"<MediaId><![CDATA[eYJ1MbwPRJtOvIEabaxHs7TX2D-HV71s79GUxqdUkjm6Gs2Ed1KF3ulAOA9H1xG0]]></MediaId>" +
					"<Title><![CDATA[testCallBackReplyVideo]]></Title>" +
					"<Description><![CDATA[testCallBackReplyVideo]]></Description>" +
					"</Video>" +
					"</xml>";
			String mingwen = JwMpAPI.miwen(token, encodingAesKey, appId, replyMsg);
			System.out.println("mingwen: " + mingwen);
			String miwen =JwMpAPI.mingwen(mingwen, token, encodingAesKey, appId);
			System.out.println("miwen: " + miwen);
			
		}
	}
