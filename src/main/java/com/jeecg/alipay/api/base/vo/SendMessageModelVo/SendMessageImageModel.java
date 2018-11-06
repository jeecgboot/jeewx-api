package com.jeecg.alipay.api.base.vo.SendMessageModelVo;

public class SendMessageImageModel {

	private String toUserId;  //消息接收用户的userid
 
	private TempLate template;//消息模板相关参数，其中包括templateId模板ID和context模板上下文
 
	
	public String getToUserId() {
		return toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}
 
	public TempLate getTemplate() {
		return template;
	}
	public void setTemplate(TempLate template) {
		this.template = template;
	}
 
	
}
