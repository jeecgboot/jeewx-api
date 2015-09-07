package org.jeewx.api.coupon.qrcode.model;

public class QrcodeRtnInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	//获取的二维码ticket，凭借此ticket 可以在有效时间内换取二维码。
	private String ticket;
	
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
	
}
