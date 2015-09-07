package org.jeewx.api.coupon.manage.model;

public class GetCardRtnInfoCard {
	//卡券ID
	private String card_id;
	//起始使用时间
	private long begin_time;
	//结束时间
	private long end_time;

	public String getCard_id() {
		return card_id;
	}

	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}

	public long getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(long begin_time) {
		this.begin_time = begin_time;
	}

	public long getEnd_time() {
		return end_time;
	}

	public void setEnd_time(long end_time) {
		this.end_time = end_time;
	}

}
