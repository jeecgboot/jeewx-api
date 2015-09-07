package org.jeewx.api.wxstore.shelf.model;

public class EidDInfo {
	// 分组信息
	private GroupDInfos group_infos;
	// 控件4的ID
	private Integer eid;
	
	public GroupDInfos getGroup_infos() {
		return group_infos;
	}
	public void setGroup_infos(GroupDInfos group_infos) {
		this.group_infos = group_infos;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	
}
