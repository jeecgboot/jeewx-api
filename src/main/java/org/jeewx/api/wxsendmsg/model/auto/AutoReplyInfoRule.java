package org.jeewx.api.wxsendmsg.model.auto;

import java.util.List;

/**
 * 自动回复规则配置
 * @author superuser
 *
 */
public class AutoReplyInfoRule {
	/** 关注后自动回复是否开启，0代表未开启，1代表开启 */
	private String is_add_friend_reply_open;
	/** 消息自动回复是否开启，0代表未开启，1代表开启 */
	private String is_autoreply_open;
	/** 关注后自动回复的信息 */
	private AutoReplyInfo add_friend_autoreply_info;
	/** 消息自动回复的信息 */
	private AutoReplyInfo message_default_autoreply_info;
	/** 关键词自动回复的信息 */
	private List<KeyWordAutoReplyInfo> keyword_autoreply_info;
	public String getIs_add_friend_reply_open() {
		return is_add_friend_reply_open;
	}
	public void setIs_add_friend_reply_open(String is_add_friend_reply_open) {
		this.is_add_friend_reply_open = is_add_friend_reply_open;
	}
	public String getIs_autoreply_open() {
		return is_autoreply_open;
	}
	public void setIs_autoreply_open(String is_autoreply_open) {
		this.is_autoreply_open = is_autoreply_open;
	}
	public AutoReplyInfo getAdd_friend_autoreply_info() {
		return add_friend_autoreply_info;
	}
	public void setAdd_friend_autoreply_info(AutoReplyInfo add_friend_autoreply_info) {
		this.add_friend_autoreply_info = add_friend_autoreply_info;
	}
	public AutoReplyInfo getMessage_default_autoreply_info() {
		return message_default_autoreply_info;
	}
	public void setMessage_default_autoreply_info(
			AutoReplyInfo message_default_autoreply_info) {
		this.message_default_autoreply_info = message_default_autoreply_info;
	}
	public List<KeyWordAutoReplyInfo> getKeyword_autoreply_info() {
		return keyword_autoreply_info;
	}
	public void setKeyword_autoreply_info(List<KeyWordAutoReplyInfo> keyword_autoreply_info) {
		this.keyword_autoreply_info = keyword_autoreply_info;
	}
}
