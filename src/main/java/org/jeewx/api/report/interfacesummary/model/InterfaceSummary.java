package org.jeewx.api.report.interfacesummary.model;

public class InterfaceSummary {
	// 数据的日期
	private String ref_date;
	// 通过服务器配置地址获得消息后，被动回复用户消息的次数
	private Integer callback_count;
	// 上述动作的失败次数
	private Integer fail_count;
	// 总耗时，除以callback_count即为平均耗时
	private Integer total_time_cost;
	// 最大耗时
	private Integer max_time_cost;
	
	public String getRef_date() {
		return ref_date;
	}
	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}
	public Integer getCallback_count() {
		return callback_count;
	}
	public void setCallback_count(Integer callback_count) {
		this.callback_count = callback_count;
	}
	public Integer getFail_count() {
		return fail_count;
	}
	public void setFail_count(Integer fail_count) {
		this.fail_count = fail_count;
	}
	public Integer getTotal_time_cost() {
		return total_time_cost;
	}
	public void setTotal_time_cost(Integer total_time_cost) {
		this.total_time_cost = total_time_cost;
	}
	public Integer getMax_time_cost() {
		return max_time_cost;
	}
	public void setMax_time_cost(Integer max_time_cost) {
		this.max_time_cost = max_time_cost;
	}
}
