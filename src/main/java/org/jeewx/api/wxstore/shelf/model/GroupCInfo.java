package org.jeewx.api.wxstore.shelf.model;

public class GroupCInfo {
	// 分组照片(图片需调用图片上传接口获得图片Url填写至此，否则添加货架失败，建议分辨率600*208)
	private String img;
	// 分组ID
	private Integer group_id;
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
}
