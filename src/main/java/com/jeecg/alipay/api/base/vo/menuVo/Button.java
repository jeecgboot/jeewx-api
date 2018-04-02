package com.jeecg.alipay.api.base.vo.menuVo;

public class Button {

	private String actionParam;

	private String actionType;

	private String name;

	private SubButton[] subButton;

	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}

	public String getActionParam() {
		return this.actionParam;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public SubButton[] getSubButton() {
		return subButton;
	}
	
	public void setSubButton(SubButton[] subButton) {
		this.subButton = subButton;
	}
}