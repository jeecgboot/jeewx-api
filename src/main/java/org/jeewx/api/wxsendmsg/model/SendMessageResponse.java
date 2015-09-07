package org.jeewx.api.wxsendmsg.model;

/**
 * 微信群发返回的结果
 * @author LIAIJUN
 *
 */
public class SendMessageResponse {

	private String errcode;
	private String errmsg;
	private String msg_id;

	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public String getMsg_id() {
		return msg_id;
	}

	public void setMsg_id(String msg_id) {
		this.msg_id = msg_id;
	}

	@Override
	public String toString() {
		return "SendMessageResponse [errcode=" + errcode + ", errmsg=" + errmsg + ", msg_id=" + msg_id + "]";
	}

}
