package org.jeewx.api.coupon.manage.model;

/**
 * 代金券。
 * 
 * @author mcl
 * @version v1.0
 */
public class Cash {
	// 基本的卡券数据，见下表，所有卡券通用
	private BaseInfo base_info;
	// 代金券专用，表示起用金额（单位为分）。
	private Integer least_cost;
	// 代金券专用，表示减免金额（单位为分）。
	private Integer reduce_cost;

	public BaseInfo getBase_info() {
		return base_info;
	}

	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}

	public Integer getLeast_cost() {
		return least_cost;
	}

	public void setLeast_cost(Integer least_cost) {
		this.least_cost = least_cost;
	}

	public Integer getReduce_cost() {
		return reduce_cost;
	}

	public void setReduce_cost(Integer reduce_cost) {
		this.reduce_cost = reduce_cost;
	}


}
