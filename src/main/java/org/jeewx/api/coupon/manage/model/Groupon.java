package org.jeewx.api.coupon.manage.model;

/**
 * 团购券。
 * @author mcl
 * @version v1.0
 */
public class Groupon {
	// 基本的卡券数据，见下表，所有卡券通用
	private BaseInfo base_info;
	// 团购详情。
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
