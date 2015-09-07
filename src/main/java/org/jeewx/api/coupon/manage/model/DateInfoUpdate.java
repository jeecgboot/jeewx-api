package org.jeewx.api.coupon.manage.model;
/**
 * 可以被更新的卡券的使用日期信息。
 * @author mcl
 * @version v1.0
 */
public class DateInfoUpdate {
	// 使用时间的类型。1：固定日期区间，2：固定时长（自领取后按天算）
	private Integer type;
	// 固定日期区间专用，表示起用时间
	private Long begin_timestamp;
	// 固定日期区间专用，表示结束时间
	private Long end_timestamp;
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Long getBegin_timestamp() {
		return begin_timestamp;
	}
	public void setBegin_timestamp(Long begin_timestamp) {
		this.begin_timestamp = begin_timestamp;
	}
	public Long getEnd_timestamp() {
		return end_timestamp;
	}
	public void setEnd_timestamp(Long end_timestamp) {
		this.end_timestamp = end_timestamp;
	}


}
