package com.jeecg.alipay.api.core;

public class Config {

	// 开发者应用私钥。java配置PKCS8格式，PHP/.Net语言配置rsa_private_key.pem文件中原始私钥。
	 /* 详见密钥生成 */
	public static final String RSA_RRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAOLApvsmYkHiuv/TOqN/VNVPzNZ+3Mjot3TnsjKGR875ZiHvYGb9h46dt2z7gBjH22CAGMbWqoROIjUoW/hXabGw+q6AjC4zY5DiU9X2aOd3gsbwV4NK9eqHVhksl0vbL/yTBuN7s+e9iZymqncfXyD3WZz3FzZ7ShZPFw3EKzFrAgMBAAECgYAvTrRHx61OQ6hyATbFr6YaTujUg2k6vVqxGDnUUrGem+fUAqYhNpnWhk8jfKEwClpZmsAQk+7FZau7XW06tboGBO1k5audA4EEsEefcqrhpUdzyekyF9YwxQDPZ1dlFc4XSO+rB6tX9TyXc/uJwfKvramuCln2F7n+GZ4AkvRAaQJBAPeWDpMZFzTm2Y6a6JGQuWbaYqYUAONOx8ICaxOVsURsz8iDUyDFjwJVVrJAhcn/nMUOr164KXISFVxZGKBXxB0CQQDqdVkA5KttlssvxLDDaIdVXpWUvoUGh/zyWEwK1jIl6leEOoHbdSjO4/nahSInb+y9RFykEro/pR/xL6PmysUnAkEAmrCbzJZppHjzxyDMXF6zKCscZa2r3FnVf0cphaQKjLj7nclHf/tPXeLZ9ydPMCVP2uNQ+PpRkt7vj7JvK4eKlQJASpKqjYMuF3xIAliQVIbxzLB56Uaz7wDf7oExJp08dBzWW0N0vEXGhg+zD9MaquqJpSWSRcmDHe06fK9HdYf3LwJAGStkiu+zX3gM/Wh82tJXMdo0zoTFjZPMaggFoyPtUWA4H+3cDHwxp5uIE8d3sUDpw7Gwg98E0E9gCxhVWdiDLA==";
	// 接口请求网关。当面付支付、查询、退款、撤销接口中为固定值
	public static final String URL = "https://openapi.alipay.com/gateway.do";
	// 商户应用APPID，只要您的应用中包含当面付接口且是开通状态，就可以用此应用对应的appid。
	/* 开发者可登录开放平台-管理中心-对应应用中查看 */
	public static final String APPID = " 2015112500868971";
	// 编码字符集。默认 utf-8
	public static final String CHARSET = "utf-8";
	// 返回格式。默认json
	public static final String FORMAT = "json";
	// 支付宝公钥，用于获取同步返回信息后进行验证，验证是否是支付宝发送的信息。
	 /* 开发者登录开放平台-管理中心-进入应用后查看 */
	public static final String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";
}
