package org.jeewx.api.core.req.model.message;

import java.util.Map;

import org.jeewx.api.core.annotation.ReqType;
import org.jeewx.api.core.req.model.WeixinReqParam;

/**
 * 取多媒体文件
 * 
 * @author sfli.sir
 * 
 */
public class TemplateMessageSendResult {


	private String touser;
	
	private String template_id;
	
	private String url;
	
	private Map<String,TemplateData> data;

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, TemplateData> getData() {
		return data;
	}

	public void setData(Map<String, TemplateData> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TemplateMessageSendResult [touser=" + touser + ", template_id=" + template_id + ", url=" + url
				+ ", data=" + data + "]";
	}

}
