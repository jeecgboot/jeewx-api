package org.jeewx.api.wxbase.wxmedia.model;

import java.util.ArrayList;
import java.util.List;
/**
 * 上传图文消息素材id
 * @author lihongxuan
 *
 */
public class WxArticlesRequestByMaterial {
	private String mediaId;

	
	public String getMediaId() {
		return mediaId;
	}


	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}


	@Override
	public String toString() {
		return "WxArticlesRequestByMaterial [mediaId=" + mediaId + "]";
	}

}
