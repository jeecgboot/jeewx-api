package org.jeewx.api.wxstore.product.model;

public class Sku {
	// sku信息
	private String sku_id;
	// 商家商品编码
	private String product_code;
	// icon图片
	private String icon_url;
	// sku原价
	private Integer ori_price;
	// sku微信价
	private Integer price;
	// sku库存
	private Integer quantity;
	
	public String getSku_id() {
		return sku_id;
	}
	public void setSku_id(String sku_id) {
		this.sku_id = sku_id;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getIcon_url() {
		return icon_url;
	}
	public void setIcon_url(String icon_url) {
		this.icon_url = icon_url;
	}
	public Integer getOri_price() {
		return ori_price;
	}
	public void setOri_price(Integer ori_price) {
		this.ori_price = ori_price;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
