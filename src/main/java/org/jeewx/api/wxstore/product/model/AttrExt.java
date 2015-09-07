package org.jeewx.api.wxstore.product.model;

public class AttrExt {
	// 是否包邮
	private Integer isPostFree;
	// 是否提供发票
	private Integer isHasReceipt;
	// 是否保修
	private Integer isUnderGuaranty;
	// 是否支持退换货
	private Integer isSupportReplace;
	// 商品所在地地址
	private AttrExtLocation location;
	public Integer getIsPostFree() {
		return isPostFree;
	}
	public void setIsPostFree(Integer isPostFree) {
		this.isPostFree = isPostFree;
	}
	public Integer getIsHasReceipt() {
		return isHasReceipt;
	}
	public void setIsHasReceipt(Integer isHasReceipt) {
		this.isHasReceipt = isHasReceipt;
	}
	public Integer getIsUnderGuaranty() {
		return isUnderGuaranty;
	}
	public void setIsUnderGuaranty(Integer isUnderGuaranty) {
		this.isUnderGuaranty = isUnderGuaranty;
	}
	public Integer getIsSupportReplace() {
		return isSupportReplace;
	}
	public void setIsSupportReplace(Integer isSupportReplace) {
		this.isSupportReplace = isSupportReplace;
	}
	public AttrExtLocation getLocation() {
		return location;
	}
	public void setLocation(AttrExtLocation location) {
		this.location = location;
	}
}
