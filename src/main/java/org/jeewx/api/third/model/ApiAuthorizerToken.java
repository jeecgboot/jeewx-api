package org.jeewx.api.third.model;
/**
 * 获取（刷新）授权公众号的令牌 参数
 */
public class ApiAuthorizerToken {
	//第三方平台appid
	private String component_appid;  
	//授权方appid
	private String authorizer_appid;
	//授权方的刷新令牌
	private String authorizer_refresh_token;
	
	public String getComponent_appid() {
		return component_appid;
	}
	public void setComponent_appid(String component_appid) {
		this.component_appid = component_appid;
	}
	public String getAuthorizer_appid() {
		return authorizer_appid;
	}
	public void setAuthorizer_appid(String authorizer_appid) {
		this.authorizer_appid = authorizer_appid;
	}
	public String getAuthorizer_refresh_token() {
		return authorizer_refresh_token;
	}
	public void setAuthorizer_refresh_token(String authorizer_refresh_token) {
		this.authorizer_refresh_token = authorizer_refresh_token;
	}
	
}
