package org.jeewx.api.third.model;

public class ReOpenAccessToken {

   /**
	* access_token	接口调用凭证
	* expires_in	access_token接口调用凭证超时时间，单位（秒）
	* refresh_token	用户刷新access_token
	* openid	授权用户唯一标识
	* scope	用户授权的作用域，使用逗号（,）分隔
    */
	private String access_token;
	private String expires_in;
	private String refresh_token;
	private String openid;
	private String scope;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
}
