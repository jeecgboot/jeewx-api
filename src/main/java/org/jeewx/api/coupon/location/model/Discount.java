package org.jeewx.api.coupon.location.model;

public class Discount {
	//基本的卡券数据
	private BaseInfo base_info;
	//折扣券专用，表示打折额度
	private Integer discount;
	public BaseInfo getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	

}
