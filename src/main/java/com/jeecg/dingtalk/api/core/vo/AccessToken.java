package com.jeecg.dingtalk.api.core.vo;

/**
 * 钉钉应用AccessToken
 *
 * @author sunjianlei
 */
public class AccessToken {

    /**
     * 获取到的accessToken
     */
    private String accessToken;

    /**
     * accessToken有效时间，单位：秒
     */
    private int expiresIn;

    public AccessToken(String accessToken, int expiresIn) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public String toString() {
        return "AccessToken [accessToken=" + accessToken + ", expiresIn=" + expiresIn + "]";
    }

}  