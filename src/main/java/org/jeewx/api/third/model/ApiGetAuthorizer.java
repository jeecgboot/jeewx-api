package org.jeewx.api.third.model;
/**
 * 获取授权方的账户信息 参数实体
 *
 */
public class ApiGetAuthorizer {
	//第三方平台appid
	private String component_appid;  
	//授权方appid
	private String authorizer_appid;
	
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
	
}
