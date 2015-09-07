package org.jeewx.api.wxstore.stock.model;

public class StockInfo {
	// 商品ID
	private String product_id;
	// sku信息
	private String sku_info;
	// 库存数量
	private Integer quantity;
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getSku_info() {
		return sku_info;
	}
	public void setSku_info(String sku_info) {
		this.sku_info = sku_info;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
