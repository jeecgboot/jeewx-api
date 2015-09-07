package org.jeewx.api.wxsendmsg.model;
/**
 * 图文消息（用于"获取自定义菜单配置接口"和"获取自动回复规则"）
 * @author luobaoli
 *
 */
public class WxArticleConfig {

	/** 图文消息缩略图的media_id */
	private String thumb_media_id;
	/** 图文消息的标题 */
	private String title;
	/** 图文消息的作者 */
	private String author;
	/** 图文消息的摘要 */
	private String digest;
	/** 自动回复的类型。关注后自动回复和消息自动回复的类型仅支持文本（text）、图片（img）、语音（voice）、视频（video），关键词自动回复则还多了图文消息（news）*/
	private String type;
	/** 是否显示封面，1为显示，0为不显示 */
	private String show_cover;
	/** 封面图片的URL*/
	private String cover_ur;
	/** 正文的URL*/
	private String content_url;
	/** 原文的URL，若置空则无查看原文入口*/
	private String source_url;
	private String content;//预留
	private String fileName;//预留
	private String filePath;//预留
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDigest() {
		return digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}
	public String getShow_cover() {
		return show_cover;
	}
	public void setShow_cover(String show_cover) {
		this.show_cover = show_cover;
	}
	public String getCover_ur() {
		return cover_ur;
	}
	public void setCover_ur(String cover_ur) {
		this.cover_ur = cover_ur;
	}
	public String getContent_url() {
		return content_url;
	}
	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}
	public String getSource_url() {
		return source_url;
	}
	public void setSource_url(String source_url) {
		this.source_url = source_url;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
