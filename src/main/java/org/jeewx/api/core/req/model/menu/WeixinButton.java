package org.jeewx.api.core.req.model.menu;

import java.util.List;

public class WeixinButton {

	private String type;
	
	private String name;
	
	private String key;
	
	private String url;
	
	private String appid;
	
	private String pagepath;
	
	private List<WeixinButton> sub_button;

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

	public List<WeixinButton> getSub_button() {
		return sub_button;
	}

	public void setSub_button(List<WeixinButton> sub_button) {
		this.sub_button = sub_button;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getPagepath() {
		return pagepath;
	}

	public void setPagepath(String pagepath) {
		this.pagepath = pagepath;
	}
}
