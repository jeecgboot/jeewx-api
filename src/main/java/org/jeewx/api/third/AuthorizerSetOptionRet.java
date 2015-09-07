package org.jeewx.api.third;
/**
 * 设置选项返回结果
 * 成功返回 errcode":0,"errmsg":"ok"
 */
public class AuthorizerSetOptionRet {
	private Integer errcode;//	错误码
	private String errmsg;//	错误信息
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
	
}
