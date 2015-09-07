package org.jeewx.api.wxstore.shelf.model;

public class ShelfRInfo {
	// 货架信息(数据说明详见《货架控件说明》)特别说明：货架信息使用要参考官方API文档说明
	private Object shelf_info;
	// 货架招牌图片Url(图片需调用图片上传接口获得图片Url填写至此，否则添加货架失败，
	// 建议尺寸为640*120，仅控件1-4有banner，控件5没有banner)
	private String shelf_banner;
	// 货架名称
	private String shelf_name;
	private Integer shelf_id;
	
	public Object getShelf_info() {
		return shelf_info;
	}
	public void setShelf_info(Object shelf_info) {
		this.shelf_info = shelf_info;
	}
	public String getShelf_banner() {
		return shelf_banner;
	}
	public void setShelf_banner(String shelf_banner) {
		this.shelf_banner = shelf_banner;
	}
	public String getShelf_name() {
		return shelf_name;
	}
	public void setShelf_name(String shelf_name) {
		this.shelf_name = shelf_name;
	}
	public Integer getShelf_id() {
		return shelf_id;
	}
	public void setShelf_id(Integer shelf_id) {
		this.shelf_id = shelf_id;
	}
	
}
