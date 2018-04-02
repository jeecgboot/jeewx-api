package org.jeewx.api.wxbase.wxmedia.model;
/**
 * 图文消息
 * @author LIAIJUN
 *
 */
public class WxNewsArticle {

	/** 图文消息缩略图的media_id */
	private String thumb_media_id;
	/** 图文消息的作者 */
	private String author;
	/** 图文消息的标题 */
	private String title;
	/** 在图文消息页面点击“阅读原文”后的页面 */
	private String content_source_url;
	/** 图文消息页面的内容，支持HTML标签 */
	private String content;
	/** 图文消息的描述 */
	private String digest;
	/** 是否显示封面，1为显示，0为不显示 */
	private String show_cover_pic;
	/** 图片url*/
	private String thumb_url;
	/**url*/
	private String url;
	
	private String fileName;
	
	private String filePath;

	public String getThumb_media_id() {
		return thumb_media_id;
	}

	public void setThumb_media_id(String thumb_media_id) {
		this.thumb_media_id = thumb_media_id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent_source_url() {
		return content_source_url;
	}

	public void setContent_source_url(String content_source_url) {
		this.content_source_url = content_source_url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getShow_cover_pic() {
		return show_cover_pic;
	}

	public void setShow_cover_pic(String show_cover_pic) {
		this.show_cover_pic = show_cover_pic;
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

	
	public String getThumb_url() {
		return thumb_url;
	}

	public void setThumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}

	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WxArticle [thumb_media_id=");
		builder.append(thumb_media_id);
		builder.append(", author=");
		builder.append(author);
		builder.append(", title=");
		builder.append(title);
		builder.append(", content_source_url=");
		builder.append(content_source_url);
		builder.append(", content=");
		builder.append(content);
		builder.append(", digest=");
		builder.append(digest);
		builder.append(", show_cover_pic=");
		builder.append(show_cover_pic);
		builder.append(", thumb_url=");
		builder.append(thumb_url);
		builder.append(", url=");
		builder.append(url);
		builder.append(", fileName=");
		builder.append(fileName);
		builder.append(", filePath=");
		builder.append(filePath);
		builder.append("]");
		return builder.toString();
	}

}
