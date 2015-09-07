package org.jeewx.api.core.req.model.kfaccount;

import org.jeewx.api.core.annotation.ReqType;
import org.jeewx.api.core.req.model.WeixinReqParam;

/**
 * 客服账号信息获取，返回信息json字符串 * 
 * 参数				是否必须	说明
	access_token	是	调用接口凭证
	kf_account		是	完整客服账号，格式为：账号前缀@公众号微信号
	kf_nick			是	客服昵称
	kf_id			是	客服工号
	nickname		是	客服昵称，最长6个汉字或12个英文字符
	password		否	客服账号登录密码，格式为密码明文的32位加密MD5值。该密码仅用于在公众平台官网的多客服功能中使用，若不使用多客服功能，则不必设置密码
	media			是	该参数仅在设置客服头像时出现，是form-data中媒体文件标识，有filename、filelength、content-type等信息
 * 
 * @author sfli.sir
 * 
 */
@ReqType("getkflist")
public class KfaccountList extends WeixinReqParam {
	
}
