package org.jeewx.api.core.req.model.kfaccount;

import org.jeewx.api.core.annotation.ReqType;
import org.jeewx.api.core.req.model.WeixinReqParam;

/**
 * 发送客服消息
 * 
 * @author sfli.sir
 * 
 */
@ReqType("customsend")
public class KfcustomSend extends WeixinReqParam {

	private String touser;
	
	/**
	 * news,music,text,image,voice,video
	 */
	private String msgtype;
	
	private Customservice customservice;
	
	private MsgText text;
	
	private MsgImage image;
	
	private MsgVoice voice;
	
	private MsgVideo video;
	
	private MsgNews news;
	
	private MsgMusic music;

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public Customservice getCustomservice() {
		return customservice;
	}

	public void setCustomservice(Customservice customservice) {
		this.customservice = customservice;
	}

	public MsgText getText() {
		return text;
	}

	public void setText(MsgText text) {
		this.text = text;
	}

	public MsgImage getImage() {
		return image;
	}

	public void setImage(MsgImage image) {
		this.image = image;
	}

	public MsgVoice getVoice() {
		return voice;
	}

	public void setVoice(MsgVoice voice) {
		this.voice = voice;
	}

	public MsgVideo getVideo() {
		return video;
	}

	public void setVideo(MsgVideo video) {
		this.video = video;
	}

	public MsgNews getNews() {
		return news;
	}

	public void setNews(MsgNews news) {
		this.news = news;
	}

	public MsgMusic getMusic() {
		return music;
	}

	public void setMusic(MsgMusic music) {
		this.music = music;
	}
	
}
