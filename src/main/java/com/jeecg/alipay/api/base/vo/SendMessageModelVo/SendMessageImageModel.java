package com.jeecg.alipay.api.base.vo.SendMessageModelVo;

public class SendMessageImageModel {

	private String toUserId;  //消息接收用户的userid
	//update-begin--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
	private TempLate template;//消息模板相关参数，其中包括templateId模板ID和context模板上下文
	//update-end--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
	
	public String getToUserId() {
		return toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}
	//update-begin--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
	public TempLate getTemplate() {
		return template;
	}
	public void setTemplate(TempLate template) {
		this.template = template;
	}
	//update-end--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
	
}
