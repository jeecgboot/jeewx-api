package org.jeewx.api.wxsendmsg.model.auto;

public class AutoReplyInfo {
	/** 自动回复的类型。关注后自动回复和消息自动回复的类型仅支持文本（text）、图片（img）、语音（voice）、视频（video），关键词自动回复则还多了图文消息（news） */
	private String type;
	/** 对于文本类型，content是文本内容，对于图文、图片、语音、视频类型，content是mediaID */
	private String content;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
