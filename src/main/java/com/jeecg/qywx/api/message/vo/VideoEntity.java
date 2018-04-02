package com.jeecg.qywx.api.message.vo;

public class VideoEntity {
private String media_id;//视频媒体文件id，可以调用上传临时素材或者永久素材接口获取
private String title;//视频消息的标题，不超过128个字节，超过会自动截断
private String description;//视频消息的描述，不超过512个字节，超过会自动截断

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getMedia_id() {
	return media_id;
}
public void setMedia_id(String media_id) {
	this.media_id = media_id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

}
