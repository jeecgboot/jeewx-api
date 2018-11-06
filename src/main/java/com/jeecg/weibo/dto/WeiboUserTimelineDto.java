package com.jeecg.weibo.dto;

public class WeiboUserTimelineDto {
	//	采用OAuth授权方式为必填参数，OAuth授权后获得	
	private String access_token ;
	//需要查询的用户ID
	private String  uid;
	//需要查询的用户昵称
	private String screen_name;
	//若指定此参数，则返回ID比since_id大的微博（即比since_id时间晚的微博），默认为0
	private String since_id;
	//若指定此参数，则返回ID小于或等于max_id的微博，默认为0
	private String max_id;
	//单页返回的记录条数，最大不超过100，超过100以100处理，默认为20
	private String count;
	//返回结果的页码，默认为1
	private String page;
	//是否只获取当前应用的数据。0为否（所有数据），1为是（仅当前应用），默认为0
	private String base_app;
	//过滤类型ID，0：全部、1：原创、2：图片、3：视频、4：音乐，默认为0
	private String feature;
	//返回值中user字段开关，0：返回完整user字段、1：user字段仅返回user_id，默认为0
	private String trim_user;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getScreen_name() {
		return screen_name;
	}
	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
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
	public String getBase_app() {
		return base_app;
	}
	public void setBase_app(String base_app) {
		this.base_app = base_app;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getTrim_user() {
		return trim_user;
	}
	public void setTrim_user(String trim_user) {
		this.trim_user = trim_user;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserTimelineDto [access_token=");
		builder.append(access_token);
		builder.append(", uid=");
		builder.append(uid);
		builder.append(", screen_name=");
		builder.append(screen_name);
		builder.append(", since_id=");
		builder.append(since_id);
		builder.append(", max_id=");
		builder.append(max_id);
		builder.append(", count=");
		builder.append(count);
		builder.append(", page=");
		builder.append(page);
		builder.append(", base_app=");
		builder.append(base_app);
		builder.append(", feature=");
		builder.append(feature);
		builder.append(", trim_user=");
		builder.append(trim_user);
		builder.append("]");
		return builder.toString();
	}
	
}
