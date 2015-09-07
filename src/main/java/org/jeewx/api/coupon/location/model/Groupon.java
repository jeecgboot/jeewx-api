package org.jeewx.api.coupon.location.model;

public class Groupon {
	//基本的卡券
	private BaseInfo base_info;
	//团购券专用
	private String deal_detail;
	
	public BaseInfo getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}
	public String getDeal_detail() {
		return deal_detail;
	}
	public void setDeal_detail(String deal_detail) {
		this.deal_detail = deal_detail;
	}
	
}
