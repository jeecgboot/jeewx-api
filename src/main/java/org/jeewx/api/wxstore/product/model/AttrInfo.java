package org.jeewx.api.wxstore.product.model;

import java.util.List;

public class AttrInfo {
	// 商品名称
	private String name;
	// 商品分类id
	private List<String> category_id;
	// 商品主图
	private String main_img;
	// 商品图片列表
	private List<String> img;
	// 商品详情列表
	private List<AttrInfoDetail> detail;
	// 商品属性列表List
	private List<AttrInfoProperty> property;
	// 商品sku定义
	private List<AttrInfoSku> sku_info;
	// 用户商品限购数量
	private Integer buy_limit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCategory_id() {
		return category_id;
	}
	public void setCategory_id(List<String> category_id) {
		this.category_id = category_id;
	}
	public String getMain_img() {
		return main_img;
	}
	public void setMain_img(String main_img) {
		this.main_img = main_img;
	}
	public List<String> getImg() {
		return img;
	}
	public void setImg(List<String> img) {
		this.img = img;
	}
	public List<AttrInfoDetail> getDetail() {
		return detail;
	}
	public void setDetail(List<AttrInfoDetail> detail) {
		this.detail = detail;
	}
	public List<AttrInfoProperty> getProperty() {
		return property;
	}
	public void setProperty(List<AttrInfoProperty> property) {
		this.property = property;
	}
	public List<AttrInfoSku> getSku_info() {
		return sku_info;
	}
	public void setSku_info(List<AttrInfoSku> sku_info) {
		this.sku_info = sku_info;
	}
	public Integer getBuy_limit() {
		return buy_limit;
	}
	public void setBuy_limit(Integer buy_limit) {
		this.buy_limit = buy_limit;
	}
	
}
