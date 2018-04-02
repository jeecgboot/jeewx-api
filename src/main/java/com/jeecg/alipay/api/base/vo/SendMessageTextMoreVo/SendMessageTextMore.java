package com.jeecg.alipay.api.base.vo.SendMessageTextMoreVo;

public class SendMessageTextMore {

	private String msgType;  //消息类型，text
	private ConTextMore text;
	
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	public ConTextMore getText() {
		return text;
	}
	
	public void setText(ConTextMore text) {
		this.text = text;
	}
}
