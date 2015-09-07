package org.jeewx.api.coupon.location.model;

import org.jeewx.api.wxstore.product.model.Sku;

public class BaseInfo {
	//卡券的商户logo，尺寸为300*300。
	private String logo_url;
	//code 码展示类型
	private String code_type ;
	//商户名字,字数上限为12 个汉字
	private String brand_name;
	//券名
	private String title ;
	//券名的副标题
	private String sub_title;
	//券颜色
	private String color;
	//使用提醒
	private String notice ;
	//使用说明
	private String description;
	//门店位置ID
	private String location_id_list;
	//是否自定义code
	private Boolean use_custom_code;
	//是否指定用户领取
	private Boolean bind_openid;
	//领取卡券原生页面是否可分享
	private Boolean can_share;
	//卡券是否可转赠
	private Boolean can_give_friend;
	//每人最大领取次数
	private Integer get_limit;
	//客服电话
	private String service_phone;
	//第三方来源名
	private String source;
	//商户自定义cell 名称
	private String url_name_type;
	//商户自定义cell 跳转外链的地址链接
	private String custom_url;
	//商品信息
	private Sku sku;
	//使用日期，有效期的信息
	private DataInfo dataInfo;
	
	public String getLogo_url() {
		return logo_url;
	}
	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
	}
	public String getCode_type() {
		return code_type;
	}
	public void setCode_type(String code_type) {
		this.code_type = code_type;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSub_title() {
		return sub_title;
	}
	public void setSub_title(String sub_title) {
		this.sub_title = sub_title;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation_id_list() {
		return location_id_list;
	}
	public void setLocation_id_list(String location_id_list) {
		this.location_id_list = location_id_list;
	}
	public Boolean getUse_custom_code() {
		return use_custom_code;
	}
	public void setUse_custom_code(Boolean use_custom_code) {
		this.use_custom_code = use_custom_code;
	}
	public Boolean getBind_openid() {
		return bind_openid;
	}
	public void setBind_openid(Boolean bind_openid) {
		this.bind_openid = bind_openid;
	}
	public Boolean getCan_share() {
		return can_share;
	}
	public void setCan_share(Boolean can_share) {
		this.can_share = can_share;
	}
	public Boolean getCan_give_friend() {
		return can_give_friend;
	}
	public void setCan_give_friend(Boolean can_give_friend) {
		this.can_give_friend = can_give_friend;
	}
	public Integer getGet_limit() {
		return get_limit;
	}
	public void setGet_limit(Integer get_limit) {
		this.get_limit = get_limit;
	}
	public String getService_phone() {
		return service_phone;
	}
	public void setService_phone(String service_phone) {
		this.service_phone = service_phone;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUrl_name_type() {
		return url_name_type;
	}
	public void setUrl_name_type(String url_name_type) {
		this.url_name_type = url_name_type;
	}
	public String getCustom_url() {
		return custom_url;
	}
	public void setCustom_url(String custom_url) {
		this.custom_url = custom_url;
	}
	public Sku getSku() {
		return sku;
	}
	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public DataInfo getDataInfo() {
		return dataInfo;
	}
	public void setDataInfo(DataInfo dataInfo) {
		this.dataInfo = dataInfo;
	}
	
	
	     

}
