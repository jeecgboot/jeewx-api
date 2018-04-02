package com.jeecg.qywx.api.menu.vo;


/** 
 * 普通按钮（子按钮） 
 *  
 * @author zhoujf
 * @date 2016-04-05
 */  
public class CommonButton extends Button {  
    private String type;  
    private String key;  
    private String url;  
  
    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {  
        return type;  
    }  
  
    public void setType(String type) {  
        this.type = type;  
    }  
  
    public String getKey() {  
        return key;  
    }  
  
    public void setKey(String key) {  
        this.key = key;  
    }

	@Override
	public String toString() {
		return "CommonButton [type=" + type + ", key=" + key + "]";
	}  
    
}  