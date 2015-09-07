package org.jeewx.api.wxstore.deliveryMoney.model;

public class DeliveryMoneyNormalInfo {
	// 起始计费数量(比如计费单位是按件, 填2代表起始计费为2件)
	private Integer StartStandards;
	// 起始计费金额(单位: 分）
	private Integer StartFees;
	// 递增计费数量
	private Integer AddStandards;
	// 递增计费金额(单位 : 分)
	private Integer AddFees;
	
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
	
}
