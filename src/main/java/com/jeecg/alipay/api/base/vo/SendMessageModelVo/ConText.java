package com.jeecg.alipay.api.base.vo.SendMessageModelVo;

public class ConText {

	private String headColor;  //顶部色条的色值
	private String url;        //点击消息后承接页的地址
	private String actionName; //底部链接描述文字，如“查看详情”
	private KeyWord keyword1;  //模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	private KeyWord keyword2;  //模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	private KeyWord keyword3;//模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	private KeyWord keyword4;//模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	private KeyWord keyword5;//模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	private KeyWord keyword6;//模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	private KeyWord first; //模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	private KeyWord remark;//模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	
	public String getHeadColor() {
		return headColor;
	}
	public void setHeadColor(String headColor) {
		this.headColor = headColor;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public KeyWord getKeyword1() {
		return keyword1;
	}
	public void setKeyword1(KeyWord keyword1) {
		this.keyword1 = keyword1;
	}
	public KeyWord getKeyword2() {
		return keyword2;
	}
	public void setKeyword2(KeyWord keyword2) {
		this.keyword2 = keyword2;
	}
	public KeyWord getFirst() {
		return first;
	}
	public void setFirst(KeyWord first) {
		this.first = first;
	}
	public KeyWord getRemark() {
		return remark;
	}
	public void setRemark(KeyWord remark) {
		this.remark = remark;
	}
	public KeyWord getKeyword3() {
		return keyword3;
	}
	public void setKeyword3(KeyWord keyword3) {
		this.keyword3 = keyword3;
	}
	public KeyWord getKeyword4() {
		return keyword4;
	}
	public void setKeyword4(KeyWord keyword4) {
		this.keyword4 = keyword4;
	}
	public KeyWord getKeyword5() {
		return keyword5;
	}
	public void setKeyword5(KeyWord keyword5) {
		this.keyword5 = keyword5;
	}
	public KeyWord getKeyword6() {
		return keyword6;
	}
	public void setKeyword6(KeyWord keyword6) {
		this.keyword6 = keyword6;
	}
	
}
