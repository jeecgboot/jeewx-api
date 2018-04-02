 package com.jeecg.qywx.api.menu.vo;

 /** 
  * 按钮的基类 
  *  
  * @author zhoujf
  * @date 2016-04-05
  */  
 public class Button {  
     private String name;  
   
     public String getName() {  
         return name;  
     }  
   
     public void setName(String name) {  
         this.name = name;  
     }

	@Override
	public String toString() {
		return "Button [name=" + name + "]";
	}  
     
     
 }  