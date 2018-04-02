package com.jeecg.alipay.api.base;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.request.AlipayMobilePublicLabelAddRequest;
import com.alipay.api.request.AlipayMobilePublicLabelDeleteRequest;
import com.alipay.api.request.AlipayMobilePublicLabelQueryRequest;
import com.alipay.api.request.AlipayMobilePublicLabelUpdateRequest;
import com.alipay.api.request.AlipayMobilePublicLabelUserAddRequest;
import com.alipay.api.request.AlipayMobilePublicLabelUserDeleteRequest;
import com.alipay.api.request.AlipayMobilePublicLabelUserQueryRequest;
import com.alipay.api.request.AlipayMobilePublicMessageLabelSendRequest;
import com.alipay.api.response.AlipayMobilePublicLabelAddResponse;
import com.alipay.api.response.AlipayMobilePublicLabelDeleteResponse;
import com.alipay.api.response.AlipayMobilePublicLabelQueryResponse;
import com.alipay.api.response.AlipayMobilePublicLabelUpdateResponse;
import com.alipay.api.response.AlipayMobilePublicLabelUserAddResponse;
import com.alipay.api.response.AlipayMobilePublicLabelUserDeleteResponse;
import com.alipay.api.response.AlipayMobilePublicLabelUserQueryResponse;
import com.alipay.api.response.AlipayMobilePublicMessageLabelSendResponse;
import com.jeecg.alipay.api.base.vo.LableGroupVo.LableGroup;
import com.jeecg.alipay.api.base.vo.LableUserAddVo.UserAddLable;
import com.jeecg.alipay.api.base.vo.LableVo.LableId;
import com.jeecg.alipay.api.base.vo.LableVo.UpDateLable;
import com.jeecg.alipay.api.core.AlipayClientFactory;
import com.jeecg.alipay.api.core.AlipayConfig;

/**
 * 支付服务窗标签API
 * 
 * @author zhangdaihao
 * 
 */
public class JwLableAPI {

	/**
	 * 创建标签
	 * 
	 * @param appAuthToken
	 * @param name
	 *            标签名不能重复
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicLabelAddResponse lableadd(String appAuthToken, String name,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicLabelAddRequest request = new AlipayMobilePublicLabelAddRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		JSONObject json = new JSONObject();
		json.put("name", name);
		request.setBizContent(json.toJSONString());
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 查询标签
	 * 
	 * @param appAuthToken
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicLabelQueryResponse lablequery(String appAuthToken,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicLabelQueryRequest request = new AlipayMobilePublicLabelQueryRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 修改标签
	 * 
	 * @param appAuthToken
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicLabelUpdateResponse lableupdate(String appAuthToken, UpDateLable model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicLabelUpdateRequest request = new AlipayMobilePublicLabelUpdateRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 删除标签
	 * 
	 * @param appAuthToken
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicLabelDeleteResponse labledel(String appAuthToken, LableId model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicLabelDeleteRequest request = new AlipayMobilePublicLabelDeleteRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 用户增加标签
	 * 
	 * @param appAuthToken
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicLabelUserAddResponse lableUserAdd(String appAuthToken, UserAddLable model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicLabelUserAddRequest request = new AlipayMobilePublicLabelUserAddRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}
	
//	/**
//	 * 添加用户标签  （新版API）
//	 * @param appAuthToken
//	 * @param model
//	 * @param config
//	 * @return
//	 * @throws AlipayApiException
//	 */
//	public static AlipayOpenPublicLabelUserCreateResponse labelUserAddNew(String appAuthToken, UserAddLable model,AlipayConfig config) throws AlipayApiException {
//		AlipayOpenPublicLabelUserCreateRequest request = new AlipayOpenPublicLabelUserCreateRequest();
//		String json = JSONObject.toJSONString(model);
//		System.out.println("添加用户标签："+json);
//		
//		request.setBizContent(json);
//		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
//	}

	/**
	 * 查询用户标签
	 * 
	 * @param appAuthToken
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicLabelUserQueryResponse lableUserQuery(String appAuthToken, UserAddLable model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicLabelUserQueryRequest request = new AlipayMobilePublicLabelUserQueryRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 删除用户标签
	 * 
	 * @param appAuthToken
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicLabelUserDeleteResponse lableUserDel(String appAuthToken, UserAddLable model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicLabelUserDeleteRequest request = new AlipayMobilePublicLabelUserDeleteRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 根据标签组发
	 * 
	 * @param appAuthToken
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicMessageLabelSendResponse sendMsg(String appAuthToken, LableGroup model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicMessageLabelSendRequest request = new AlipayMobilePublicMessageLabelSendRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	
}
