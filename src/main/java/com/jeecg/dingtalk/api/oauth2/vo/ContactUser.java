package com.jeecg.dingtalk.api.oauth2.vo;

/**
 * 获取用户通讯录个人信息，返回用户信息
 *
 * @author sunjianlei
 */
public class ContactUser {

    //  用户的钉钉昵称。
    private String nick;
    // 头像URL。
    private String avatarUrl;
    // 用户的手机号。
    // 说明 如果要获取用户手机号，需要在开发者后台申请个人手机号信息权限
    private String mobile;
    //  用户的openId。
    private String openId;
    // 用户的unionId。
    private String unionId;
    //  用户的个人邮箱。
    private String email;
    //  手机号对应的国家号。
    private String stateCode;

    public String getNick() {
        return nick;
    }

    public ContactUser setNick(String nick) {
        this.nick = nick;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public ContactUser setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public ContactUser setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public ContactUser setOpenId(String openId) {
        this.openId = openId;
        return this;
    }

    public String getUnionId() {
        return unionId;
    }

    public ContactUser setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContactUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getStateCode() {
        return stateCode;
    }

    public ContactUser setStateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }
}
