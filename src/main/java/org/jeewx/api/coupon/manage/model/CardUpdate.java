package org.jeewx.api.coupon.manage.model;
/**
 * 可以被更新的卡券详细信息
 * @author mcl
 * @version v1.0
 */
public class CardUpdate {
	//卡券id.
	private String card_id;
	//会员卡
	private MemberCard member_card;
	//飞机票
	private BoardingPass boarding_pass;
	//门票
	private ScenicTicket scenic_ticket;
	//电影票
	private MovieTicket movie_ticket;
	//会议门票
	private MeetingTicket meeting_ticket;
	
	public String getCard_id() {
		return card_id;
	}
	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}
	public MemberCard getMember_card() {
		return member_card;
	}
	public void setMember_card(MemberCard member_card) {
		this.member_card = member_card;
	}
	public BoardingPass getBoarding_pass() {
		return boarding_pass;
	}
	public void setBoarding_pass(BoardingPass boarding_pass) {
		this.boarding_pass = boarding_pass;
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
	public MeetingTicket getMeeting_ticket() {
		return meeting_ticket;
	}
	public void setMeeting_ticket(MeetingTicket meeting_ticket) {
		this.meeting_ticket = meeting_ticket;
	}
	
	
}
