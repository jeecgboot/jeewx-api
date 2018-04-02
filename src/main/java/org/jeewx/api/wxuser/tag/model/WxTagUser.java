package org.jeewx.api.wxuser.tag.model;

import java.util.ArrayList;
import java.util.List;

public class WxTagUser {
	
	Integer count ;
	String next_openid;
	WxTagUserList data;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getNext_openid() {
		return next_openid;
	}
	public void setNext_openid(String next_openid) {
		this.next_openid = next_openid;
	}
	public WxTagUserList getData() {
		return data;
	}
	public void setData(WxTagUserList data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "WxTagUser [count=" + count + ", next_openid=" + next_openid + ", data=" + data + "]";
	}
	
}
