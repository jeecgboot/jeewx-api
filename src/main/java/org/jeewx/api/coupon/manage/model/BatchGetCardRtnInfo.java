package org.jeewx.api.coupon.manage.model;

import java.util.List;

public class BatchGetCardRtnInfo {
	// 错误码
	private String errcode;
	// 错误信息
	private String errmsg;
	// 卡id 列表
	private List<String> card_id_list;
	// 该商户名下card_id 总数
	private Integer total_num;

	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public List<String> getCard_id_list() {
		return card_id_list;
	}

	public void setCard_id_list(List<String> card_id_list) {
		this.card_id_list = card_id_list;
	}

	public Integer getTotal_num() {
		return total_num;
	}

	public void setTotal_num(Integer total_num) {
		this.total_num = total_num;
	}

}
