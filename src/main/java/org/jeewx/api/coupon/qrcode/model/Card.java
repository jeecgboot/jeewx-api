package org.jeewx.api.coupon.qrcode.model;

public class Card {
	//卡券ID
	private String card_id ;
	//指定卡券code 码，只能被领一次
	private String code ;
	//指定领取者的openid，只有该用户能领取
	private String openid ;
	//指定二维码的有效时间，范围是60 ~ 1800 秒。不填默认为永久有效。
	private Integer expire_seconds ;
	//指定下发二维码	
	private Boolean is_unique_code ;
	//红包余额
	private String balance ;
	//领取场景值
	private Long outer_id ;
	public String getCard_id() {
		return card_id;
	}
	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public Integer getExpire_seconds() {
		return expire_seconds;
	}
	public void setExpire_seconds(Integer expire_seconds) {
		this.expire_seconds = expire_seconds;
	}
	public Boolean getIs_unique_code() {
		return is_unique_code;
	}
	public void setIs_unique_code(Boolean is_unique_code) {
		this.is_unique_code = is_unique_code;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public Long getOuter_id() {
		return outer_id;
	}
	public void setOuter_id(Long outer_id) {
		this.outer_id = outer_id;
	}
	

}
