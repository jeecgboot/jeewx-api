package org.jeewx.api.wxstore.shelf.model;

public class EidCInfo {
	// 分组信息
	private GroupCInfo group_info;
	// 控件3的ID
	private Integer eid;
	
	public GroupCInfo getGroup_info() {
		return group_info;
	}
	public void setGroup_info(GroupCInfo group_info) {
		this.group_info = group_info;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
}
