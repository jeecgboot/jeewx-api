package org.jeewx.api.wxstore.group.model;

public class GroupRtnInfo {
	// 错误码
	private Integer errcode;
	// 错误信息
	private String errmsg;
	// 分组ID
	private Integer group_id;

	public Integer getErrcode() {
		return errcode;
	}

	public void setErrcode(Integer errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public Integer getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
}
