package org.jeewx.api.wxstore.shelf.model;

public class ShelfRtnInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 货架ID
	private Integer shelf_id;
	
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
	public Integer getShelf_id() {
		return shelf_id;
	}
	public void setShelf_id(Integer shelf_id) {
		this.shelf_id = shelf_id;
	}
	
}
