package com.jeecg.alipay.api.base.vo.PromotionalSupportVo;

public class PromotionalSupport {

	private CodeInfo codeInfo;   //开发者自定义信息
	
	private String codeType;     //二维码类型，目前只支持两种类型：TEMP：临时的（默认）；PERM：永久的
	
	private String expireSecond; // 临时码过期时间，以秒为单位，最大不超过1800秒；永久码置空
	
	private String showLogo;      //二维码中间是否显示服务窗logo，Y：显示；N：不显示（默认）

	public CodeInfo getCodeInfo() {
		return codeInfo;
	}

	public void setCodeInfo(CodeInfo codeInfo) {
		this.codeInfo = codeInfo;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getExpireSecond() {
		return expireSecond;
	}

	public void setExpireSecond(String expireSecond) {
		this.expireSecond = expireSecond;
	}

	public String getShowLogo() {
		return showLogo;
	}

	public void setShowLogo(String showLogo) {
		this.showLogo = showLogo;
	}
	
	
}
