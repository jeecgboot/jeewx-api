package org.jeewx.api.cloud.baidu.model;

import org.jeewx.api.core.annotation.ReqType;


@ReqType("baidu_cloud")
public class BaiduCloud {

	//服务器url 
	private String host;
	//公钥
	private String accessKey;
	//密钥
	private String secretKey;
	//云存储bucket可以看成是命名空间
	private String bucket;
	//Object是BCS中的基本存储实体
	private String object;
	//保存对象的物理地址
	private String filePathName;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getAccessKey() {
		return accessKey;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public String getBucket() {
		return bucket;
	}
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getFilePathName() {
		return filePathName;
	}
	public void setFilePathName(String filePathName) {
		this.filePathName = filePathName;
	}
	
	
}
