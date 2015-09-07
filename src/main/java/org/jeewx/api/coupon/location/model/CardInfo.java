package org.jeewx.api.coupon.location.model;

import org.jeewx.api.core.annotation.ReqType;
import org.jeewx.api.core.req.model.WeixinReqParam;

@ReqType("getCardInfo")
public class CardInfo extends WeixinReqParam{
	//卡券类型
	private String card_type ;
	//基本的卡券数据，见下表，所有卡券通用,描述
	private GeneralCoupon general_coupon;
	//文本卡卷
	private Groupon groupon;
	//礼品卡卷
	private Gift gift;
	//代金卡卷
	private Cash cash;
	//折扣卡卷
	private Discount discount;
	//积分卷
	private MemberCard member_card;
	//票类型
	private ScenicTicket scenic_ticket;
	//电影卡卷
	private MovieTicket movie_ticket;
	//机票卡卷
	private BoardingPass boarding_pass;
	//红包
	private LuckyMoney lucky_money ;
	//会议详情
	private MeetingTicket meeting_ticket;
	
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public GeneralCoupon getGeneral_coupon() {
		return general_coupon;
	}
	public void setGeneral_coupon(GeneralCoupon general_coupon) {
		this.general_coupon = general_coupon;
	}
	public Groupon getGroupon() {
		return groupon;
	}
	public void setGroupon(Groupon groupon) {
		this.groupon = groupon;
	}
	public Gift getGift() {
		return gift;
	}
	public void setGift(Gift gift) {
		this.gift = gift;
	}
	public Cash getCash() {
		return cash;
	}
	public void setCash(Cash cash) {
		this.cash = cash;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public MemberCard getMember_card() {
		return member_card;
	}
	public void setMember_card(MemberCard member_card) {
		this.member_card = member_card;
	}
	public ScenicTicket getScenic_ticket() {
		return scenic_ticket;
	}
	public void setScenic_ticket(ScenicTicket scenic_ticket) {
		this.scenic_ticket = scenic_ticket;
	}
	public MovieTicket getMovie_ticket() {
		return movie_ticket;
	}
	public void setMovie_ticket(MovieTicket movie_ticket) {
		this.movie_ticket = movie_ticket;
	}
	public BoardingPass getBoarding_pass() {
		return boarding_pass;
	}
	public void setBoarding_pass(BoardingPass boarding_pass) {
		this.boarding_pass = boarding_pass;
	}
	public LuckyMoney getLucky_money() {
		return lucky_money;
	}
	public void setLucky_money(LuckyMoney lucky_money) {
		this.lucky_money = lucky_money;
	}
	public MeetingTicket getMeeting_ticket() {
		return meeting_ticket;
	}
	public void setMeeting_ticket(MeetingTicket meeting_ticket) {
		this.meeting_ticket = meeting_ticket;
	}
	

}
