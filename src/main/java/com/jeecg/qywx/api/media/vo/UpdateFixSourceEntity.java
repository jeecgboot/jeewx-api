package com.jeecg.qywx.api.media.vo;

public class UpdateFixSourceEntity {
	private  UpdateFixSourceArticles[] articles;//	图文消息，一个图文消息支持1到10个图文

	public UpdateFixSourceArticles[] getArticles() {
		return articles;
	}

	public void setArticles(UpdateFixSourceArticles[] articles) {
		this.articles = articles;
	}
}
