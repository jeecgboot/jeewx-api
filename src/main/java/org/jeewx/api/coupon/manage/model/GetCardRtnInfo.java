package org.jeewx.api.coupon.manage.model;

public class GetCardRtnInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 用户openid
	private String openid;
	// 卡券相关信息
	private GetCardRtnInfoCard card;

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

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public GetCardRtnInfoCard getCard() {
		return card;
	}

	public void setCard(GetCardRtnInfoCard card) {
		this.card = card;
	}

}
