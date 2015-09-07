package org.jeewx.api.coupon.location.model;

public class MovieTicket {
	//基本的卡券数据
	private BaseInfo base_info;
	//电影票详情
	private String detail;
	
	public BaseInfo getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	} 

}
