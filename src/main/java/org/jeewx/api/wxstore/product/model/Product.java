package org.jeewx.api.wxstore.product.model;

import java.util.List;

public class Product {
	// 商品id
	private String product_id;
	// 基本属性
	private AttrInfo product_base;
	// sku信息列表
	private List<Sku> sku_list;
	// 商品其他属性
	private AttrExt attrext;
	// 运费信息
	private DeliveryInfo delivery_info;
	// 状态
	private Integer status;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public AttrInfo getProduct_base() {
		return product_base;
	}
	public void setProduct_base(AttrInfo product_base) {
		this.product_base = product_base;
	}
	public List<Sku> getSku_list() {
		return sku_list;
	}
	public void setSku_list(List<Sku> sku_list) {
		this.sku_list = sku_list;
	}
	public AttrExt getAttrext() {
		return attrext;
	}
	public void setAttrext(AttrExt attrext) {
		this.attrext = attrext;
	}
	public DeliveryInfo getDelivery_info() {
		return delivery_info;
	}
	public void setDelivery_info(DeliveryInfo delivery_info) {
		this.delivery_info = delivery_info;
	}
}
