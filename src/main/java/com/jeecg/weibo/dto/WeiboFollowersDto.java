package com.jeecg.weibo.dto;

public class WeiboFollowersDto {
	//采用OAuth授权方式为必填参数，OAuth授权后获得。
	private String access_token;	
	//需要查询的用户UID。
	private String uid;	
	//需要查询的用户昵称。
	private String screen_name;	
	//单页返回的记录条数，默认为50，最大不超过200。
	private String count;
	//返回结果的游标，下一页用返回值里的next_cursor，上一页用previous_cursor，默认为0。
	private String cursor;
	//返回值中user字段中的status字段开关，0：返回完整status字段、1：status字段仅返回status_id，默认为1。
	private String trim_status;	
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
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getTrim_status() {
		return trim_status;
	}
	public void setTrim_status(String trim_status) {
		this.trim_status = trim_status;
	}
	public String getCursor() {
		return cursor;
	}
	public void setCursor(String cursor) {
		this.cursor = cursor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WeiboFollowersDto [access_token=");
		builder.append(access_token);
		builder.append(", uid=");
		builder.append(uid);
		builder.append(", screen_name=");
		builder.append(screen_name);
		builder.append(", count=");
		builder.append(count);
		builder.append(", trim_status=");
		builder.append(trim_status);
		builder.append(", cursor=");
		builder.append(cursor);
		builder.append("]");
		return builder.toString();
	}	
}
