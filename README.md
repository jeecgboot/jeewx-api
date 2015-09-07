1、jeewx-api为何诞生

现在微信越来越火，基于微信的公众号和服务号越来越丰富，虽然微信帮助文档已经提供了相关的接口，但是接口比较多，通过代码自己调用比较麻烦，所以为减轻开发者独自创造轮子，将微信API进行了统一封装！

 

2、免责声明

此Api为非官方版，由于官方接口的调整，使用此Api还有可能会出现一些问题

3、快速使用方法：

所有获取微信接口的方法都是静态方法，可以通过传递参数调用，API的包基本与微信开发者文档目录对应，通过英语单据，如参数有疑问，可以对照微信开发者帮助文档进行理解。

   




4、扩展使用

由于微信开发的接口会不断的增多或者调整，开发者可以按照下面三步骤进行扩展：


A、添加请求参数对象，参考org.jeewx.api.core.req.model.menu.MenuCreate，定义自己的ReqType类型。

B、添加微信请求的配置信息jeewx-api\src\main\resources\weixin-reqcongfig.xml，其中

Key：为定义的reqType类型

Method：为url请求方式，get/post

DataType：为参数形式，json或传统的url参数param

Url：为接口请求路径

MappingHandler：请求处理类，如果没有特殊处理，可以为空，如存在请求信息需要特殊处理，可以实现org.jeewx.api.core.handler.WeiXinReqHandler接口，开发者发送自己的请求获取微信数据。

C、类型和配置信息处理好后，通过

org.jeewx.api.core.util.WeiXinReqService.getInstance().doWeinxinReq(ReqType类型对象)进行调用。

5、扩展使用

  为了大家更便捷的使用jeewx-api，社区制作相关的API文档和使用手册

  《JeeWx-API操作手册.doc》《jeewx-api.chm》更多资料请百度jeewx在官网下载