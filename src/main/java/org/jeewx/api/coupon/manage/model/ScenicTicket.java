package org.jeewx.api.coupon.manage.model;

/**
 * 门票。
 * 
 * @author mcl
 * @version v1.0
 */
public class ScenicTicket {
	// 基本的卡券数据，见下表，所有卡券通用
	private BaseInfo base_info;
	// 票类型，例如平日全票，套票等
	private String ticket_class;
	// 导览图url。
	private String guide_url;

	public BaseInfo getBase_info() {
		return base_info;
	}

	public void setBase_info(BaseInfo base_info) {
		this.base_info = base_info;
	}

	public String getTicket_class() {
		return ticket_class;
	}

	public void setTicket_class(String ticket_class) {
		this.ticket_class = ticket_class;
	}

	public String getGuide_url() {
		return guide_url;
	}

	public void setGuide_url(String guide_url) {
		this.guide_url = guide_url;
	}



}
