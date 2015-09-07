package org.jeewx.api.third.model;
/**
 * 授权方的账户信息实体
 */
public class ApiGetAuthorizerRetAuthorizer {
	//昵称
	private String nick_name ;
	//头像
	private String head_img; 
	//授权方公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号
	private ApiGetAuthorizerRetAuthorizerSType service_type_info;
	//授权方认证类型，-1代表未认证，0代表微信认证，1代表新浪微博认证，2代表腾讯微博认证，3代表已资质认证通过但还未通过名称认证，4代表已资质认证通过、还未通过名称认证，但通过了新浪微博认证，5代表已资质认证通过、还未通过名称认证，但通过了腾讯微博认证
	private ApiGetAuthorizerRetAuthorizerVType verify_type_info;
	//授权方公众号的原始ID
	private String user_name;
	//授权方公众号所设置的微信号，可能为空
	private String alias;
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getHead_img() {
		return head_img;
	}
	public void setHead_img(String head_img) {
		this.head_img = head_img;
	}

	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public ApiGetAuthorizerRetAuthorizerSType getService_type_info() {
		return service_type_info;
	}
	public void setService_type_info(
			ApiGetAuthorizerRetAuthorizerSType service_type_info) {
		this.service_type_info = service_type_info;
	}
	public ApiGetAuthorizerRetAuthorizerVType getVerify_type_info() {
		return verify_type_info;
	}
	public void setVerify_type_info(
			ApiGetAuthorizerRetAuthorizerVType verify_type_info) {
		this.verify_type_info = verify_type_info;
	}
	
}
