package com.jeecg.alipay.api.base.vo.SendMessageImageTextMoreVo;

import java.util.List;

import com.jeecg.alipay.api.base.vo.SendMessageImageTextOneVo.Articles;

public class SendMessageImageTextMore {

	private String msgType;//消息类型，image
	private List<Articles> articles;
	
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
