package org.jeewx.api.coupon.location.model;

import java.util.List;

public class BatchaddRtn {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	//门店ID
	private List<String> location_id_list;
	
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public List<String> getLocation_id_list() {
		return location_id_list;
	}
	public void setLocation_id_list(List<String> location_id_list) {
		this.location_id_list = location_id_list;
	}
	
	
	
}
