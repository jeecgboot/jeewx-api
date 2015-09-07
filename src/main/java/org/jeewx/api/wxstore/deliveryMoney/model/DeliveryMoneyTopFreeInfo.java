package org.jeewx.api.wxstore.deliveryMoney.model;

import java.util.List;

public class DeliveryMoneyTopFreeInfo {
	// 快递类型ID
	private Integer Type;
	// 默认邮费计算方法
	private DeliveryMoneyNormalInfo Normal;
	// 指定地区邮费计算方法
	private List<DeliveryMoneyCustomInfo> Custom;
	
	public Integer getType() {
		return Type;
	}
	public void setType(Integer type) {
		Type = type;
	}
	public DeliveryMoneyNormalInfo getNormal() {
		return Normal;
	}
	public void setNormal(DeliveryMoneyNormalInfo normal) {
		Normal = normal;
	}
	public List<DeliveryMoneyCustomInfo> getCustom() {
		return Custom;
	}
	public void setCustom(List<DeliveryMoneyCustomInfo> custom) {
		Custom = custom;
	}
}
