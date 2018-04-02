package com.jeecg.qywx.api.userandopenmsg.vo;

public class UserToOpen {
	private String userid;//企业号内的成员id 
	private int agentid;// 	整型，需要发送红包的应用ID，若只是使用微信支付和企业转账，则无需该参数
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getAgentid() {
		return agentid;
	}
	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}


}
