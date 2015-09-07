package org.jeewx.api.coupon.location.model;

import java.util.List;

public class GetcolorsRtn {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	//颜色集合
	private List<Color> colors;
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
	public List<Color> getColors() {
		return colors;
	}
	public void setColors(List<Color> colors) {
		this.colors = colors;
	} 
	
	
}
