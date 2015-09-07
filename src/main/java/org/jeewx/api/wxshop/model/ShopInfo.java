package org.jeewx.api.wxshop.model;

public class ShopInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	
	// 门店信息
	private Business business ;
	
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
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
	
}
