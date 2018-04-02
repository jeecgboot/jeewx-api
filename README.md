1、jeewx-api概述

  JEEWX-API 是第一个微信公众平台Java版极速SDK，基于jeewx-api 开发可以立即拥有简单易用的API，让开发更加轻松自如，节省更多时间. 最新1.2版本API已合并企业微信API和支付窗API。
 
2、免责声明

	此Api为非官方版，由于微信和支付宝官方接口的随时可能调整升级，使用此Api有可能会出现一些问题。

3、集成方法：

	[1].maven 方式
    在pom.xml 添加jeewx-api 1.2-SNAPSHOT依赖
			<dependency>  
				<groupId>org.jeewx</groupId>  
				<artifactId>jeewx-api</artifactId>  
				<version>1.2-SNAPSHOT</version>  
			</dependency>
	[2].非maven方式
     直接拷贝jeewx-api-1.2-SNAPSHOT.jar进项目Lib中

	代码测试示例
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
	
4、帮助文档

  为了大家更便捷的使用jeewx-api，请参照代码doc目录下的相关API文档和使用手册，
  在线wiki请使用http://wiki.jeecg.org/pages/viewpage.action?pageId=7110659

5、技术交流

	QQ交流群： ④176031980、③289782002

6、扩展使用

	由于微信开发的接口会不断的增多或者调整，开发者可以按照下面三步骤进行扩展：

	[1]添加请求参数对象，参考org.jeewx.api.core.req.model.menu.MenuCreate，定义自己的ReqType类型。

	[2]添加微信请求的配置信息jeewx-api\src\main\resources\weixin-reqcongfig.xml，其中

		Key：为定义的reqType类型

		Method：为url请求方式，get/post

		DataType：为参数形式，json或传统的url参数param

		Url：为接口请求路径

		MappingHandler：请求处理类，如果没有特殊处理，可以为空，如存在请求信息需要特殊处理，可以实现org.jeewx.api.core.handler.WeiXinReqHandler接口，开发者发送自己的请求获取微信数据。

	[3]类型和配置信息处理好后，通过

		org.jeewx.api.core.util.WeiXinReqService.getInstance().doWeinxinReq(ReqType类型对象)进行调用。

