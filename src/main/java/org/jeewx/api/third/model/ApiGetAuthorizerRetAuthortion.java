package org.jeewx.api.third.model;

import java.util.List;
/**
 * 授权第三方相关信息
 */
public class ApiGetAuthorizerRetAuthortion {
	//授权方appid
	private String appid; 
	//公众号授权给开发者的权限集列表（请注意，当出现用户已经将消息与菜单权限集授权给了某个第三方，再授权给另一个第三方时，由于该权限集是互斥的，后一个第三方的授权将去除此权限集，开发者可以在返回的func_info信息中验证这一点，避免信息遗漏），1到13分别代表
	private List<ApiGetAuthorizerRetAuthortionFunc> func_info;
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public List<ApiGetAuthorizerRetAuthortionFunc> getFunc_info() {
		return func_info;
	}
	public void setFunc_info(List<ApiGetAuthorizerRetAuthortionFunc> func_info) {
		this.func_info = func_info;
	}
	
}
