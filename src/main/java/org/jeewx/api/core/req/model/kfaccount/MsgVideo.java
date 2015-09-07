package org.jeewx.api.core.req.model.kfaccount;


/**
 * 取多媒体文件
 * 
 * @author sfli.sir
 * 
 */
public class MsgVideo {

	private String media_id;
	
	private String thumb_media_id;
	
	private String title;
	
	private String description;

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	public String getThumb_media_id() {
		return thumb_media_id;
	}

	public void setThumb_media_id(String thumb_media_id) {
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
	
	
	
}
