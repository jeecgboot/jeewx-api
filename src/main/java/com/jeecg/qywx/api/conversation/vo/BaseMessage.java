package com.jeecg.qywx.api.conversation.vo;

public abstract class BaseMessage {

	/**接收人*/
	protected Receiver receiver;
	/**发送人*/
	protected String sender;
	/**消息类型*/
	protected String msgtype;
	
	public BaseMessage() {
		// TODO Auto-generated constructor stub
	}

	public BaseMessage(Receiver receiver, String sender, String msgtype) {
		this.receiver = receiver;
		this.sender = sender;
		this.msgtype = msgtype;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	
}
