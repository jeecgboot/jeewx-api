package org.jeewx.api.wxstore.shelf.model;

public class EidBInfo {
	// 分组数组
	private GroupInfos group_infos;
	// 控件2的ID
	private Integer eid;
	
	public GroupInfos getGroup_infos() {
		return group_infos;
	}
	public void setGroup_infos(GroupInfos group_infos) {
		this.group_infos = group_infos;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
}
