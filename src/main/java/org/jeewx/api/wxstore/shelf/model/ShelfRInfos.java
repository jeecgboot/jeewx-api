package org.jeewx.api.wxstore.shelf.model;

import java.util.List;

public class ShelfRInfos {
	// 货架信息(数据说明详见《货架控件说明》)特别说明：货架信息使用要参考官方API文档说明
	private List<ShelfRInfo> shelves;

	public List<ShelfRInfo> getShelves() {
		return shelves;
	}

	public void setShelves(List<ShelfRInfo> shelves) {
		this.shelves = shelves;
	}
}
