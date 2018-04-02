package com.jeecg.alipay.api.base.vo.SendMessageImageTextOneVo;

public class Articles {
	
	private String actionName;  //链接文字
	private String desc;        //图文消息内容
	private String imageUrl;    // 图片链接，对于多条图文消息的第一条消息，该字段不能为空
	private String title;       // 图文消息标题
	private String url;         // 点击图文消息跳转的链接
	
	
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	
}
