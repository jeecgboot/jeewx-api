package org.jeewx.api.coupon.manage.model;

public class Card {
	/**
	 * 卡券类型: 目前支持11中类型，具体参考CardConsts.CardType常量类.
	 * 团购券：GROUPON; 
	 * 折扣券：DISCOUNT; 
	 * 礼品券：GIFT; 
	 * 代金券：CASH; 
	 * 通用券：GENERAL_COUPON; 
	 * 会员卡：MEMBER_CARD; 
	 * 景点门票：SCENIC_TICKET； 
	 * 电影票：MOVIE_TICKET； 
	 * 飞机票：BOARDING_PASS； 
	 * 会议门票：MEETING_TICKET； 
	 * 汽车票：BUS_TICKET;
	 */
	private String card_type;
	//通用券
	private GeneralCoupon general_coupon;
	//团购券
	private Groupon groupon;
	//礼品券
	private Gift gift;
	//代金券
	private Cash cash;
	//折扣券
	private Discount discount;
	//会员卡
	private MemberCard member_card;
	//门票
	private ScenicTicket scenic_ticket;
	//电影票
	private MovieTicket movie_ticket;
	//飞机票
	private BoardingPass boarding_pass;
	//红包
	private LuckyMoney lucky_money;
	//会议门票
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
