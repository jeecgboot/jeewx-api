package com.jeecg.qywx.api.conversation.vo;

public class Receiver {
	
	private String type;
	private String id;
	
	public Receiver() {
		// TODO Auto-generated constructor stub
	}

	public Receiver(String type, String id) {
		this.type = type;
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
