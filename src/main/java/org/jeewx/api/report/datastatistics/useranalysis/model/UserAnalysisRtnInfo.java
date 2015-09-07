package org.jeewx.api.report.datastatistics.useranalysis.model;

/** 
* @ClassName: UserAnalysisRtnInfo 
* @Description: 用户分析数据接口返回值
* @author zhaoxl
* @date 2015年1月29日 下午10:44:11  
*/
public class UserAnalysisRtnInfo {

	/** 
	* 数据的日期
	*/ 
	private String ref_date;
	/** 
	* 用户的渠道，数值代表的含义如下：<br/>
	* <li>0代表其他</li>
	* <li>30代表扫二维码</li>
	* <li>17代表名片分享</li>
	* <li>35代表搜号码（即微信添加朋友页的搜索）</li>
	* <li>39代表查询微信公众帐号 </li>
	* <li>43代表图文页右上角菜单</li>
	*/ 
	private Integer user_source;
	/** 
	* 新增的用户数量
	*/ 
	private Integer new_user;
	/** 
	* 取消关注的用户数量，new_user减去cancel_user即为净增用户数量
	*/ 
	private Integer cancel_user;
	/** 
	* 总用户量
	*/ 
	private Integer cumulate_user;
	public String getRef_date() {
		return ref_date;
	}
	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}
	public Integer getUser_source() {
		return user_source;
	}
	public void setUser_source(Integer user_source) {
		this.user_source = user_source;
	}
	public Integer getNew_user() {
		return new_user;
	}
	public void setNew_user(Integer new_user) {
		this.new_user = new_user;
	}
	public Integer getCancel_user() {
		return cancel_user;
	}
	public void setCancel_user(Integer cancel_user) {
		this.cancel_user = cancel_user;
	}
	public Integer getCumulate_user() {
		return cumulate_user;
	}
	public void setCumulate_user(Integer cumulate_user) {
		this.cumulate_user = cumulate_user;
	}
}
