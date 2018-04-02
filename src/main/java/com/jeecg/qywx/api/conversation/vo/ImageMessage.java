package com.jeecg.qywx.api.conversation.vo;

/**
 * 图片消息
 * @author SunHaiFeng
 *
 */
public class ImageMessage extends BaseMessage{
	private Media image;
	
	public ImageMessage() {
		super.msgtype = "image";
	}
	
	public ImageMessage(Receiver receiver, String sender, Media image) {
		super(receiver, sender, "image");
		this.image = image;
	}

	public Media getImage() {
		return image;
	}
	
	public void setImage(Media image) {
		this.image = image;
	}
}
