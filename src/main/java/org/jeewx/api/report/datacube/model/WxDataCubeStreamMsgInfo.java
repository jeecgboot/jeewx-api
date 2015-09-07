package org.jeewx.api.report.datacube.model;


/**
 * 结果类--获取消息发送概况数据
 * @author luweichao
 *
 * 2015年1月27日
 */
public class WxDataCubeStreamMsgInfo {
	
	/**日期**/
	private String ref_date;
	
	/**类型**/
	private String msg_type;
	
	/**用户**/
	private String msg_user;
	
	/**总数**/
	private String msg_count;
	
	public String getRef_date() {
		return ref_date;
	}
	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}
	public String getMsg_type() {
		return msg_type;
	}
	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}
	public String getMsg_user() {
		return msg_user;
	}
	public void setMsg_user(String msg_user) {
		this.msg_user = msg_user;
	}
	public String getMsg_count() {
		return msg_count;
	}
	public void setMsg_count(String msg_count) {
		this.msg_count = msg_count;
	}
	 
}
