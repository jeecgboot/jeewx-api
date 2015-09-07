package org.jeewx.api.coupon.location.model;

public class Cash {
	//基本的卡券
	private BaseInfo base_info;
	//代金券专用，表示起用金额
	private Double least_cost;
	//代金券专用，表示减免金额
	private Double reduce_cost;
	
	public BaseInfo getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}
	public Double getLeast_cost() {
		return least_cost;
	}
	public void setLeast_cost(Double least_cost) {
		this.least_cost = least_cost;
	}
	public Double getReduce_cost() {
		return reduce_cost;
	}
	public void setReduce_cost(Double reduce_cost) {
		this.reduce_cost = reduce_cost;
	}
	
}
