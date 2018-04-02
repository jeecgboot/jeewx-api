package com.jeecg.alipay.api.core;

public class AlipayConfig {
	// 开发者应用私钥。java配置PKCS8格式，PHP/.Net语言配置rsa_private_key.pem文件中原始私钥。
	private String appid;
	/* 详见密钥生成 */
	private String rsaPrivateKey = "";
	// 接口请求网关。当面付支付、查询、退款、撤销接口中为固定值
	public static final String URL = "https://openapi.alipay.com/gateway.do";
	// 商户应用APPID，只要您的应用中包含当面付接口且是开通状态，就可以用此应用对应的appid。
	// 编码字符集。默认 utf-8
	public static final String CHARSET = "utf-8";
	// 返回格式。默认json
	public static final String FORMAT = "json";
	// 支付宝公钥，用于获取同步返回信息后进行验证，验证是否是支付宝发送的信息。
	/* 开发者登录开放平台-管理中心-进入应用后查看 */
	private String alipayPublicKey = "";
	private String publicKey = "";

	public AlipayConfig(String appid, String rsaPrivateKey, String alipayPublicKey, String publicKey) {
		this.appid = appid;
		this.rsaPrivateKey = rsaPrivateKey;
		this.alipayPublicKey = alipayPublicKey;
		this.publicKey = publicKey;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getRsaPrivateKey() {
		return rsaPrivateKey;
	}

	public void setRsaPrivateKey(String rsaPrivateKey) {
		this.rsaPrivateKey = rsaPrivateKey;
	}

	public String getAlipayPublicKey() {
		return alipayPublicKey;
	}

	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

//	public static void init(String appid, String rsaPrivateKey, String alipayPublicKey, String publicKey) {
//		appid = appid;
//		rsaPrivateKey = rsaPrivateKey;
//		alipayPublicKey = alipayPublicKey;
//	}

}
