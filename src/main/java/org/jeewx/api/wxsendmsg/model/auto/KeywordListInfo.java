package org.jeewx.api.wxsendmsg.model.auto;

public class KeywordListInfo extends AutoReplyInfo{
	/** 匹配模式，contain代表消息中含有该关键词即可，equal表示消息内容必须和关键词严格相同 */
	private String match_mode;

	public String getMatch_mode() {
		return match_mode;
	}

	public void setMatch_mode(String match_mode) {
		this.match_mode = match_mode;
	}
}
