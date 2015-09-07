package org.jeewx.api.coupon.location.model;

public class LocationRtnInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 错误信息
	private UrlInfo url;
	
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
	public UrlInfo getUrl() {
		return url;
	}
	public void setUrl(UrlInfo url) {
		this.url = url;
	}
	
}
