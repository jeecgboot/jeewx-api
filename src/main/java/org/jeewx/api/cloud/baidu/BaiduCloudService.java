package org.jeewx.api.cloud.baidu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.jeewx.api.cloud.baidu.model.BaiduCloud;

import com.baidu.inf.iis.bcs.BaiduBCS;
import com.baidu.inf.iis.bcs.auth.BCSCredentials;
import com.baidu.inf.iis.bcs.http.HttpMethodName;
import com.baidu.inf.iis.bcs.model.ObjectMetadata;
import com.baidu.inf.iis.bcs.request.GenerateUrlRequest;
import com.baidu.inf.iis.bcs.request.PutObjectRequest;


public class BaiduCloudService {
	
	private static Logger logger = Logger.getLogger(BaiduCloudService.class);
	
	public static void main(String[] args) throws Exception {
		 String host = "bcs.duapp.com";
		 String accessKey = "y8YEATsG8L8GbGa8vx7WGA6u";
		 String secretKey = "PObREaN0siRlVeAGUaDSFkaTNGOT3cna";
		 String bucket = "bucket-2015-1";
		 String object = "/test1.jpg";
		 BaiduCloud bc = new BaiduCloud();
		 bc.setHost(host);
		 bc.setAccessKey(accessKey);
		 bc.setSecretKey(secretKey);
		 bc.setBucket(bucket);
		 bc.setObject(object);
		 bc.setFilePathName("E:\\logo.jpg");
		 putObjectByInputStream(bc);
		 generateUrl(bc);
	} 
	
	/**
	 * 向百度云服务器 上传资料
	 */
	public static ObjectMetadata putObjectByInputStream(BaiduCloud bc) throws FileNotFoundException {
		BCSCredentials credentials = new BCSCredentials(bc.getAccessKey(), bc.getSecretKey());
		BaiduBCS baiduBCS = new BaiduBCS(credentials, bc.getHost());
		baiduBCS.setDefaultEncoding("UTF-8"); // Default UTF-8
		File file=new File(bc.getFilePathName()); 
		InputStream fileContent = new FileInputStream(file);
		ObjectMetadata objectMetadata = new ObjectMetadata();
		String fileName = bc.getFilePathName();
		String extName = fileName.substring(fileName.lastIndexOf(".") + 1);//扩展名
		/*String contentType = WeiXinReqUtil.getFileContentType(extName);
		if(contentType == null){
			logger.error("没有找到对应的文件类型");
		}*/
		objectMetadata.setContentType("image/jpeg");
		objectMetadata.setContentLength(file.length());
		PutObjectRequest request = new PutObjectRequest(bc.getBucket(), bc.getObject(), fileContent, objectMetadata);
		ObjectMetadata result = baiduBCS.putObject(request).getResult();
		System.out.println("result:"+result);
		return result;
	}
	
	/**
	 * 获得上传资料的url 
	 * @return url
	 */
	public static String generateUrl(BaiduCloud bc) {
		BCSCredentials credentials = new BCSCredentials(bc.getAccessKey(), bc.getSecretKey());
		BaiduBCS baiduBCS = new BaiduBCS(credentials, bc.getHost());
		baiduBCS.setDefaultEncoding("UTF-8"); // Default UTF-8
		GenerateUrlRequest generateUrlRequest = new GenerateUrlRequest(HttpMethodName.GET, bc.getBucket(), bc.getObject());
		System.out.println(baiduBCS.generateUrl(generateUrlRequest));
		return (String)baiduBCS.generateUrl(generateUrlRequest);
	}


}