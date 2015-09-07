package org.jeewx.api.third;
/**
 * 获取选项设置信息参数实体
 */
public class AuthorizerOption {
	//第三方平台appid
	private String component_appid;
	//授权公众号appid
	private String authorizer_appid;
	//选项名称
	private String option_name;
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
	public String getOption_name() {
		return option_name;
	}
	public void setOption_name(String option_name) {
		this.option_name = option_name;
	}
	
}
