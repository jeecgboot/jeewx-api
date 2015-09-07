package org.jeewx.api.core.common.util;

import java.util.HashMap;
import java.util.Map;

public class WeixinUtil {
	
	public static String parseWeiXinHttpUrl(String url,Map<String, Object> paras) {
		return FreemarkerUtil.parseTemplateContent(url, paras);
	}
	
	public static String parseWeiXinHttpUrl(String url,String access_token) {
		Map<String,Object> paras = new HashMap<String,Object>();
		paras.put("ACCESS_TOKEN", access_token);
		return FreemarkerUtil.parseTemplateContent(url, paras);
	}
}
