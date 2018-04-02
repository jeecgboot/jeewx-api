package com.jeecg.qywx.api.conversation.vo;

public class Conversation {
	
	private String chatid;
	private String name;
	private String owner;
	private String[] userlist;
	
	public Conversation() {
		// TODO Auto-generated constructor stub
	}

	public Conversation(String chatid, String name, String owner, String[] userlist) {
		this.chatid = chatid;
		this.name = name;
		this.owner = owner;
		this.userlist = userlist;
	}

	public String getChatid() {
		return chatid;
	}

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String[] getUserlist() {
		return userlist;
	}

	public void setUserlist(String[] userlist) {
		this.userlist = userlist;
	}
	
	
}
