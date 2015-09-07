package org.jeewx.api.core.req.model.kfaccount;


/**
 * 取多媒体文件
 * 
 * @author sfli.sir
 * 
 */
public class MsgArticles {

	private String title;
	
	private String description;
	
	private String url;
	
	private String picurl;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

}
