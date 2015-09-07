package org.jeewx.api.coupon.manage.model;

/**
 * 折扣券。
 * 
 * @author mcl
 * @version v1.0
 */
public class Discount {
	// 基本的卡券数据，见下表，所有卡券通用
	private BaseInfo base_info;
	// 折扣券专用，表示打折额度（百分比）。填	30 就是七折。
	private Float discount;

	public BaseInfo getBase_info() {
		return base_info;
	}

	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}



}
