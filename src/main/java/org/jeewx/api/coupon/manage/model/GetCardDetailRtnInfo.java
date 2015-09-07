package org.jeewx.api.coupon.manage.model;

public class GetCardDetailRtnInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 卡券详细信息
	private Card card;

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

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
