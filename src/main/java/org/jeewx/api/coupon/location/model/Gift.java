package org.jeewx.api.coupon.location.model;

public class Gift {
	//基本的卡券
	private BaseInfo base_info;
	//礼品券专用
	private String gift;
	
	public BaseInfo getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}
	public String getGift() {
		return gift;
	}
	public void setGift(String gift) {
		this.gift = gift;
	}
	

}
