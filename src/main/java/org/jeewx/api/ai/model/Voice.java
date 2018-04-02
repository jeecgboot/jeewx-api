package org.jeewx.api.ai.model;

public class Voice {
	/**
	 * 口调用凭证
	 */
	private String accessToken;
	
	/**
	 * 文件格式 （只支持mp3，16k，单声道，最大1M）
	 */
	private String format;
	/**
	 * 语音唯一标识
	 */
	private String voice_id;
	/**
	 * 语言，zh_CN 或 en_US，默认中文 非必填
	 */
	private String lang;
	
	/**
	 * 文件地址
	 */
	private String file;
	
	/**
	 * 发送语音后线程等待毫秒数 默认4秒 注意：上传语音后10s内调语音识别接口
	 */
	private long waitMill = 4000;
	
	public long getWaitMill() {
		return waitMill;
	}
	public void setWaitMill(long waitMill) {
		this.waitMill = waitMill;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getVoice_id() {
		return voice_id;
	}
	public void setVoice_id(String voice_id) {
		this.voice_id = voice_id;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public Voice() {
	}
	
	/**
	 * 构造器 除lang外每个参数必须赋值
	 * @param accessToken
	 * @param format 格式（只支持mp3，16k，单声道，最大1M）
	 * @param voice_id 唯一标识
	 * @param lang 语言zh_CN 或 en_US
	 * @param file 文件地址
	 */
	public Voice(String accessToken, String format, String voice_id, String lang,String file) {
		//TODO 扩展以流的形式构造而非文件地址
		this.accessToken = accessToken;
		this.format = format;
		this.voice_id = voice_id;
		this.file = file;
		this.lang = lang;
	}
	
	public String getReqestUrl(String metaUrl){
		return metaUrl+"access_token="+accessToken+"&format="+format+"&voice_id="+voice_id+"&lang="+((lang==null ||"".equals(lang))?"zh_CN":lang);
	}
}
