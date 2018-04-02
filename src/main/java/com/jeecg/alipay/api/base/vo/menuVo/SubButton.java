package com.jeecg.alipay.api.base.vo.menuVo;
public class SubButton {
	private String actionParam;

	private String actionType;

	private String name;

	public void setActionParam(String actionParam){
	this.actionParam = actionParam;
	}
	public String getActionParam(){
	return this.actionParam;
	}
	public void setActionType(String actionType){
	this.actionType = actionType;
	}
	public String getActionType(){
	return this.actionType;
	}
	public void setName(String name){
	this.name = name;
	}
	public String getName(){
	return this.name;
	}

	}