package com.jeecg.qywx.api.conversation.vo;

public class Conversation4Update {
	String chatid;
	String op_user;
	String name;
	String owner;
	String[] addUserlist;
	String[] delUserlist;
	
	 public Conversation4Update() {
		// TODO Auto-generated constructor stub
	}

	public Conversation4Update(String chatid, String op_user, String name, String owner, String[] addUserlist,
			String[] delUserlist) {
		this.chatid = chatid;
		this.op_user = op_user;
		this.name = name;
		this.owner = owner;
		this.addUserlist = addUserlist;
		this.delUserlist = delUserlist;
	}

	public String getChatid() {
		return chatid;
	}

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getOp_user() {
		return op_user;
	}
	
	public void setOp_user(String op_user) {
		this.op_user = op_user;
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

	public String[] getAddUserlist() {
		return addUserlist;
	}

	public void setAddUserlist(String[] addUserlist) {
		this.addUserlist = addUserlist;
	}

	public String[] getDelUserlist() {
		return delUserlist;
	}

	public void setDelUserlist(String[] delUserlist) {
		this.delUserlist = delUserlist;
	}
}
