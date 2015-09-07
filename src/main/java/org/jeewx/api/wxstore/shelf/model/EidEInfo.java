package org.jeewx.api.wxstore.shelf.model;

public class EidEInfo {
	// 分组信息
	private GroupEInfos group_infos;
	// 分组照片(图片需调用图片上传接口获得图片Url填写至此，
	// 否则添加货架失败，建议分辨率640*1008)
	private String img_background;
	// 控件5的ID
	private Integer eid;
	
	public GroupEInfos getGroup_infos() {
		return group_infos;
	}
	public void setGroup_infos(GroupEInfos group_infos) {
		this.group_infos = group_infos;
	}
	public String getImg_background() {
		return img_background;
	}
	public void setImg_background(String img_background) {
		this.img_background = img_background;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	
}
