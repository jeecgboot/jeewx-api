package org.jeewx.api.wxstore.deliveryMoney.model;

public class DeliveryMoneyCustomInfo {
	// 起始计费数量
	private Integer StartStandards;
	// 起始计费金额(单位: 分）
	private Integer StartFees;
	// 递增计费数量
	private Integer AddStandards;
	// 递增计费金额(单位 : 分)
	private Integer AddFees;
	// 指定国家
	private String DestCountry;
	// 指定省份
	private String DestProvince;
	// 指定城市
	private String DestCity;
	
	public Integer getStartStandards() {
		return StartStandards;
	}
	public void setStartStandards(Integer startStandards) {
		StartStandards = startStandards;
	}
	public Integer getStartFees() {
		return StartFees;
	}
	public void setStartFees(Integer startFees) {
		StartFees = startFees;
	}
	public Integer getAddStandards() {
		return AddStandards;
	}
	public void setAddStandards(Integer addStandards) {
		AddStandards = addStandards;
	}
	public Integer getAddFees() {
		return AddFees;
	}
	public void setAddFees(Integer addFees) {
		AddFees = addFees;
	}
	public String getDestCountry() {
		return DestCountry;
	}
	public void setDestCountry(String destCountry) {
		DestCountry = destCountry;
	}
	public String getDestProvince() {
		return DestProvince;
	}
	public void setDestProvince(String destProvince) {
		DestProvince = destProvince;
	}
	public String getDestCity() {
		return DestCity;
	}
	public void setDestCity(String destCity) {
		DestCity = destCity;
	}
	
}
