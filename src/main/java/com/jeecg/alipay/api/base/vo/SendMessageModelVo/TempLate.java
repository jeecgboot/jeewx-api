package com.jeecg.alipay.api.base.vo.SendMessageModelVo;

public class TempLate {

	private String templateId;//消息模板ID
	private ConText context;//消息模板上下文，即模板中定义的参数及参数值
	
	
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public ConText getContext() {
		return context;
	}
	public void setContext(ConText context) {
		this.context = context;
	}
	
	
}
