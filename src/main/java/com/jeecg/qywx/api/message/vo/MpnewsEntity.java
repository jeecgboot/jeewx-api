package com.jeecg.qywx.api.message.vo;

public class MpnewsEntity {
private MpnewsArticles[] articles;//图文消息，一个图文消息支持1到8个图文

public MpnewsArticles[] getArticles() {
	return articles;
}

public void setArticles(MpnewsArticles[] articles) {
	this.articles = articles;
}


}
