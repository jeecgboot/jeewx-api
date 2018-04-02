package com.jeecg.qywx.api.media.vo;

public class UpdateFixSource {
	private int agentid;//企业应用的id，整型。可在应用的设置页面查看
	private String media_id;
	private UpdateFixSourceEntity mpnews;
	
	public int getAgentid() {
		return agentid;
	}
	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}
	public String getMedia_id() {
		return media_id;
	}
	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}
	public UpdateFixSourceEntity getMpnews() {
		return mpnews;
	}
	public void setMpnews(UpdateFixSourceEntity mpnews) {
		this.mpnews = mpnews;
	}
	
}
