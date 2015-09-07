package org.jeewx.api.coupon.location.model;

import java.util.Date;

public class DataInfo {

	private String type;
	private Date begin_timestamp ;
	private Date end_timestamp;
	private String fixed_term ;
	private String fixed_begin_term;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getBegin_timestamp() {
		return begin_timestamp;
	}
	public void setBegin_timestamp(Date begin_timestamp) {
		this.begin_timestamp = begin_timestamp;
	}
	public Date getEnd_timestamp() {
		return end_timestamp;
	}
	public void setEnd_timestamp(Date end_timestamp) {
		this.end_timestamp = end_timestamp;
	}
	public String getFixed_term() {
		return fixed_term;
	}
	public void setFixed_term(String fixed_term) {
		this.fixed_term = fixed_term;
	}
	public String getFixed_begin_term() {
		return fixed_begin_term;
	}
	public void setFixed_begin_term(String fixed_begin_term) {
		this.fixed_begin_term = fixed_begin_term;
	}
	
	
	     

}
