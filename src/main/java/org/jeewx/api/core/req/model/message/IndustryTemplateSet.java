package org.jeewx.api.core.req.model.message;

import org.jeewx.api.core.annotation.ReqType;
import org.jeewx.api.core.req.model.WeixinReqParam;

/**
 * 取多媒体文件
 * 
 * @author sfli.sir
 * 
 */
@ReqType("industryTemplateSet")
public class IndustryTemplateSet extends WeixinReqParam {


	private String industry_id1;
	
	private String industry_id2;

	public String getIndustry_id1() {
		return industry_id1;
	}

	public void setIndustry_id1(String industry_id1) {
		this.industry_id1 = industry_id1;
	}

	public String getIndustry_id2() {
		return industry_id2;
	}

	public void setIndustry_id2(String industry_id2) {
		this.industry_id2 = industry_id2;
	}
	
}
