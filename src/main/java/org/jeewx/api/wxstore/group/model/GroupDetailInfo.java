package org.jeewx.api.wxstore.group.model;

import java.util.List;

public class GroupDetailInfo {
	// 分组名称
	private String group_id;
	// 分组名称
	private String group_name;
	// 商品ID集合
	private List<String> product_list;

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public List<String> getProduct_list() {
		return product_list;
	}

	public void setProduct_list(List<String> product_list) {
		this.product_list = product_list;
	}
}
