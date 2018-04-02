package com.jeecg.qywx.api.menu.vo;


/** 
 * view类型的菜单 
 *  
 * @author zhoujf
 * @date 2016-04-05
 */  
public class ViewButton extends Button {  
    private String type;  
    private String url;  
  
    public String getType() {  
        return type;  
    }  
  
    public void setType(String type) {  
        this.type = type;  
    }  
  
    public String getUrl() {  
        return url;  
    }  
  
    public void setUrl(String url) {  
        this.url = url;  
    }

	@Override
	public String toString() {
		return "ViewButton [type=" + type + ", url=" + url + "]";
	}  
    
}  