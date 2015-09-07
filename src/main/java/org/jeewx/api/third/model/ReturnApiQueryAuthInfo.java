package org.jeewx.api.third.model;

import java.util.List;

public class ReturnApiQueryAuthInfo {

	private String authorization_info;
	private String authorizer_appid;
	private String authorizer_access_token;
	private String expires_in;
	private String authorizer_refresh_token;
	private FuncInfo func_info;
	
	public String getAuthorization_info() {
		return authorization_info;
	}
	public void setAuthorization_info(String authorization_info) {
		this.authorization_info = authorization_info;
	}
	public String getAuthorizer_appid() {
		return authorizer_appid;
	}
	public void setAuthorizer_appid(String authorizer_appid) {
		this.authorizer_appid = authorizer_appid;
	}
	public String getAuthorizer_access_token() {
		return authorizer_access_token;
	}
	public void setAuthorizer_access_token(String authorizer_access_token) {
		this.authorizer_access_token = authorizer_access_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getAuthorizer_refresh_token() {
		return authorizer_refresh_token;
	}
	public void setAuthorizer_refresh_token(String authorizer_refresh_token) {
		this.authorizer_refresh_token = authorizer_refresh_token;
	}
	public FuncInfo getFunc_info() {
		return func_info;
	}
	public void setFunc_info(FuncInfo func_info) {
		this.func_info = func_info;
	}
}


class FuncInfo{
	private List<funcscope_category> ls;

	public List<funcscope_category> getLs() {
		return ls;
	}

	public void setLs(List<funcscope_category> ls) {
		this.ls = ls;
	} 
	
}

class funcscope_category{
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}