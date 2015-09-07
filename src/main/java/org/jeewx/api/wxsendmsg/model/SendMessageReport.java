package org.jeewx.api.wxsendmsg.model;

public class SendMessageReport {

	/** 公众号的微信号 */
	private String ToUserName;
	/** 公众号群发助手的微信号，为mphelper */
	private String FromUserName;
	/** 创建时间的时间戳 */
	private String CreateTime;
	/** 消息类型，此处为event */
	private String MsgType;
	/** 事件信息，此处为MASSSENDJOBFINISH */
	private String Event;
	/** 群发的消息ID */
	private String MsgID;

	/**
	 * 群发的结构，为“send success”或“send fail”或“err(num)”。但send
	 * success时，也有可能因用户拒收公众号的消息、系统错误等原因造成少量用户接收失败。err(num)是审核失败的具体原因，可能的情况如下：
	 * err(10001), //涉嫌广告 err(20001), //涉嫌政治 err(20004), //涉嫌社会 err(20002),
	 * //涉嫌色情 err(20006), //涉嫌违法犯罪 err(20008), //涉嫌欺诈 err(20013), //涉嫌版权
	 * err(22000), //涉嫌互推(互相宣传) err(21000), //涉嫌其他
	 */
	private String Status;

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public String getEvent() {
		return Event;
	}

	public void setEvent(String event) {
		Event = event;
	}

	public String getMsgID() {
		return MsgID;
	}

	public void setMsgID(String msgID) {
		MsgID = msgID;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "SendMessageReport [ToUserName=" + ToUserName + ", FromUserName=" + FromUserName + ", CreateTime=" + CreateTime + ", MsgType=" + MsgType + ", Event=" + Event + ", MsgID=" + MsgID + ", Status=" + Status + "]";
	}
	
	

}
