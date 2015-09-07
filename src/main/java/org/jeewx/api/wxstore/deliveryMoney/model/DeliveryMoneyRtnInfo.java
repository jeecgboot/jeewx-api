package org.jeewx.api.wxstore.deliveryMoney.model;

public class DeliveryMoneyRtnInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 邮费模板ID
	private Integer template_id;
	
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public Integer getTemplate_id() {
		return template_id;
	}
	public void setTemplate_id(Integer template_id) {
		this.template_id = template_id;
	}
}
