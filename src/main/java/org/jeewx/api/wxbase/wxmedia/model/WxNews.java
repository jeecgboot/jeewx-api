package org.jeewx.api.wxbase.wxmedia.model;
/**
 * 图文消息图文消息
 * @author lihongxuan	
 *
 */
public class WxNews {

	/** 媒体id */
	private String total_count;
	/** 图文消息的作者 */
	private WxItem item;
	/** 文件名称 */
	private String item_count;
	
	
	public String getTotal_count() {
		return total_count;
	}


	public void setTotal_count(String total_count) {
		this.total_count = total_count;
	}


	public WxItem getItem() {
		return item;
	}


	public void setItem(WxItem item) {
		this.item = item;
	}


	public String getItem_count() {
		return item_count;
	}


	public void setItem_count(String item_count) {
		this.item_count = item_count;
	}


	@Override
	public String toString() {
		return "WxArticle [total_count=" + total_count + ", item_count=" + item_count + ", item=" + item + "]";
	}

	 

}
