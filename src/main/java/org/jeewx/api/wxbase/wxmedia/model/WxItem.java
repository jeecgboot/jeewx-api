package org.jeewx.api.wxbase.wxmedia.model;

import org.jeewx.api.wxsendmsg.model.WxArticle;

/**
 * 图文消息图文消息
 * @author lihongxuan	
 *
 */
public class WxItem {

	/** 媒体id */
	private String media_id;
	/** 图文消息的作者 */
	private WxArticle content;
	/** 文件名称 */
	private String name;
	/** 这篇图文消息素材的最后更新时间 */
	private String update_time;
	/** 图文页的URL，或者，当获取的列表是图片素材列表时，该字段是图片的URL */
	private String url;
	
	
	public String getMedia_id() {
		return media_id;
	}


	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}


	public WxArticle getContent() {
		return content;
	}


	public void setContent(WxArticle content) {
		this.content = content;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUpdate_time() {
		return update_time;
	}


	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "WxArticle [media_id=" + media_id + ", content=" + content + ", name=" + name + ", update_time=" + update_time + ", content=" + content + ", url=" + url + "]";
	}

	 

}
