package org.jeewx.api.coupon.location.model;

import java.util.List;

public class BatchgetRtn {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 错误信息
	private Integer count;
	//门店信息
	private List<LocationList> location_list;
	
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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<LocationList> getLocation_list() {
		return location_list;
	}
	public void setLocation_list(List<LocationList> location_list) {
		this.location_list = location_list;
	}
	
}
