package com.jeecg.alipay.api.core;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

public class AlipayClientFactory {

	public static  AlipayClient getAlipayClientInstance(AlipayConfig config) {
		AlipayClient client = new DefaultAlipayClient(AlipayConfig.URL, config.getAppid(), config.getRsaPrivateKey(),
				AlipayConfig.FORMAT, AlipayConfig.CHARSET, config.getAlipayPublicKey());
		return client;
	}
}