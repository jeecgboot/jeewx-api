package org.jeewx.api.wxstore.order.model;

public class OrderInfo {
	// 订单ID
	private String order_id;
	// 订单状态
	private Integer order_status;
	// 订单总价格(单位 : 分)
	private Integer order_total_price;
	// 订单创建时间
	private Integer order_create_time;
	// 订单运费价格(单位 : 分)
	private Integer order_express_price;
	// 买家微信OPENID
	private String buyer_openid;
	// 买家微信昵称
	private String buyer_nick;
	// 收货人姓名
	private String receiver_name;
	// 收货地址省份
	private String receiver_province;
	// 收货地址城市
	private String receiver_city;
	// 收货地址区/县
	private String receiver_zone;
	// 收货详细地址
	private String receiver_address;
	// 收货人移动电话
	private String receiver_mobile;
	// 收货人固定电话
	private String receiver_phone;
	// 商品ID
	private String product_id;
	// 商品名称
	private String product_name;
	// 商品价格(单位 : 分)
	private Integer product_price;
	// 商品SKU
	private String product_sku;
	// 商品个数
	private Integer product_count;
	// 商品图片
	private String product_img;
	// 运单ID
	private String delivery_id;
	// 物流公司编码
	private String delivery_company;
	// 交易ID
	private String trans_id;
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public Integer getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}
	public Integer getOrder_total_price() {
		return order_total_price;
	}
	public void setOrder_total_price(Integer order_total_price) {
		this.order_total_price = order_total_price;
	}
	public Integer getOrder_create_time() {
		return order_create_time;
	}
	public void setOrder_create_time(Integer order_create_time) {
		this.order_create_time = order_create_time;
	}
	public Integer getOrder_express_price() {
		return order_express_price;
	}
	public void setOrder_express_price(Integer order_express_price) {
		this.order_express_price = order_express_price;
	}
	public String getBuyer_openid() {
		return buyer_openid;
	}
	public void setBuyer_openid(String buyer_openid) {
		this.buyer_openid = buyer_openid;
	}
	public String getBuyer_nick() {
		return buyer_nick;
	}
	public void setBuyer_nick(String buyer_nick) {
		this.buyer_nick = buyer_nick;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public String getReceiver_province() {
		return receiver_province;
	}
	public void setReceiver_province(String receiver_province) {
		this.receiver_province = receiver_province;
	}
	public String getReceiver_city() {
		return receiver_city;
	}
	public void setReceiver_city(String receiver_city) {
		this.receiver_city = receiver_city;
	}
	public String getReceiver_zone() {
		return receiver_zone;
	}
	public void setReceiver_zone(String receiver_zone) {
		this.receiver_zone = receiver_zone;
	}
	public String getReceiver_address() {
		return receiver_address;
	}
	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}
	public String getReceiver_mobile() {
		return receiver_mobile;
	}
	public void setReceiver_mobile(String receiver_mobile) {
		this.receiver_mobile = receiver_mobile;
	}
	public String getReceiver_phone() {
		return receiver_phone;
	}
	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Integer getProduct_price() {
		return product_price;
	}
	public void setProduct_price(Integer product_price) {
		this.product_price = product_price;
	}
	public String getProduct_sku() {
		return product_sku;
	}
	public void setProduct_sku(String product_sku) {
		this.product_sku = product_sku;
	}
	public Integer getProduct_count() {
		return product_count;
	}
	public void setProduct_count(Integer product_count) {
		this.product_count = product_count;
	}
	public String getProduct_img() {
		return product_img;
	}
	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}
	public String getDelivery_id() {
		return delivery_id;
	}
	public void setDelivery_id(String delivery_id) {
		this.delivery_id = delivery_id;
	}
	public String getDelivery_company() {
		return delivery_company;
	}
	public void setDelivery_company(String delivery_company) {
		this.delivery_company = delivery_company;
	}
	public String getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	
}
