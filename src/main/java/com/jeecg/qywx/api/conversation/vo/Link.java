package com.jeecg.qywx.api.conversation.vo;

public class Link {
	
	private String title;
	private String description;
	private String url;
	private String thumb_media_id;

	public Link(String title, String description, String url, String thumb_media_id) {
		this.title = title;
		this.description = description;
		this.url = url;
		this.thumb_media_id = thumb_media_id;
	}

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

	public String getThumb_media_id() {
		return thumb_media_id;
	}

	public void setThumb_media_id(String thumb_media_id) {
		this.thumb_media_id = thumb_media_id;
	}
	
	

}
