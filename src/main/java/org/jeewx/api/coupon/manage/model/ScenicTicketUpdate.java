package org.jeewx.api.coupon.manage.model;

/**
 * 可以被更新的门票信息。
 * 
 * @author mcl
 * @version v1.0
 */
public class ScenicTicketUpdate {
	// 基本的卡券数据，见下表，所有卡券通用
	private BaseInfoUpdate base_info;
	// 导览图url。
	private String guide_url;
	public BaseInfoUpdate getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfoUpdate base_info) {
		this.base_info = base_info;
	}
	public String getGuide_url() {
		return guide_url;
	}
	public void setGuide_url(String guide_url) {
		this.guide_url = guide_url;
	}




}
