package org.jeewx.api.core.req.model;

/**
 * 微信请求父类
 * @author sfli.sir
 *
 */
public class WeixinReqParam {

	/**
	 * 微信获取信息令牌
	 */
	private String access_token;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

}
