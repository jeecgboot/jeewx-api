package org.jeewx.api.wxsendmsg.model.auto;

import java.util.List;

/**
 * 关键字信息
 * @author superuser
 *
 */
public class KeyWordAutoReplyInfo {
	/** 规则名称 */
	private String rule_name;
	/** 创建时间 */
	private String create_time;
	/** 回复模式，reply_all代表全部回复，random_one代表随机回复其中一条 */
	private String reply_mode;
	/** 匹配的关键词列表 */
	private List<KeywordListInfo> keyword_list_info;
	/** 关键字回复内容 */
	private List<ReplyListInfo> reply_list_info;
	public String getRule_name() {
		return rule_name;
	}
	public void setRule_name(String rule_name) {
		this.rule_name = rule_name;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getReply_mode() {
		return reply_mode;
	}
	public void setReply_mode(String reply_mode) {
		this.reply_mode = reply_mode;
	}
	public List<KeywordListInfo> getKeyword_list_info() {
		return keyword_list_info;
	}
	public void setKeyword_list_info(List<KeywordListInfo> keyword_list_info) {
		this.keyword_list_info = keyword_list_info;
	}
	public List<ReplyListInfo> getReply_list_info() {
		return reply_list_info;
	}
	public void setReply_list_info(List<ReplyListInfo> reply_list_info) {
		this.reply_list_info = reply_list_info;
	}
}
