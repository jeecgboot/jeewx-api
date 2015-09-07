package org.jeewx.api.coupon.manage.model;

import java.util.List;
/**
 * 可以被更新的卡券基础数据.
 * @author mcl
 * @version v1.0
 */
public class BaseInfoUpdate {
	// 卡券的商户logo
	private String logo_url;
	// 使用提醒。（一句话描述，展示在首页）
	private String notice;
	// 使用说明。长文本描述，可以分行。
	private String description;
	// 客服电话
	private String service_phone;
	// 券颜色。色彩规范标注值对应的色值。如#3373bb
	private String color;
	// 门店位置ID。
	private List<Integer> location_id_list;
	// 商户自定义cell 名称，与custom_url 字段共同使用，目前支持类型参考 常量类CardConsts.UrlNameType。
	private String url_name_type;
	// 商户自定义cell 跳转外链的地址链 接,跳转页面内容需与自定义cell 名称保持一致。
	private String custom_url;
	// code 码展示类型 请参考常量类 CardConsts.CodeType
	private String code_type;
	// 每人使用次数限制。
	private Integer use_limit;
	// 每人最大领取次数。
	private Integer get_limit;
	// 领取卡券原生页面是否可分享，填写 true 或false，true 代表可分享。默认可分享。
	private boolean can_share;
	// 卡券是否可转赠，填写true 或false,true 代表可转赠。默认可转赠。
	private boolean can_give_friend;
	// 使用日期，有效期的信息。
	private DateInfoUpdate date_info;
	public String getLogo_url() {
		return logo_url;
	}
	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
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
	public String getService_phone() {
		return service_phone;
	}
	public void setService_phone(String service_phone) {
		this.service_phone = service_phone;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<Integer> getLocation_id_list() {
		return location_id_list;
	}
	public void setLocation_id_list(List<Integer> location_id_list) {
		this.location_id_list = location_id_list;
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
	public String getCode_type() {
		return code_type;
	}
	public void setCode_type(String code_type) {
		this.code_type = code_type;
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
	public DateInfoUpdate getDate_info() {
		return date_info;
	}
	public void setDate_info(DateInfoUpdate date_info) {
		this.date_info = date_info;
	}
	
	

}
