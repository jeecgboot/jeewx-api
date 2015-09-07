package org.jeewx.api.coupon.qrcode.model;

public class GetticketRtn {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	//api_ticket，签名中所需凭证
	private String ticket;
	//有效时间
	private String expires_in;
	
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
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	
	
}
