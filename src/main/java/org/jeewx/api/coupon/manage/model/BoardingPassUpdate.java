package org.jeewx.api.coupon.manage.model;

/**
 * 可以被更新的飞机票信息。
 * 
 * @author mcl
 * @version v1.0
 */
public class BoardingPassUpdate {
	// 基本的卡券数据，见下表，所有卡券通用
	private BaseInfoUpdate base_info;
	// 起飞时间。Unix 时间戳格式。
	private Long departure_time;
	// 降落时间。Unix 时间戳格式。
	private Long landing_time;
	private String gate;
	// 登机时间，只显示“时分”不显示日期，按时间戳格式填写。如发生登机时间变更，建议商家实时调用该接口变更。
	private Long boarding_time;
	public BaseInfoUpdate getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfoUpdate base_info) {
		this.base_info = base_info;
	}
	public Long getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(Long departure_time) {
		this.departure_time = departure_time;
	}
	public Long getLanding_time() {
		return landing_time;
	}
	public void setLanding_time(Long landing_time) {
		this.landing_time = landing_time;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public Long getBoarding_time() {
		return boarding_time;
	}
	public void setBoarding_time(Long boarding_time) {
		this.boarding_time = boarding_time;
	}
	

}
