package org.jeewx.api.coupon.manage.model;

/**
 * 可以被更新的会员卡信息。
 * 
 * @author mcl
 * @version v1.0
 */
public class MemberCardUpdate {
	// 基本的卡券数据，见下表，所有卡券通用
	private BaseInfoUpdate base_info;
	// 积分清零规则
	private String bonus_cleared;
	// 积分规则
	private String bonus_rules;
	// 储值说明
	private String balance_rules;
	// 特权说明
	private String prerogative;
	public BaseInfoUpdate getBase_info() {
		return base_info;
	}
	public void setBase_info(BaseInfoUpdate base_info) {
		this.base_info = base_info;
	}
	public String getBonus_cleared() {
		return bonus_cleared;
	}
	public void setBonus_cleared(String bonus_cleared) {
		this.bonus_cleared = bonus_cleared;
	}
	public String getBonus_rules() {
		return bonus_rules;
	}
	public void setBonus_rules(String bonus_rules) {
		this.bonus_rules = bonus_rules;
	}
	public String getBalance_rules() {
		return balance_rules;
	}
	public void setBalance_rules(String balance_rules) {
		this.balance_rules = balance_rules;
	}
	public String getPrerogative() {
		return prerogative;
	}
	public void setPrerogative(String prerogative) {
		this.prerogative = prerogative;
	}
	
	

}
