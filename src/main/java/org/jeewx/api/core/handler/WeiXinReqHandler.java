package org.jeewx.api.core.handler;

import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.core.req.model.WeixinReqParam;

/**
 * 获取微信接口的信息
 * @author liguo
 *
 */
public interface WeiXinReqHandler {
	
	public String doRequest(WeixinReqParam weixinReqParam) throws WexinReqException;
	
}
