package org.jeewx.api.wxsendmsg.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.jeewx.api.core.common.AccessToken;
import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.core.req.model.user.Group;
import org.jeewx.api.wxsendmsg.JwSendMessageAPI;
import org.jeewx.api.wxsendmsg.model.SendMessageReport;
import org.jeewx.api.wxsendmsg.model.SendMessageResponse;
import org.jeewx.api.wxsendmsg.model.WxArticle;
import org.jeewx.api.wxsendmsg.model.WxMedia;
import org.jeewx.api.wxuser.user.model.Wxuser;
import org.junit.Before;
import org.junit.Test;

public class JwSendMessageAPITest {
	private static String newAccessToken = null;
	private static String touser = null;
	JwSendMessageAPI service = null;

	/**
	 * 测试获取token
	 */
	// @Ignore
	@Before
	public void getToken() throws WexinReqException {
		service = new JwSendMessageAPI();
		touser = "oA1Vct-_r1rAd5mcL3lEZKgcvGZY";
		 
		String appid = "wxb512901288a94943";
		String appscret = "6f94b81b49cf9f89fafe305dcaf2c632";
		
		AccessToken token = new AccessToken(appid, appscret);

		String strtoken = token.getNewAccessToken();
		newAccessToken = strtoken;
		System.out.println(strtoken);

	}
	
	@Test
	public void testMessagePrivateStringStringString() {
		// 文本预览
		try {
			String r = service.messagePrivate(newAccessToken, touser, "我要预览啊");
			System.out.println(r);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testMessagePrivateStringStringListOfWxArticle() {
		try {
			List<WxArticle> wxArticles = new ArrayList<WxArticle>();
			for (int i = 0; i < 4; i++) {
				WxArticle article = new WxArticle();
				article.setAuthor("author" + i);
				article.setContent("Content" + i);
				article.setDigest("Digest" + i);
				article.setShow_cover_pic("1");
				article.setTitle("title" + i);
				article.setFileName("showqrcode.jpg");
				article.setFilePath("F:\\img\\");
				wxArticles.add(article);
			}
			service.messagePrivate(newAccessToken, touser, wxArticles);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test
	public void testMessagePrivateStringStringWxMedia() {
		// 多媒体文件预览
		WxMedia media = new WxMedia();
		media.setType("image");
		media.setFileName("showqrcode.jpg");
		media.setFilePath("F:\\img\\");
		try {
			service.messagePrivate(newAccessToken, touser, media);
		} catch (WexinReqException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void testSendMessageToGroupOrAllWithText() {
		// 按组群发微信文本
		// 获取分组
		/*
		 * String url =
		 * "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=ACCESS_TOKEN"
		 * ; String requestUrl = url.replace("ACCESS_TOKEN", newAccessToken);
		 * JSONObject result = WxstoreUtils.httpRequest(requestUrl, "GET",
		 * null); System.out.println(result);
		 */

		// {"groups":[{"id":0,"count":44,"name":"未分组"},{"id":1,"count":0,"name":"黑名单"},{"id":2,"count":0,"name":"星标组"},{"id":100,"count":0,"name":"分组1"},{"id":101,"count":0,"name":"www"},{"id":102,"count":0,"name":"测试1"},{"id":103,"count":2,"name":"我的发送组"},{"id":104,"count":0,"name":"测试1"}]}
		// POST数据例子：{"openid":"oDF3iYx0ro3_7jD4HFRDfrjdCM58","to_groupid":108}

		// 移动用户至分组
		/*
		 * String url =
		 * "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=ACCESS_TOKEN"
		 * ; String requestUrl = url.replace("ACCESS_TOKEN", newAccessToken);
		 * JSONObject openid =new JSONObject(); openid.put("openid", touser);
		 * openid.put("to_groupid", "101"); JSONObject result =
		 * WxstoreUtils.httpRequest(requestUrl, "POST", openid.toString());
		 * System.out.println(result);
		 */

		try {
			Group group = new Group();
			group.setId("101");
			SendMessageResponse response = service.sendMessageToGroupOrAllWithText(newAccessToken, false, group, "我的文本预览。。。");
			System.out.println(response);
		} catch (WexinReqException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testSendMessageToGroupOrAllWithArticles() {
		// 图文按组发送
		try {
			List<WxArticle> wxArticles = new ArrayList<WxArticle>();
			for (int i = 0; i < 4; i++) {
				WxArticle article = new WxArticle();
				article.setAuthor("author" + i);
				article.setContent("Content" + i);
				article.setDigest("Digest" + i);
				article.setShow_cover_pic("1");
				article.setTitle("title" + i);
				article.setFileName("showqrcode.jpg");
				article.setFilePath("F:\\img\\");
				wxArticles.add(article);
			}
			Group group = new Group();
			group.setId("101");
			service.sendMessageToGroupOrAllWithArticles(newAccessToken, false, group, wxArticles);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSendMessageToGroupOrAllWithMedia() {
		// 多媒体文件按组发送
		WxMedia media = new WxMedia();
		media.setType("image");
		media.setFileName("showqrcode.jpg");
		media.setFilePath("F:\\img\\");
		try {
			Group group = new Group();
			group.setId("101");
			service.sendMessageToGroupOrAllWithMedia(newAccessToken, false, group, media);
		} catch (WexinReqException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testSendMessageToOpenidsWithText() {
		// 文本信息安人发送
		try {
			Wxuser user = new Wxuser();
			user.setOpenid(touser);
			Wxuser[] wxusers = new Wxuser[1];
			wxusers[0]=user;
			SendMessageResponse response = service.sendMessageToOpenidsWithText(newAccessToken, wxusers, "我的文本预览。。。");
			System.out.println(response);
		} catch (WexinReqException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testSendMessageToOpenidsWithArticles() {
		// 图文按人发送
		try {
			List<WxArticle> wxArticles = new ArrayList<WxArticle>();
			for (int i = 0; i < 4; i++) {
				WxArticle article = new WxArticle();
				article.setAuthor("author" + i);
				article.setContent("Content" + i);
				article.setDigest("Digest" + i);
				article.setShow_cover_pic("1");
				article.setTitle("title" + i);
				article.setFileName("showqrcode.jpg");
				article.setFilePath("F:\\img\\");
				wxArticles.add(article);
			}
			Wxuser user = new Wxuser();
			user.setOpenid(touser);
			Wxuser[] wxusers = new Wxuser[1];
			wxusers[0]=user;
			service.sendMessageToOpenidsWithArticles(newAccessToken,wxusers, wxArticles);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSendMessageToOpenidsWithMedia() {
		// 多媒体文件按人发送
				WxMedia media = new WxMedia();
				media.setType("image");
				media.setFileName("showqrcode.jpg");
				media.setFilePath("F:\\img\\");
				try {
					Wxuser user = new Wxuser();
					user.setOpenid(touser);
					Wxuser[] wxusers = new Wxuser[1];
					wxusers[0]=user;
					service.sendMessageToOpenidsWithMedia(newAccessToken,wxusers, media);
				} catch (WexinReqException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	@SuppressWarnings("static-access")
	@Test
	public void testDeleteSendMessage() {
		try {
			String response = service.deleteSendMessage(newAccessToken, "2350922727");
			System.out.println(response);
		} catch (WexinReqException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGetSendMessageStatus() {
		try {
			boolean response = service.getSendMessageStatus(newAccessToken, "2350922727");
			System.out.println(response);
		} catch (WexinReqException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGetReportBySendMessageReturnString() {
		String  a =  ""
		+ "<xml>"
		+ "<ToUserName><![CDATA[gh_3e8adccde292]]></ToUserName>"
		+ "<FromUserName><![CDATA[oR5Gjjl_eiZoUpGozMo7dbBJ362A]]></FromUserName>"
		+ "<CreateTime>1394524295</CreateTime>"
		+ "<MsgType><![CDATA[event]]></MsgType>"
		+ "<Event><![CDATA[MASSSENDJOBFINISH]]></Event>"
		+ "<MsgID>1988</MsgID>"
		+ "<Status><![CDATA[sendsuccess]]></Status>"
		+ "<TotalCount>100</TotalCount>"
		+ "<FilterCount>80</FilterCount>"
		+ "<SentCount>75</SentCount>"
		+ "<ErrorCount>5</ErrorCount>"
		+ "</xml>";
		try {
			SendMessageReport response = service.getReportBySendMessageReturnString(a);
			System.out.println(response);
		} catch (WexinReqException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
