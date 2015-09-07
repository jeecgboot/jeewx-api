package org.jeewx.api.coupon.manage.model;

/**
 * 可以被更新的电影票信息。
 * 
 * @author mcl
 * @version v1.0
 */
public class MovieTicketUpdate {
	// 基本的卡券数据，见下表，所有卡券通用
	private BaseInfoUpdate base_info;
	// 电影票详情
	private String detail;
	


	public BaseInfoUpdate getBase_info() {
		return base_info;
	}

	public void setBase_info(BaseInfoUpdate base_info) {
		this.base_info = base_info;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}



}
