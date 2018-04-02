package com.jeecg.alipay.api.base;

import com.alipay.api.AlipayApiException;
import com.alipay.api.request.AlipayMobilePublicInfoModifyRequest;
import com.alipay.api.request.AlipayMobilePublicInfoQueryRequest;
import com.alipay.api.response.AlipayMobilePublicInfoModifyResponse;
import com.alipay.api.response.AlipayMobilePublicInfoQueryResponse;
import com.jeecg.alipay.api.base.vo.ServicWindowsVo.ServiceWindowsContent;
import com.jeecg.alipay.api.core.AlipayClientFactory;
import com.jeecg.alipay.api.core.AlipayConfig;

/**
 * 服务窗基础信息
 * 
 * @author zhangdaihao
 * 
 */
public class JwServiceWindowAPI {

	/**
	 * 服务窗基础信息查询方法
	 * 
	 * @param appAuthToken
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicInfoQueryResponse infoQuery(String appAuthToken,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicInfoQueryRequest request = new AlipayMobilePublicInfoQueryRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}

	/**
	 * 服务窗基础信息修改方法
	 * 
	 * @param appAuthToken
	 * @param serviceWindowsContent
	 * @return
	 * @throws AlipayApiException
	 */
	public static AlipayMobilePublicInfoModifyResponse queryAdvertise(String appAuthToken, ServiceWindowsContent serviceWindowsContent,AlipayConfig config) throws AlipayApiException {
		AlipayMobilePublicInfoModifyRequest request = new AlipayMobilePublicInfoModifyRequest();
		request.putOtherTextParam("app_auth_token", appAuthToken);
		request.setAppName(serviceWindowsContent.getAppName());
		request.setLogoUrl(serviceWindowsContent.getLogoUrl());
		request.setPublicGreeting(serviceWindowsContent.getPublicGreeting());
		request.setLicenseUrl(serviceWindowsContent.getLicenseUrl());
		request.setShopPic1(serviceWindowsContent.getShopPic1());
		request.setShopPic2(serviceWindowsContent.getShopPic2());
		request.setShopPic3(serviceWindowsContent.getShopPic3());
		return AlipayClientFactory.getAlipayClientInstance(config).execute(request);
	}
}
