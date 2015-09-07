package org.jeewx.api.coupon.location.model;

import java.util.Date;

public class BoardingPass {
	//基本的卡券数据
	private BaseInfo base_info;
	//起点
	private String from;
	//终点
	private String to;
	//航班
	private String flight;
	//起飞时间
	private Date departure_time;
	//降落时间
	private Date landing_time;
	//降落时间在线值机的链接
	private String check_in_url;
	//登机口
	private String gate;
	//登机时间
	private Date boarding_time;
	//机型
	private String air_model;
	
	public BaseInfo getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public Date getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(Date departure_time) {
		this.departure_time = departure_time;
	}
	public Date getLanding_time() {
		return landing_time;
	}
	public void setLanding_time(Date landing_time) {
		this.landing_time = landing_time;
	}
	public String getCheck_in_url() {
		return check_in_url;
	}
	public void setCheck_in_url(String check_in_url) {
		this.check_in_url = check_in_url;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public Date getBoarding_time() {
		return boarding_time;
	}
	public void setBoarding_time(Date boarding_time) {
		this.boarding_time = boarding_time;
	}
	public String getAir_model() {
		return air_model;
	}
	public void setAir_model(String air_model) {
		this.air_model = air_model;
	}
	

}
