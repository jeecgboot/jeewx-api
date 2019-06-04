package org.jeewx.api.coupon.manage.model;

import java.util.List;
/**
 * 基本的卡券数据.
 * @author mcl
 * @version v1.0
 */
public class BaseInfo {
	// card_id
	private String id;
	// 卡券的商户logo
	private String logo_url;
	// code 码展示类型 请参考常量类 CardConsts.CodeType
	private String code_type;
	// 商户名字
	private String brand_name;
	// 券名
	private String title;
	// 券颜色。色彩规范标注值对应的色值。如#3373bb
	private String color;
	// 使用提醒。（一句话描述，展示在首页）
	private String notice;
	// 客服电话
	private String service_phone;
	// 使用说明。长文本描述，可以分行。
	private String description;
	// 每人使用次数限制。
	private Integer use_limit;
	// 每人最大领取次数。
	private Integer get_limit;
	// 是否自定义code 码。
	private String use_custom_code;
	// 是否指定用户领取。
	private String bind_openid;
	// 领取卡券原生页面是否可分享，填写 true 或false，true 代表可分享。默认可分享。
	private boolean can_share;
	// 卡券是否可转赠，填写true 或false,true 代表可转赠。默认可转赠。
	private boolean can_give_friend;
	// 门店位置ID。
	private List<Integer> location_id_list;
	
	//update-begin----author:scott-----date:20150825---for:礼券获取详细信息报错处理-----
	private List<String> js_oauth_uin_list;
	public List<String> getJs_oauth_uin_list() {
		return js_oauth_uin_list;
	}
	public void setJs_oauth_uin_list(List<String> js_oauth_uin_list) {
		this.js_oauth_uin_list = js_oauth_uin_list;
	}
	//update-end----author:scott-----date:20150825---for:礼券获取详细信息报错处理-----
	
	// 使用日期，有效期的信息。
	private DateInfo date_info;
	// 商品信息。
	private Sku sku;
	// 商户自定义cell 名称，与custom_url 字段共同使用，目前支持类型参考 常量类CardConsts.UrlNameType。
	private String url_name_type;
	// 商户自定义cell 跳转外链的地址链 接,跳转页面内容需与自定义cell 名称保持一致。
	private String custom_url;
	// 第三方来源名，例如同程旅游、格瓦拉。
	private String source;
	// 卡券状态,请参考常量类 CardConsts.Status
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getService_phone() {
		return service_phone;
	}

	public void setService_phone(String service_phone) {
		this.service_phone = service_phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUse_limit() {
		return use_limit;
	}

	public void setUse_limit(Integer use_limit) {
		this.use_limit = use_limit;
	}

	public Integer getGet_limit() {
		return get_limit;
	}

	public void setGet_limit(Integer get_limit) {
		this.get_limit = get_limit;
	}

	public String getUse_custom_code() {
		return use_custom_code;
	}

	public void setUse_custom_code(String use_custom_code) {
		this.use_custom_code = use_custom_code;
	}

	public String getBind_openid() {
		return bind_openid;
	}

	public void setBind_openid(String bind_openid) {
		this.bind_openid = bind_openid;
	}

	public boolean isCan_share() {
		return can_share;
	}

	public void setCan_share(boolean can_share) {
		this.can_share = can_share;
	}

	public boolean isCan_give_friend() {
		return can_give_friend;
	}

	public void setCan_give_friend(boolean can_give_friend) {
		this.can_give_friend = can_give_friend;
	}

	public List<Integer> getLocation_id_list() {
		return location_id_list;
	}

	public void setLocation_id_list(List<Integer> location_id_list) {
		this.location_id_list = location_id_list;
	}

	public DateInfo getDate_info() {
		return date_info;
	}

	public void setDate_info(DateInfo date_info) {
		this.date_info = date_info;
	}

	public Sku getSku() {
		return sku;
	}

	public void setSku(Sku sku) {
		this.sku = sku;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
