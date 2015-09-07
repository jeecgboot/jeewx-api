package org.jeewx.api.report.datastatistics.graphicanalysis.model;

import java.util.List;


/** 
* @ClassName: GraphicAnalysisRtnInfo 
* @Description: 图文分析数据接口返回值
* @author zhaoxl
* @date 2015年1月29日 下午10:44:11  
*/
public class GraphicAnalysisRtnInfo {

	/** 
	* 数据的日期，需在begin_date和end_date之间
	*/ 
	private String ref_date;
	/** 
	* 数据的小时<br/>
	* 包括从000到2300，分别代表的是<br/>
	* [000,100)到[2300,2400)<br/>
	* 即每日的第1小时和最后1小时
	*/ 
	private String ref_hour;
	/** 
	* @统计的日期，在getarticletotal接口中，<br/>
	* ref_date指的是文章群发出日期， 而stat_date是数据统计日期
	*/ 
	private String stat_date;
	/** 
	* 这里的msgid实际上是由msgid（图文消息id）和index（消息次序索引）组成， <br/>
	* 例如12003_3， 其中12003是msgid，即一次群发的id消息的； <br/>
	* 3为index，假设该次群发的图文消息共5个文章（因为可能为多图文）， 3表示5个中的第3个
	*/ 
	private String msgid;
	/** 
	* 图文消息的标题
	*/ 
	private String title;
	/** 
	* 图文页（点击群发图文卡片进入的页面）的阅读人数
	*/ 
	private Integer int_page_read_user;
	/** 
	* 图文页的阅读次数
	*/ 
	private Integer int_page_read_count;
	/** 
	* 原文页（点击图文页“阅读原文”进入的页面）的阅读人数，无原文页时此处数据为0
	*/ 
	private Integer ori_page_read_user;
	/** 
	* 原文页的阅读次数
	*/ 
	private Integer ori_page_read_count;
	/** 
	* 分享的场景
	* 1代表好友转发 
	* 2代表朋友圈 
	* 3代表腾讯微博 
	* 255代表其他
	*/ 
	private Integer share_scene;
	/** 
	* 分享的人数
	*/ 
	private Integer share_user;
	/** 
	* 分享的次数
	*/ 
	private Integer share_count;
	/** 
	* 收藏的人数
	*/ 
	private Integer add_to_fav_user;
	/** 
	* 收藏的次数
	*/ 
	private Integer add_to_fav_count;
	/** 
	* 送达人数，一般约等于总粉丝数<br/>
	* （需排除黑名单或其他异常情况下无法收到消息的粉丝）
	*/ 
	private Integer target_user;
	/** 
	* 用户来源
	*/ 
	private Integer user_source;
	/** 
	*  
	*/ 
	private Integer total_online_time;
	
	
	private   List<GraphicAnalysisRtnInfo>      details;
	
	
	public List<GraphicAnalysisRtnInfo> getDetails() {
		return details;
	}
	public void setDetails(List<GraphicAnalysisRtnInfo> details) {
		this.details = details;
	}
	public Integer getTotal_online_time() {
		return total_online_time;
	}
	public void setTotal_online_time(Integer total_online_time) {
		this.total_online_time = total_online_time;
	}
	public Integer getUser_source() {
		return user_source;
	}
	public void setUser_source(Integer user_source) {
		this.user_source = user_source;
	}
	public String getRef_date() {
		return ref_date;
	}
	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}
	public String getRef_hour() {
		return ref_hour;
	}
	public void setRef_hour(String ref_hour) {
		this.ref_hour = ref_hour;
	}
	public String getStat_date() {
		return stat_date;
	}
	public void setStat_date(String stat_date) {
		this.stat_date = stat_date;
	}
	public String getMsgid() {
		return msgid;
	}
	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String  title){
		this.title = title;
	}
	public Integer getInt_page_read_user() {
		return int_page_read_user;
	}
	public void setInt_page_read_user(Integer int_page_read_user) {
		this.int_page_read_user = int_page_read_user;
	}
	public Integer getInt_page_read_count() {
		return int_page_read_count;
	}
	public void setInt_page_read_count(Integer int_page_read_count) {
		this.int_page_read_count = int_page_read_count;
	}
	public Integer getOri_page_read_user() {
		return ori_page_read_user;
	}
	public void setOri_page_read_user(Integer ori_page_read_user) {
		this.ori_page_read_user = ori_page_read_user;
	}
	public Integer getOri_page_read_count() {
		return ori_page_read_count;
	}
	public void setOri_page_read_count(Integer ori_page_read_count) {
		this.ori_page_read_count = ori_page_read_count;
	}
	public Integer getShare_scene() {
		return share_scene;
	}
	public void setShare_scene(Integer share_scene) {
		this.share_scene = share_scene;
	}
	public Integer getShare_user() {
		return share_user;
	}
	public void setShare_user(Integer share_user) {
		this.share_user = share_user;
	}
	public Integer getShare_count() {
		return share_count;
	}
	public void setShare_count(Integer share_count) {
		this.share_count = share_count;
	}
	public Integer getAdd_to_fav_user() {
		return add_to_fav_user;
	}
	public void setAdd_to_fav_user(Integer add_to_fav_user) {
		this.add_to_fav_user = add_to_fav_user;
	}
	public Integer getAdd_to_fav_count() {
		return add_to_fav_count;
	}
	public void setAdd_to_fav_count(Integer add_to_fav_count) {
		this.add_to_fav_count = add_to_fav_count;
	}
	public Integer getTarget_user() {
		return target_user;
	}
	public void setTarget_user(Integer target_user) {
		this.target_user = target_user;
	}
	
	
}
