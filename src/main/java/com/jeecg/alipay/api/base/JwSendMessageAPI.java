package com.jeecg.alipay.api.base;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.api.AlipayApiException;
import com.alipay.api.domain.AlipayOpenPublicMessageSingleSendModel;
import com.alipay.api.request.AlipayMobilePublicMessageCustomSendRequest;
import com.alipay.api.request.AlipayMobilePublicMessageSingleSendRequest;
import com.alipay.api.request.AlipayMobilePublicMessageTotalSendRequest;
import com.alipay.api.request.AlipayOpenPublicMessageSingleSendRequest;
import com.alipay.api.request.AlipayOpenPublicTemplateMessageGetRequest;
import com.alipay.api.response.AlipayMobilePublicMessageCustomSendResponse;
import com.alipay.api.response.AlipayMobilePublicMessageSingleSendResponse;
import com.alipay.api.response.AlipayMobilePublicMessageTotalSendResponse;
import com.alipay.api.response.AlipayOpenPublicMessageSingleSendResponse;
import com.alipay.api.response.AlipayOpenPublicTemplateMessageGetResponse;
import com.jeecg.alipay.api.base.vo.SendMessageImageTextMoreVo.SendMessageImageTextMore;
import com.jeecg.alipay.api.base.vo.SendMessageImageTextOneVo.SendMessageImageText;
import com.jeecg.alipay.api.base.vo.SendMessageModelVo.SendMessageImageModel;
import com.jeecg.alipay.api.base.vo.SendMessageTextMoreVo.SendMessageTextMore;
import com.jeecg.alipay.api.base.vo.SendMessageTextOneVo.SendMessage;
import com.jeecg.alipay.api.core.AlipayClientFactory;
import com.jeecg.alipay.api.core.AlipayConfig;

/**
 * 支付服务窗发送消息API
 * 
 * @author zhangdaihao
 * 
 */
public class JwSendMessageAPI {
	/**
	 * 异步单发消息（文本）
	 * 
	 * @param appAuthToken
	 *            商户授权后获取的app_auth_token
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicMessageCustomSendResponse messageCustomSend(String appAuthToken, String content,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicMessageCustomSendRequest request = new AlipayMobilePublicMessageCustomSendRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		request.setBizContent(content);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}
	
	/**
	 * 异步单发消息（文本）
	 * 
	 * @param appAuthToken
	 *            商户授权后获取的app_auth_token
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	@Deprecated
	public static AlipayMobilePublicMessageCustomSendResponse messageCustomSendText(String appAuthToken, SendMessage model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicMessageCustomSendRequest request = new AlipayMobilePublicMessageCustomSendRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = "";
		json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 异步单发消息（图文消息，支持6条）
	 * 
	 * @param appAuthToken
	 *            商户授权后获取的app_auth_token
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	@Deprecated
	public static AlipayMobilePublicMessageCustomSendResponse messageCustomSendImageText(String appAuthToken, SendMessageImageText model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicMessageCustomSendRequest request = new AlipayMobilePublicMessageCustomSendRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = "";
		json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 群发消息（文本）
	 * 
	 * @param appAuthToken
	 *            商户授权后获取的app_auth_token
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicMessageTotalSendResponse messageTotalSend(String appAuthToken, String content,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicMessageTotalSendRequest request = new AlipayMobilePublicMessageTotalSendRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		request.setBizContent(content);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}
	
	/**
	 * 群发消息（文本）
	 * 
	 * @param appAuthToken
	 *            商户授权后获取的app_auth_token
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	@Deprecated
	public static AlipayMobilePublicMessageTotalSendResponse messageTotalSendText(String appAuthToken, SendMessageTextMore model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicMessageTotalSendRequest request = new AlipayMobilePublicMessageTotalSendRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = "";
		json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 群发消息（图文）
	 * 
	 * @param appAuthToken
	 *            商户授权后获取的app_auth_token
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	@Deprecated
	public static AlipayMobilePublicMessageTotalSendResponse messageTotalSendImageText(String appAuthToken, SendMessageImageTextMore model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicMessageTotalSendRequest request = new AlipayMobilePublicMessageTotalSendRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = "";
		json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 单发模板消息
	 * 
	 * @param appAuthToken
	 *            商户授权后获取的app_auth_token
	 * @param model
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicMessageSingleSendResponse messageSingleSend(String appAuthToken, SendMessageImageModel model,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicMessageSingleSendRequest request = new AlipayMobilePublicMessageSingleSendRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		String json = "";
		//update-begin--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
		json = JSONObject.toJSONString(model,SerializerFeature.WriteMapNullValue);
		//update-end--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	//update-begin--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
	/**
	 * 单发模板消息（新版API）
	 * @param model
	 * @param config
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayOpenPublicMessageSingleSendResponse messageSingleSendNew(AlipayOpenPublicMessageSingleSendModel model,AlipayConfig config) throws AlipayApiException{
		AlipayOpenPublicMessageSingleSendRequest request = new AlipayOpenPublicMessageSingleSendRequest();
		String json = JSONObject.toJSONString(model);
		request.setBizContent(json);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 获取模板详情
	 * @param templateId
	 * @param config
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayOpenPublicTemplateMessageGetResponse templateMessageGet(String templateId,AlipayConfig config) throws AlipayApiException{
		AlipayOpenPublicTemplateMessageGetRequest request = new AlipayOpenPublicTemplateMessageGetRequest();
		JSONObject json = new JSONObject();
		json.put("template_id", templateId);
		request.setBizContent(json.toJSONString());
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}
	//update-end--author:zhangjiaqiang Date:20161028 for:#1486 【支付窗】模板消息接口、推广二维码研究
}
