package org.jeewx.api.core.req.model.menu.config;

import java.util.List;

import org.jeewx.api.wxsendmsg.model.WxArticleConfig;

public class WeixinButtonExtend{

private String type;
	
	private String name;
	
	private String key;
	
	private String url;
	
	private String value;
	
	private List<WeixinButtonExtend> sub_button;
	
	private List<WxArticleConfig> news_info;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<WeixinButtonExtend> getSub_button() {
		return sub_button;
	}

	public void setSub_button(List<WeixinButtonExtend> sub_button) {
		this.sub_button = sub_button;
	}

	public List<WxArticleConfig> getNews_info() {
		return news_info;
	}

	public void setNews_info(List<WxArticleConfig> news_info) {
		this.news_info = news_info;
	}
}
