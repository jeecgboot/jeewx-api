JEEWX-API  微信开发SDK
===============

  
最新版本： 1.5.2（发布日期：20231215）

[![AUR](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg)](https://github.com/zhangdaiscott/jeecg-boot/blob/master/LICENSE)
[![](https://img.shields.io/badge/Author-北京国炬软件-orange.svg)](http://jeecg.com/aboutusIndex)
[![](https://img.shields.io/badge/Blog-官方博客-blue.svg)](https://jeecg.blog.csdn.net)
[![](https://img.shields.io/badge/version-1.9.5-brightgreen.svg)](https://github.com/zhangdaiscott/jeecg-boot)
[![GitHub stars](https://img.shields.io/github/stars/zhangdaiscott/jeecg-boot.svg?style=social&label=Stars)](https://github.com/zhangdaiscott/jeecg-boot)
[![GitHub forks](https://img.shields.io/github/forks/zhangdaiscott/jeecg-boot.svg?style=social&label=Fork)](https://github.com/zhangdaiscott/jeecg-boot)



 > 反馈问题：发现bug请在github [发issue](https://github.com/jeecgboot/jeewx-api/issues/new)


项目介绍
-----------------------------------
 JEEWX-API 是一款JAVA版的微信开发SDK，支持微信公众号、小程序、微信企业号、支付宝生活号SDK和微博SDK。你可以基于她，快速的傻瓜化的进行微信开发、支付窗和微博开发。
 基于jeewx-api开发，可以立即拥有简单易用的API，让开发更加轻松自如，节省更多时间。


技术交流
-----------------------------------
* 	技术官网： www.jeecg.com
* 	快速文档： [http://jeewx-api.mydoc.io](http://jeewx-api.mydoc.io)
* 	API文档： [http://www.jeewx.com/jeewx-api](http://www.jeewx.com/jeewx-api)



Jeewx-Api 集成方法
-----------------------------------
### [1].maven 方式
    在pom.xml 添加jeewx-api 1.3依赖
    <dependency>
		<groupId>org.jeecgframework</groupId>
		<artifactId>jeewx-api</artifactId>
		<version>1.4.9</version>
	</dependency>
	
### [2].非maven方式
         直接拷贝jeewx-api-*.jar进项目Lib中
		 




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