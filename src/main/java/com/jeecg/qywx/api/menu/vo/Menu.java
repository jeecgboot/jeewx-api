package com.jeecg.qywx.api.menu.vo;

import java.util.Arrays;


/** 
 * 菜单 
 *  
 *@author zhoujf
 *@date 2016-04-05
 */  
public class Menu {  
    private Button[] button;  
  
    public Button[] getButton() {  
        return button;  
    }  
  
    public void setButton(Button[] button) {  
        this.button = button;  
    }

	@Override
	public String toString() {
		return "Menu [button=" + Arrays.toString(button) + "]";
	}  
    
    
}  

