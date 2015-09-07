package org.jeewx.api.core.req.model.message;


/**
 * 取多媒体文件
 * 
 * @author sfli.sir
 * 
 */
public class TemplateMessage {


	private TemplateData first;
	
	private TemplateData keynote1;
	
	private TemplateData keynote2;
	
	private TemplateData keynote3;
	
	private TemplateData remark;

	public TemplateData getFirst() {
		return first;
	}

	public void setFirst(TemplateData first) {
		this.first = first;
	}

	public TemplateData getKeynote1() {
		return keynote1;
	}

	public void setKeynote1(TemplateData keynote1) {
		this.keynote1 = keynote1;
	}

	public TemplateData getKeynote2() {
		return keynote2;
	}

	public void setKeynote2(TemplateData keynote2) {
		this.keynote2 = keynote2;
	}

	public TemplateData getKeynote3() {
		return keynote3;
	}

	public void setKeynote3(TemplateData keynote3) {
		this.keynote3 = keynote3;
	}

	public TemplateData getRemark() {
		return remark;
	}

	public void setRemark(TemplateData remark) {
		this.remark = remark;
	}
	
}
