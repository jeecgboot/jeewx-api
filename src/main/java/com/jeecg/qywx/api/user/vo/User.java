package com.jeecg.qywx.api.user.vo;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
/**
 * 
 * @author Yqj
 * 企业微信--user
 *
 */
public class User {
	private String userid;//成员UserID。对应管理端的帐号，企业内必须唯一。长度为1~64个字节 
	private String name;//成员名称。长度为1~64个字节 
	private Integer[] department;//成员所属部门id列表 
	private String position;//职位信息。长度为0~64个字节
	private String mobile;//手机号码。企业内必须唯一，mobile/weixinid/email三者不能同时为空  创建时必须要
	private String gender;//性别。1表示男性，2表示女性
	private String email;//邮箱。长度为0~64个字节。企业内必须唯一 
	private String weixinid;//微信号。企业内必须唯一。（注意：是微信号，不是微信的名字）
	
//	@JSONField(serialize=false)
	private Integer enable;//启用/禁用成员。1表示启用成员，0表示禁用成员 
	private String avatar_mediaid;//成员头像的mediaid，通过多媒体接口上传图片获得的mediaid
	
//	@JSONField(serialize=false)
	private String avatar;//头像url。注：如果要获取小图将url最后的"/0"改成"/64"即可   创建的时候不需要这个字段 也可以使用transient来取消序列化
//	@JSONField(serialize=false)
	private Integer status;//关注状态 1=已关注，2=已禁用，4=未关注   创建的时候不需要这个字段 也可以使用transient来取消序列化
	
	private JSONObject extattr;//扩展属性。扩展属性需要在WEB管理端创建后才生效，否则忽略未知属性的赋值
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer[] getDepartment() {
		return department;
	}
	public void setDepartment(Integer[] department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeixinid() {
		return weixinid;
	}
	public void setWeixinid(String weixinid) {
		this.weixinid = weixinid;
	}
	public Integer getEnable() {
		return enable;
	}
	public void setEnable(Integer enable) {
		this.enable = enable;
	}
	public String getAvatar_mediaid() {
		return avatar_mediaid;
	}
	public void setAvatar_mediaid(String avatar_mediaid) {
		this.avatar_mediaid = avatar_mediaid;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public JSONObject getExtattr() {
		return extattr;
	}
	public void setExtattr(JSONObject extattr) {
		this.extattr = extattr;
	}
	
	
}
