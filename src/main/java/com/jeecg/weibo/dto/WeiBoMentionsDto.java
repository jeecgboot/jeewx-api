package com.jeecg.weibo.dto;

public class WeiBoMentionsDto {
	//采用OAuth授权方式为必填参数，OAuth授权后获得。
	private String access_token	;
	//若指定此参数，则返回ID比since_id大的微博（即比since_id时间晚的微博），默认为0。
	private String since_id	;
	//若指定此参数，则返回ID小于或等于max_id的微博，默认为0。
	private String max_id;
	//单页返回的记录条数，最大不超过200，默认为20。
	private String count;
	//返回结果的页码，默认为1。
	private String page	;
	//作者筛选类型，0：全部、1：我关注的人、2：陌生人，默认为0。
	private String filter_by_author;
	//来源筛选类型，0：全部、1：来自微博、2：来自微群，默认为0。
	private String filter_by_source;	
	//原创筛选类型，0：全部微博、1：原创的微博，默认为0。
	private String filter_by_type;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getSince_id() {
		return since_id;
	}
	public void setSince_id(String since_id) {
		this.since_id = since_id;
	}
	public String getMax_id() {
		return max_id;
	}
	public void setMax_id(String max_id) {
		this.max_id = max_id;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getFilter_by_author() {
		return filter_by_author;
	}
	public void setFilter_by_author(String filter_by_author) {
		this.filter_by_author = filter_by_author;
	}
	public String getFilter_by_source() {
		return filter_by_source;
	}
	public void setFilter_by_source(String filter_by_source) {
		this.filter_by_source = filter_by_source;
	}
	public String getFilter_by_type() {
		return filter_by_type;
	}
	public void setFilter_by_type(String filter_by_type) {
		this.filter_by_type = filter_by_type;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MentionsDto [access_token=");
		builder.append(access_token);
		builder.append(", since_id=");
		builder.append(since_id);
		builder.append(", max_id=");
		builder.append(max_id);
		builder.append(", count=");
		builder.append(count);
		builder.append(", page=");
		builder.append(page);
		builder.append(", filter_by_author=");
		builder.append(filter_by_author);
		builder.append(", filter_by_source=");
		builder.append(filter_by_source);
		builder.append(", filter_by_type=");
		builder.append(filter_by_type);
		builder.append("]");
		return builder.toString();
	}
}
