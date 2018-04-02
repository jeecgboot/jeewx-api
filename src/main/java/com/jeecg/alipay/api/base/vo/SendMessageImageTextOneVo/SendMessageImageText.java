package com.jeecg.alipay.api.base.vo.SendMessageImageTextOneVo;

import java.util.List;

public class SendMessageImageText {
	
	private String toUserId;    //消息接收用户的userid
	private String msgType;     //消息类型，image-text
    private List<Articles> articles;  //图文消息子消息项集合，单条消息最多6个子项，否则会发送失败
    
	public String getToUserId() {
		return toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public List<Articles> getArticles() {
		return articles;
	}
	public void setArticles(List<Articles> articles) {
		this.articles = articles;
	}

	
}
