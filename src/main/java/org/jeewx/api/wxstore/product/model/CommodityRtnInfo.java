package org.jeewx.api.wxstore.product.model;

public class CommodityRtnInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 商品ID
	private String product_id;
	
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
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	
}
