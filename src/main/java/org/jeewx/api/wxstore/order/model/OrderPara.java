package org.jeewx.api.wxstore.order.model;

public class OrderPara {
	// 订单状态(不带该字段-全部状态, 2-待发货, 3-已发货, 5-已完成, 8-维权中, )
	private Integer status;
	// 订单创建时间起始时间(不带该字段则不按照时间做筛选)
	private Integer begintime;
	// 订单创建时间终止时间(不带该字段则不按照时间做筛选)
	private Integer endtime;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getBegintime() {
		return begintime;
	}
	public void setBegintime(Integer begintime) {
		this.begintime = begintime;
	}
	public Integer getEndtime() {
		return endtime;
	}
	public void setEndtime(Integer endtime) {
		this.endtime = endtime;
	}
	
}
