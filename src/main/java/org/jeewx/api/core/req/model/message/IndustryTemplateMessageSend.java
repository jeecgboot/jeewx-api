package org.jeewx.api.core.req.model.message;

import org.jeewx.api.core.annotation.ReqType;
import org.jeewx.api.core.req.model.WeixinReqParam;

/**
 * 取多媒体文件
 * 
 * @author sfli.sir
 * 
 */
@ReqType("industryTemplateMessageSend")
public class IndustryTemplateMessageSend extends WeixinReqParam {


	private String touser;
	
	private String template_id;
	
	private String url;
	
	private String topcolor;
	
	private TemplateMessage data;

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

	public String getTopcolor() {
		return topcolor;
	}

	public void setTopcolor(String topcolor) {
		this.topcolor = topcolor;
	}

	public TemplateMessage getData() {
		return data;
	}

	public void setData(TemplateMessage data) {
		this.data = data;
	}
	
	
}
