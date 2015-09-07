package org.jeewx.api.wxuser.user.model;


/**   
 * @Title: Entity
 * @Description: 微信服务号关注用户union信息
 * @author onlineGenerator
 * @date 2015-01-25 19:28:24
 * @version V1.0   
 *
 */
public class Wxuser {
	
	/**用户是否订阅*/
	private java.lang.Integer subscribe;
	/**用户的标识*/
	private java.lang.String openid;
	/**用户的昵称*/
	private java.lang.String nickname;
	/**性别*/
	private java.lang.String sex;
	/**用户所在城市*/
	private java.lang.String city;
	/**用户所在国家*/
	private java.lang.String country;
	/**用户所在省份*/
	private java.lang.String province;
	/**用户的语言zh_CN*/
	private java.lang.String language;
	/**用户头像*/
	private java.lang.String headimgurl;
	/**用户关注时间*/
	private java.lang.String subscribe_time;
	/**公众号*/
	private java.lang.String unionid;
	
	private String remark;
	
	public java.lang.Integer getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(java.lang.Integer subscribe) {
		this.subscribe = subscribe;
	}
	public java.lang.String getOpenid() {
		return openid;
	}
	public void setOpenid(java.lang.String openid) {
		this.openid = openid;
	}
	public java.lang.String getNickname() {
		return nickname;
	}
	public void setNickname(java.lang.String nickname) {
		this.nickname = nickname;
	}
	public java.lang.String getSex() {
		return sex;
	}
	public void setSex(java.lang.String sex) {
		this.sex = sex;
	}
	public java.lang.String getCity() {
		return city;
	}
	public void setCity(java.lang.String city) {
		this.city = city;
	}
	public java.lang.String getCountry() {
		return country;
	}
	public void setCountry(java.lang.String country) {
		this.country = country;
	}
	public java.lang.String getProvince() {
		return province;
	}
	public void setProvince(java.lang.String province) {
		this.province = province;
	}
	public java.lang.String getLanguage() {
		return language;
	}
	public void setLanguage(java.lang.String language) {
		this.language = language;
	}
	public java.lang.String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(java.lang.String headimgurl) {
		this.headimgurl = headimgurl;
	}
	
	public java.lang.String getSubscribe_time() {
		return subscribe_time;
	}
	public void setSubscribe_time(java.lang.String subscribe_time) {
		this.subscribe_time = subscribe_time;
	}
	public java.lang.String getUnionid() {
		return unionid;
	}
	public void setUnionid(java.lang.String unionid) {
		this.unionid = unionid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
