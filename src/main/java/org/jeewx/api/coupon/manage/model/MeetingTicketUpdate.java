package org.jeewx.api.coupon.manage.model;

/**
 * 可以被更新的会议门票信息。
 * @author mcl
 * @version v1.0
 */
public class MeetingTicketUpdate {
	// 基本的卡券数据，见下表，所有卡券通用
	private BaseInfoUpdate base_info;
	// 会场导览图
	private String map_url;
	public BaseInfoUpdate getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfoUpdate base_info) {
		this.base_info = base_info;
	}
	public String getMap_url() {
		return map_url;
	}
	public void setMap_url(String map_url) {
		this.map_url = map_url;
	}


}
