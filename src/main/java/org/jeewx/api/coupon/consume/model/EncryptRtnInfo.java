package org.jeewx.api.coupon.consume.model;

public class EncryptRtnInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 卡券真实序列号
	private String code;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
