package org.jeewx.api.cloud.qiniu.model;

import org.jeewx.api.core.annotation.ReqType;


@ReqType("qiniu_cloud")
public class QiniuCloud {

	//基本存储实体
	private String key;
	//保存对象的物理地址
	private String localFile;
	//公钥
	private String ak;
	//密钥
	private String sk;
	//云存储bucket可以看成是命名空间
	private String bucket="jeewxbucket";
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLocalFile() {
		return localFile;
	}
	public void setLocalFile(String localFile) {
		this.localFile = localFile;
	}
	public String getAk() {
		return ak;
	}
	public void setAk(String ak) {
		this.ak = ak;
	}
	public String getSk() {
		return sk;
	}
	public void setSk(String sk) {
		this.sk = sk;
	}
	public String getBucket() {
		return bucket;
	}
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	
	
	
}
