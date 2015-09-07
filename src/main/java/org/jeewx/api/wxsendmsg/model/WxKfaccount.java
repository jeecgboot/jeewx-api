package org.jeewx.api.wxsendmsg.model;

/**
 * 客服信息
 * @author sfli.sir
 *
 */
public class WxKfaccount {

	private String kf_account;
	
	private String kf_nick;
	
	private String kf_id;
	
	private String kf_headimgurl;
	
	private String auto_accept;
	
	private String accepted_case;

	public String getAuto_accept() {
		return auto_accept;
	}

	public void setAuto_accept(String auto_accept) {
		this.auto_accept = auto_accept;
	}

	public String getAccepted_case() {
		return accepted_case;
	}

	public void setAccepted_case(String accepted_case) {
		this.accepted_case = accepted_case;
	}

	public String getKf_account() {
		return kf_account;
	}

	public void setKf_account(String kf_account) {
		this.kf_account = kf_account;
	}

	public String getKf_nick() {
		return kf_nick;
	}

	public void setKf_nick(String kf_nick) {
		this.kf_nick = kf_nick;
	}

	public String getKf_id() {
		return kf_id;
	}

	public void setKf_id(String kf_id) {
		this.kf_id = kf_id;
	}

	public String getKf_headimgurl() {
		return kf_headimgurl;
	}

	public void setKf_headimgurl(String kf_headimgurl) {
		this.kf_headimgurl = kf_headimgurl;
	}
	
	
}
