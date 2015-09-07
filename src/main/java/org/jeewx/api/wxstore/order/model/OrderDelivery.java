package org.jeewx.api.wxstore.order.model;

public class OrderDelivery {
	// 订单ID
	private String order_id;
	// 物流公司ID
	private String delivery_company;
	// 运单ID
	private String delivery_track_no;
	// 商品是否需要物流(0-不需要，1-需要，无该字段默认为需要物流)
	private Integer need_delivery;
	// 是否是提供的物流公司
	private Integer is_others;
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getDelivery_company() {
		return delivery_company;
	}
	public void setDelivery_company(String delivery_company) {
		this.delivery_company = delivery_company;
	}
	public String getDelivery_track_no() {
		return delivery_track_no;
	}
	public void setDelivery_track_no(String delivery_track_no) {
		this.delivery_track_no = delivery_track_no;
	}
	public Integer getNeed_delivery() {
		return need_delivery;
	}
	public void setNeed_delivery(Integer need_delivery) {
		this.need_delivery = need_delivery;
	}
	public Integer getIs_others() {
		return is_others;
	}
	public void setIs_others(Integer is_others) {
		this.is_others = is_others;
	}
	
}
