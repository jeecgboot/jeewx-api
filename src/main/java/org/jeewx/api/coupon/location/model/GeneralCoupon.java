package org.jeewx.api.coupon.location.model;

public class GeneralCoupon {
	
	// 基本的卡券数据，见下表，所有卡券通用。
	private BaseInfo base_info;
	//描述文
	private String default_detail;
	
	public BaseInfo getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}
	public String getDefault_detail() {
		return default_detail;
	}
	public void setDefault_detail(String default_detail) {
		this.default_detail = default_detail;
	}
	
	
	
}
