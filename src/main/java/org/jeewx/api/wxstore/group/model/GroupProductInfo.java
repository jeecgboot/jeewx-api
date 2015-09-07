package org.jeewx.api.wxstore.group.model;

import java.util.List;

public class GroupProductInfo {
	// 分组ID
	private Integer group_id;
	// 分组的商品集合
	private List<GroupProduct> product;

	public Integer getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}

	public List<GroupProduct> getProduct() {
		return product;
	}

	public void setProduct(List<GroupProduct> product) {
		this.product = product;
	}

}
