package org.jeewx.api.wxsendmsg.model;

/**
 * 多媒体资源文件
 * @author LIAIJUN
 *
 */
public class WxMedia {
	private String fileName;
	private String filePath;
	private String type;
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
