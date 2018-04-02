package org.jeewx.api.wxuser.tag.model;

import java.util.ArrayList;
import java.util.List;

public class WxTag {
	
	Integer id;
	String name;
	int count;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "WxTag [id=" + id + ", name=" + name + ", count=" + count + "]";
	}
	
}
