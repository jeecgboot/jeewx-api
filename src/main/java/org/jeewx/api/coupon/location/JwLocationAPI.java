package org.jeewx.api.coupon.location;

import net.sf.json.JSONObject;

import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.core.req.WeiXinReqService;
import org.jeewx.api.core.common.WxstoreUtils;
import org.jeewx.api.coupon.location.model.Batchadd;
import org.jeewx.api.coupon.location.model.BatchaddRtn;
import org.jeewx.api.coupon.location.model.Batchget;
import org.jeewx.api.coupon.location.model.BatchgetRtn;
import org.jeewx.api.coupon.location.model.CardInfo;
import org.jeewx.api.coupon.location.model.CardInfoRtn;
import org.jeewx.api.coupon.location.model.Getcolors;
import org.jeewx.api.coupon.location.model.GetcolorsRtn;


/**
 * 微信卡券 - 创建卡券
 * @author lihongxuan
 *
 */
public class JwLocationAPI {
	/*// 上传LOGO 大小限制1MB，像素为300*300，支持JPG格式。
	private static String uploadimg_location_url = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=ACCESS_TOKEN";
	*/// 批量导入门店信息
	private static String batchadd_location_url = "https://api.weixin.qq.com/card/location/batchadd?access_token=ACCESS_TOKEN";
	// 拉取门店列表
	private static String batchget_location_url = "https://api.weixin.qq.com/card/location/batchget?access_token=ACCESS_TOKEN";
	// 获取颜色列表
	private static String getcolors_location_url = "https://api.weixin.qq.com/card/getcolors?access_token=ACCESS_TOKEN";
	// CreateCard 创建卡
	private static String add_card_url = "https://api.weixin.qq.com/card/create?access_token=ACCESS_TOKEN";
	
	/**
	 * 批量导入门店信息
	 * @throws WexinReqException 
	 */
	public BatchaddRtn doBatchadd(String accesstoken,Batchadd batchadd) throws WexinReqException {
		if (accesstoken != null) {
			batchadd.setAccess_token(accesstoken);
			JSONObject result = WeiXinReqService.getInstance().doWeinxinReqJson(batchadd);
			BatchaddRtn batchaddRtn = (BatchaddRtn)JSONObject.toBean(result, BatchaddRtn.class);
			return batchaddRtn;
		}
		return null;
	}
	
	/**
	 * 拉取门店列表
	 */
	public BatchgetRtn doBatchget(String accesstoken,Batchget batchget) throws WexinReqException{
		if (accesstoken != null) {
			batchget.setAccess_token(accesstoken);
			JSONObject result = WeiXinReqService.getInstance().doWeinxinReqJson(batchget);
			BatchgetRtn batchgetRtn = (BatchgetRtn)JSONObject.toBean(result, BatchgetRtn.class);
			return batchgetRtn;
		}
		return null;
	}
	
	/**
	 * 获取颜色列表
	 */
	public GetcolorsRtn doGetcolors(String accesstoken) throws WexinReqException {
		if (accesstoken != null) {
			Getcolors gk = new Getcolors();
			gk.setAccess_token(accesstoken);
			JSONObject result = WeiXinReqService.getInstance().doWeinxinReqJson(gk);
			GetcolorsRtn getcolorsRtn = (GetcolorsRtn)JSONObject.toBean(result, GetcolorsRtn.class);
			return getcolorsRtn;
		}
		return null;
	}
	
	/**
	 *  CreateCard 创建卡
	 */
	public CardInfoRtn doAddCard(String accesstoken,CardInfo cardInfo) throws WexinReqException{
		if (accesstoken != null) {
			cardInfo.setAccess_token(accesstoken);
			JSONObject result = WeiXinReqService.getInstance().doWeinxinReqJson(cardInfo);
			CardInfoRtn cardInfoRtn = (CardInfoRtn)JSONObject.toBean(result, CardInfoRtn.class);
			return cardInfoRtn;
		}
		return null;
	}

}
 