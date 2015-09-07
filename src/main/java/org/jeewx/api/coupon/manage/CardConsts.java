package org.jeewx.api.coupon.manage;

public class CardConsts {
	/**
	 * 卡券类型.
	 */
	public static class CardType {
		// 通用券
		public static final String generalCoupon = "GENERAL_COUPON";
		// 团购券
		public static final String groupon = "GROUPON";
		// 折扣券
		public static final String discount = "DISCOUNT";
		// 礼品券
		public static final String gift = "GIFT";
		// 代金券
		public static final String cash = "CASH";
		// 会员卡
		public static final String memberCard = "MEMBER_CARD";
		// 门票
		public static final String scenicTicket = "SCENIC_TICKET";
		// 电影票
		public static final String movieTicket = "MOVIE_TICKET";
		// 飞机票
		public static final String boardingPass = "BOARDING_PASS";
		// 红包
		public static final String luckyMoney = "LUCKY_MONEY";
		// 会议门票
		public static final String meetingTicket = "MEETING_TICKET";
	}
	/**
	 * code 码展示类型.
	 */
	public static class CodeType {
		// 文本
		public static final String codeTypeText = "CODE_TYPE_TEXT";
		// 一维码
		public static final String codeTypeBarcode = "CODE_TYPE_BARCODE";
		// 二维码
		public static final String codeTypeQrcode = "CODE_TYPE_QRCODE";
	}
	/**
	 * 卡券状态.
	 */
	public static class Status {
		// 待审核
		public static final String cardStatusNotVerify = "CARD_STATUS_NOT_VERIFY";
		// 审核失败
		public static final String cardStatusVerifyFall = "CARD_STATUS_VERIFY_FALL";
		// 通过审核
		public static final String cardStatusVerifyOk = "CARD_STATUS_VERIFY_OK";
		//卡券被用户删除
		public static final String cardStatusUserDelete = "CARD_STATUS_USER_DELETE";
		//在公众平台投放过的卡券
		public static final String cardStatusUserOnShelf = "CARD_STATUS_USER_ON_SHELF";
	}
	/**
	 * 自定义cell 字段type 类型.
	 */
	public static class UrlNameType {
		// 外卖
		public static final String urlNameTypeTakeAway = "URL_NAME_TYPE_TAKE_AWAY";
		// 在线预订
		public static final String urlNameTypeReservation = "URL_NAME_TYPE_RESERVATION";
		// 立即使用
		public static final String urlNameTypeUseImmediately = "URL_NAME_TYPE_USE_IMMEDIATELY";
		// 在线预约
		public static final String urlNameTypeAppointment = "URL_NAME_TYPE_APPOINTMENT";
		// 在线兑换
		public static final String urlNameTypeExchange = "URL_NAME_TYPE_EXCHANGE";
		// 会员服务(仅会员卡类型可用)
		public static final String urlNameTypeVipService = "URL_NAME_TYPE_VIP_SERVICE";
	}
}