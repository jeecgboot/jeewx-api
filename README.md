JEEWX-API  微信极速SDK
===============
  （一款JAVA版本微信SDK，集成企业微信SDK，支付窗SDK）
===============
最新版本： 1.2.0（发布日期：20180403）
官网：[www.jeewx.com](http://www.jeewx.com) 


一、项目介绍：
-----------------------------------
 JEEWX-API 是第一个JAVA版微信极速SDK，集成企业微信SDK，支付窗SDK，可以快速的基于她进行微信公众号、企业微信、支付窗应用开发。
 基于 jeewx-api 开发可以立即拥有简单易用的API，让开发更加轻松自如，节省更多时间。


二、接口功能清单
-----------------------------------
*   在线文档： [接口WIKI](http://wiki.jeecg.org/pages/viewpage.action?pageId=7110659)


三、Jeewx-api 集成方法
-----------------------------------
### [1].maven 方式
    在pom.xml 添加jeewx-api 1.2.0依赖
	(如果配置了私服，请参考链接的5.2排除jeecg的私服，不然会出现下载失败的情况。 https://blog.csdn.net/zhangdaiscott/article/details/50915206 )

    <dependency>  
		<groupId>org.jeewx</groupId>  
		<artifactId>jeewx-api</artifactId>  
		<version>1.2.0</version>  
	</dependency>
	
### [2].非maven方式
         直接拷贝jeewx-api-1.2.0.jar进项目Lib中
		 
### [3].测试示例

    public static void main(String[] args) {
		try {
			String accesstoken = "yALYWcUbB1hdURQvJ-Qn1jbyq5E0qNraZixnxhC1wtN5sKrAfHifyFHHpRWiUnZ1xnhjN_dcnYqFAgpJqeJJybx2NOVoEDZd7SFLjwFIvM8AJv3a8EGarbY0jo--4vuqUNNhADAQJJ";
			String user_openid = "o8QKAuAyDxxfyuBZ9ugSMR4SR5XQ";
			JwUserAPI.getWxuser(accesstoken, user_openid);
		} catch (WexinReqException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    

	
四、技术交流
-----------------------------------
* 	QQ交流群： ④289709451
* 	技术论坛： www.jeecg.org



五、二次开发体验
-----------------------------------

![github](http://img.blog.csdn.net/20180309122145466 "jeewx")
![github](http://img.blog.csdn.net/20160323154916164?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center "jeewx")


    