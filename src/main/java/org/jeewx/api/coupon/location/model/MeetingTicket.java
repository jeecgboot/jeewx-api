package org.jeewx.api.coupon.location.model;

public class MeetingTicket {
	//基本的卡券数据
	private BaseInfo base_info;
	//会议详情
	private String meeting_detail;
	//会场导览图
	private String map_url;
	
	public BaseInfo getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}
	public String getMeeting_detail() {
		return meeting_detail;
	}
	public void setMeeting_detail(String meeting_detail) {
		this.meeting_detail = meeting_detail;
	}
	public String getMap_url() {
		return map_url;
	}
	public void setMap_url(String map_url) {
		this.map_url = map_url;
	}
	

}
