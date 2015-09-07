package org.jeewx.api.wxstore.deliveryMoney.model;

import java.util.List;

public class DeliveryMoney {
	// 邮费模板名称
	private String Name;
	// 支付方式(0-买家承担运费, 1-卖家承担运费)
	private Integer Assumer;
	// 计费单位(0-按件计费, 1-按重量计费, 2-按体积计费，目前只支持按件计费，默认为0)
	private Integer Valuation;
	// 具体运费计算
	private List<DeliveryMoneyTopFreeInfo> TopFee;
	// 邮费模板ID
	private Integer template_id;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getAssumer() {
		return Assumer;
	}
	public void setAssumer(Integer assumer) {
		Assumer = assumer;
	}
	public Integer getValuation() {
		return Valuation;
	}
	public void setValuation(Integer valuation) {
		Valuation = valuation;
	}
	public List<DeliveryMoneyTopFreeInfo> getTopFee() {
		return TopFee;
	}
	public void setTopFee(List<DeliveryMoneyTopFreeInfo> topFee) {
		TopFee = topFee;
	}
	public Integer getTemplate_id() {
		return template_id;
	}
	public void setTemplate_id(Integer template_id) {
		this.template_id = template_id;
	}
	
}
