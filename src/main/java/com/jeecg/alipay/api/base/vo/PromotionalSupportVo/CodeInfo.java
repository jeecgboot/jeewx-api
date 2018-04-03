package com.jeecg.alipay.api.base.vo.PromotionalSupportVo;

public class CodeInfo {

	private Scene scene; //场景Id，最长32位，英文字母、数字以及下划线，开发者自定义
	//update-begin--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
	private String gotoUrl;//跳转URL，扫码关注服务窗后会直接跳转到此URL
	//update-end--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
	//update-begin--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
	public String getGotoUrl() {
		return gotoUrl;
	}

	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}
	//update-end--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
	
}
