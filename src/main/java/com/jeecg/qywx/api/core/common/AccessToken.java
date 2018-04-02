package com.jeecg.qywx.api.core.common;

/** 
 * 微信通用接口凭证 
 *  
 * @author zhoujf
 * @date 2016-04-05
 */  
public class AccessToken {  
    // 获取到的凭证  
    private String accesstoken;  
    // 凭证有效时间，单位：秒  
    private int expiresIn;  
  
    public String getAccesstoken() {
		return accesstoken;
	}

	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}

	public int getExpiresIn() {  
        return expiresIn;  
    }  
  
    public void setExpiresIn(int expiresIn) {  
        this.expiresIn = expiresIn;  
    }

	public String toString() {
		return "AccessToken [accesstoken=" + accesstoken + ", expiresIn="
				+ expiresIn + "]";
	}

	
    
}  