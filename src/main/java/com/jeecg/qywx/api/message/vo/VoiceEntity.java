package com.jeecg.qywx.api.message.vo;

public class VoiceEntity {
private String media_id;//语音文件id，可以调用上传临时素材或者永久素材接口获取

public String getMedia_id() {
	return media_id;
}
public void setMedia_id(String media_id) {
	this.media_id = media_id;
}

}
