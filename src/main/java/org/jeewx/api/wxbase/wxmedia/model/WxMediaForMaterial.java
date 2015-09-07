package org.jeewx.api.wxbase.wxmedia.model;

/**
 * 多媒体资源文件
 * @author lihongxuan
 *
 */
public class WxMediaForMaterial {
	private String fileName;
	private String filePath;
	private String type;
	private WxDescription wxDescription;
	
	public WxDescription getWxDescription() {
		return wxDescription;
	}
	public void setWxDescription(WxDescription wxDescription) {
		this.wxDescription = wxDescription;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "WxMedia [fileName=" + fileName + ", filePath=" + filePath + ", type=" + type + "]";
	}
	

}
