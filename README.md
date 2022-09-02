JEEWX-API  微信开发SDK
===============

  
最新版本： 1.3.2（发布日期：20220902）
官网：[www.jeecg.com](http://www.jeecg.com) 



项目介绍
-----------------------------------
 JEEWX-API 是一款JAVA版的微信开发SDK，支持微信公众号、小程序、微信企业号、支付宝生活号SDK和微博SDK。你可以基于她，快速的傻瓜化的进行微信开发、支付窗和微博开发。
 基于jeewx-api开发，可以立即拥有简单易用的API，让开发更加轻松自如，节省更多时间。


技术交流
-----------------------------------
* 	技术论坛： www.jeecg.org
* 	快速文档： [http://jeewx-api.mydoc.io](http://jeewx-api.mydoc.io)
* 	API文档： [http://www.jeewx.com/jeewx-api](http://www.jeewx.com/jeewx-api)



Jeewx-Api 集成方法
-----------------------------------
### [1].maven 方式
    在pom.xml 添加jeewx-api 1.3依赖
    <dependency>
		<groupId>org.jeecgframework</groupId>
		<artifactId>jeewx-api</artifactId>
		<version>1.3.2</version>
	</dependency>
	
### [2].非maven方式
         直接拷贝jeewx-api-1.3.2.jar进项目Lib中
		 




API测试
-----------------------------------

    public static void main(String[] args) {
		try {
			String accesstoken = "?";
			String user_openid = "o8QKAuAyDxxfyuBZ9ugSMR4SR5XQ";
			JwUserAPI.getWxuser(accesstoken, user_openid);
		} catch (WexinReqException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}