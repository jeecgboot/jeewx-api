package org.jeewx.api.wxstore.group.model;

public class GroupProduct {
	// 商品ID
	private String product_id;
	// 修改操作(0-删除, 1-增加)
	private Integer mod_action;

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public Integer getMod_action() {
		return mod_action;
	}

	public void setMod_action(Integer mod_action) {
		this.mod_action = mod_action;
	}

}
