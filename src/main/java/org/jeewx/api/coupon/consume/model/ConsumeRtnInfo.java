package org.jeewx.api.coupon.consume.model;

public class ConsumeRtnInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 核销卡券信息仅包含card_id
	private ConsumeRtnInfoCard card;
	// 核销卡券所属用户id(用户和公众号之间的唯一标识)
	private String openid;

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

	public ConsumeRtnInfoCard getCard() {
		return card;
	}

	public void setCard(ConsumeRtnInfoCard card) {
		this.card = card;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

}
