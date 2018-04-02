package com.jeecg.qywx.api.core.common;

import java.io.Serializable;

/**
 * 微信接口响应
 * 
 * @author zhoujf
 */
public class MsgResponse implements Serializable {

	private static final long serialVersionUID = 6102281663991601498L;
	private Integer errcode;
	private String errmsg;

	public Integer getErrcode() {
		return errcode;
	}

	public void setErrcode(Integer errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	@Override
	public String toString() {
		return "MsgResponse [errcode=" + errcode + ", errmsg=" + errmsg + "]";
	}
}
