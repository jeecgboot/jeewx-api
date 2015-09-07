package org.jeewx.api.wxsendmsg.model;

import java.util.Date;

/**
 * 上传到微信的媒体资源文件bean
 * 
 * @author LIAIJUN
 * 
 */
public class WxMediaResponse {
	// {"type":"TYPE","media_id":"MEDIA_ID","created_at":123456789}
	/** 媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb） */
	private String type;
	/** 媒体资源ID */
	private String media_id;
	/** 创建时间 */
	private Date created_at;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "WxMediaResponse [type=" + type + ", media_id=" + media_id + ", created_at=" + created_at + "]";
	}

}
