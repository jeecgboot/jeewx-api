package org.jeewx.api.coupon.location.model;

import java.util.List;

public class CardInfoRtn {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	//卡券ID
	private String card_id;
	
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
	public String getCard_id() {
		return card_id;
	}
	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}
	
	
}
