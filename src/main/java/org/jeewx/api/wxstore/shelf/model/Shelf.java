package org.jeewx.api.wxstore.shelf.model;

public class Shelf {
	// 货架信息(数据说明详见《货架控件说明》)特别说明：货架信息使用要参考官方API文档说明
	// 不同的货架对应的对象不同，分别是EidAInfo代表代表控件1，EidBInfo代表代表控件2...
	// 1,2,3,4可以相互搭配，5不能和1234搭配使用。shelf_data参数代表是按个控件就转换为对应的对象。
	private Object shelf_data;
	// 货架招牌图片Url(图片需调用图片上传接口获得图片Url填写至此，否则添加货架失败，
	// 建议尺寸为640*120，仅控件1-4有banner，控件5没有banner)
	private String shelf_banner;
	// 货架名称
	private String shelf_name;
	
	private Integer shelf_id;
	
	public Integer getShelf_id() {
		return shelf_id;
	}
	public void setShelf_id(Integer shelf_id) {
		this.shelf_id = shelf_id;
	}
	public Object getShelf_data() {
		return shelf_data;
	}
	public void setShelf_data(Object shelf_data) {
		this.shelf_data = shelf_data;
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
	
}
