package org.jeewx.api.wxbase.wxmedia.model;

import java.util.Date;

/**
 * 上传到微信的媒体资源文件bean
 * 
 * @author lihongxuan
 * 
 */
public class WxMediaForMaterialResponse {
	/** 新增的图片素材的图片URL */
	private String url;
	/** 媒体资源ID */
	private String media_id;
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	
	@Override
	public String toString() {
		return "WxMediaResponse [url=" + url + ", media_id=" + media_id +  "]";
	}

}
