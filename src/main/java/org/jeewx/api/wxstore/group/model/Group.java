package org.jeewx.api.wxstore.group.model;

public class Group {
	// 分组详细
	private GroupDetailInfo group_detail;
	// 分组D
	private Integer group_id;
	// 分组名称
	private String group_name;

	public GroupDetailInfo getGroup_detail() {
		return group_detail;
	}

	public void setGroup_detail(GroupDetailInfo group_detail) {
		this.group_detail = group_detail;
	}

	public Integer getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

}
