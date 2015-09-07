package org.jeewx.api.core.req.model.menu.config;

import java.util.List;

/**
 * 获取自定义菜单配置接口
 * @author superuser
 *
 */
public class CustomWeixinButtonConfig {
	/** 菜单是否开启，0代表未开启，1代表开启 */
	private String is_menu_open;
	/** 菜单信息 */
	private List<WeixinButtonExtend> selfmenu_info;
	public String getIs_menu_open() {
		return is_menu_open;
	}
	public void setIs_menu_open(String is_menu_open) {
		this.is_menu_open = is_menu_open;
	}
	public List<WeixinButtonExtend> getSelfmenu_info() {
		return selfmenu_info;
	}
	public void setSelfmenu_info(List<WeixinButtonExtend> selfmenu_info) {
		this.selfmenu_info = selfmenu_info;
	}
}
