package com.jeecg.qywx.api.message.vo;

public class Mpnews {
	   private String touser;//成员ID列表（消息接收者，多个接收者用‘|’分隔，最多支持1000个）。特殊情况：指定为@all，则向关注该企业应用的全部成员发送
		private String toparty;//部门ID列表，多个接收者用‘|’分隔，最多支持100个。当touser为@all时忽略本参
		private String totag;//	标签ID列表，多个接收者用‘|’分隔。当touser为@all时忽略本参数
		private String msgtype;//消息类型，此时固定为：voice （不支持主页型应用）
		private int agentid;//企业应用的id，整型。可在应用的设置页面查看
		private MpnewsEntity mpnews;//图文实体（发送时直接带上mpnews内容）
		private String safe;//	表示是否是保密消息，0表示否，1表示是，默认0
		public String getSafe() {
			return safe;
		}
		public void setSafe(String safe) {
			this.safe = safe;
		}
		public String getTouser() {
			return touser;
		}
		public void setTouser(String touser) {
			this.touser = touser;
		}
		public String getToparty() {
			return toparty;
		}
		public void setToparty(String toparty) {
			this.toparty = toparty;
		}
		public String getTotag() {
			return totag;
		}
		public void setTotag(String totag) {
			this.totag = totag;
		}
		public String getMsgtype() {
			return msgtype;
		}
		public void setMsgtype(String msgtype) {
			this.msgtype = msgtype;
		}
		public int getAgentid() {
			return agentid;
		}
		public void setAgentid(int agentid) {
			this.agentid = agentid;
		}
		public MpnewsEntity getMpnews() {
			return mpnews;
		}
		public void setMpnews(MpnewsEntity mpnews) {
			this.mpnews = mpnews;
		}
		
		
}
