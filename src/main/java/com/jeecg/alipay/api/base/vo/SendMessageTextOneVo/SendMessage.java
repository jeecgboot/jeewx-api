package com.jeecg.alipay.api.base.vo.SendMessageTextOneVo;

public class SendMessage {
	
	private String toUserId;   //消息接收用户的userid
	private String msgType;    //消息类型，text
	private ConTent text;

	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public ConTent getText() {
		return text;
	}
	
	public void setText(ConTent text) {
		this.text = text;
	}

	
	
	
}
