package org.jeewx.api.core.req.model.user;


/**
 * 取多媒体文件
 * 
 * @author sfli.sir
 * 
 */
public class Group {

	private String name;
	
	private String id;
	
	private String count;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}
	
	
}
