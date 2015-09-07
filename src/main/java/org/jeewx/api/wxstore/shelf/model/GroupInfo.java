package org.jeewx.api.wxstore.shelf.model;

public class GroupInfo {
	// 该控件展示商品个数
	private FilterInfo filter;
	// 分组ID
	private Integer group_id;
	
	public FilterInfo getFilter() {
		return filter;
	}
	public void setFilter(FilterInfo filter) {
		this.filter = filter;
	}
	public Integer getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
	
}
