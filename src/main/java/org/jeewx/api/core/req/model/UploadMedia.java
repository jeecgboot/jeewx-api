package org.jeewx.api.core.req.model;

import org.jeewx.api.core.annotation.ReqType;

/**
 * 公众号可调用本接口来上传图片、语音、视频等文件到微信服务器，
 * 上传后服务器会返回对应的media_id，公众号此后可根据该media_id来获取多媒体
 * @author sfli.sir
 *
 */
@ReqType("mediaUpload")
public class UploadMedia extends WeixinReqParam {

	/**
	 * 媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb）
	 */
	private String type;
	/**
	 * 上传的文件路径，带文件名称
	 */
	private String filePathName;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFilePathName() {
		return filePathName;
	}

	public void setFilePathName(String filePathName) {
		this.filePathName = filePathName;
	}
	
	
}
