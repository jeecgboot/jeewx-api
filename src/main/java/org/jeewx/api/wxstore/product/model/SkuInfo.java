package org.jeewx.api.wxstore.product.model;

import java.util.List;

public class SkuInfo {
	// sku id
	private String id;
	// sku 名称
	private String name;
	// sku vid列表
	private List<SkuValue> value_list;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SkuValue> getValue_list() {
		return value_list;
	}
	public void setValue_list(List<SkuValue> value_list) {
		this.value_list = value_list;
	}
	
}
