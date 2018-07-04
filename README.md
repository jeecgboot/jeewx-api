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

![github](https://camo.githubusercontent.com/e196c5829ef14d25d30ee24ce81bfb6e0dfb49a4/687474703a2f2f7777772e6a656563672e6f72672f646174612f6174746163686d656e742f666f72756d2f3230313630362f32372f3132333530347936397276397a7178776576767636362e706e67 "jeewx")
![github](https://camo.githubusercontent.com/7caeaa7c2d8e3f13bf40f3adb22a3c19213b8289/687474703a2f2f7374617469632e6f736368696e612e6e65742f75706c6f6164732f73706163652f323031362f303432342f3133313130355f42536c4e5f3933303839382e706e67 "jeewx")


    