package org.jeewx.api.wxbase.wxmedia.model;

/**
 * 上传图文消息素材
 * @author lihongxuan
 *
 */
public class WxDescriptionRequest {
	WxDescription description = new WxDescription();

	

	public WxDescription getDescription() {
		return description;
	}



	public void setDescription(WxDescription description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "WxDescriptionRequest [description=" + description + "]";
	}

}
