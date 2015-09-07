package org.jeewx.api.core.req.model;

/**
 * 配置信息
 * @author sfli.sir
 *
 */
public class WeixinReqConfig {

	
	 private String key;
	 
	 private String url;
	 
	 private String method;
	 
	 private String mappingHandler;
	 
	 private String datatype;

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getMappingHandler() {
		return mappingHandler;
	}

	public void setMappingHandler(String mappingHandler) {
		this.mappingHandler = mappingHandler;
	}

}
