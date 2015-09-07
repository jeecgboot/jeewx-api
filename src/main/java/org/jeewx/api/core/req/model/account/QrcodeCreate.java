package org.jeewx.api.core.req.model.account;

import org.jeewx.api.core.annotation.ReqType;
import org.jeewx.api.core.req.model.WeixinReqParam;

/**
 * 
 * @author sfli.sir
 * 
 */
@ReqType("qrcodeCreate")
public class QrcodeCreate extends WeixinReqParam {

	private String expire_seconds;
	
	/**
	 * 二维码类型，QR_SCENE为临时,QR_LIMIT_SCENE为永久,QR_LIMIT_STR_SCENE为永久的字符串参数值
	 */
	private String action_name="QR_SCENE";
	
	private QrcodeActionInfo action_info;

	public String getExpire_seconds() {
		return expire_seconds;
	}

	public void setExpire_seconds(String expire_seconds) {
		this.expire_seconds = expire_seconds;
	}

	public String getAction_name() {
		return action_name;
	}

	public void setAction_name(String action_name) {
		this.action_name = action_name;
	}

	public QrcodeActionInfo getAction_info() {
		return action_info;
	}

	public void setAction_info(QrcodeActionInfo action_info) {
		this.action_info = action_info;
	}
	
	
}
