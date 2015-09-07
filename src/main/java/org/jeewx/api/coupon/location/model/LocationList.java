package org.jeewx.api.coupon.location.model;

public class LocationList {
	//门店名称
	private String business_name ;
	//分店名
	private String branch_name ;
	//门店所在的省
	private String province ;
	//门店所在的市
	private String city ;
	//门店所在的区
	private String district ;
	//门店所在的详细街道地址
	private String address ;
	//门店的电话
	private String telephone ;
	//门店的类型（酒店、餐饮、购物...） 
	private String category ;
	//门店所在地理位置的经度（建议使用腾讯地图定位经纬度）
	private String longitude ;
	//纬度
	private String latitude;
	/*//门店ID
	private String location_id;
	//联系电话
	private String phone;*/
	
	
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	/*public String getLocation_id() {
		return location_id;
	}
	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}*/
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	
}
