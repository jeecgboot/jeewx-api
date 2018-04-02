package com.jeecg.qywx.api.media.vo;

public class FixSource {
private int agentid;//企业应用的id，整型。可在应用的设置页面查看
private MpnewEntity mpnews;

public int getAgentid() {
	return agentid;
}
public void setAgentid(int agentid) {
	this.agentid = agentid;
}
public MpnewEntity getMpnews() {
	return mpnews;
}
public void setMpnews(MpnewEntity mpnews) {
	this.mpnews = mpnews;
}

}
