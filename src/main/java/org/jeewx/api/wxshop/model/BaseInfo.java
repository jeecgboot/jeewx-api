package org.jeewx.api.wxshop.model;

import java.util.List;

public class BaseInfo {

	// 门店名称
	private String business_name;
	// 分店名称
	private String branch_name;
	//门店所在的省份
	private String province;
	// 门店所在的城市
	private String city;
	// 门店所在地区
	private String district;
	// 门店所在的详细街道地址
	private String address;
	// 门店的电话
	private String telephone;
	// 门店的类型
	private String categories;
	// 坐标类型
	private String offset_type;
	// 门店所在地理位置的经度
	private String longitude;
	// 门店所在地理位置的纬度
	private String latitude;
	// 特色服务
	private String special;
	// 营业时间
	private String open_time;
	// 人均价格
	private String avg_price;
	// 商户自己的id
	private String sid;
	// 商户简介
	private String introduction;
	//推荐品
	private String recommend;
	//图片列表
	private List<Photo> photo_list;
	// 审核状态
	private String available_state;
	// 修改状态
	private String update_status;
		
	// 商户的id
	private String poi_id;
	
	
	public String getPoi_id() {
		return poi_id;
	}
	public void setPoi_id(String poi_id) {
		this.poi_id = poi_id;
	}
	public String getAvailable_state() {
		return available_state;
	}
	public void setAvailable_state(String available_state) {
		this.available_state = available_state;
	}
	public String getUpdate_status() {
		return update_status;
	}
	public void setUpdate_status(String update_status) {
		this.update_status = update_status;
	}
	public List<Photo> getPhoto_list() {
		return photo_list;
	}
	public void setPhoto_list(List<Photo> photo_list) {
		this.photo_list = photo_list;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getOffset_type() {
		return offset_type;
	}
	public void setOffset_type(String offset_type) {
		this.offset_type = offset_type;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getOpen_time() {
		return open_time;
	}
	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}
	public String getAvg_price() {
		return avg_price;
	}
	public void setAvg_price(String avg_price) {
		this.avg_price = avg_price;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
		
	

}
