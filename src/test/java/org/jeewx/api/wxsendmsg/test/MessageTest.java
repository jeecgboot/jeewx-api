package org.jeewx.api.wxsendmsg.test;

import java.util.ArrayList;
import java.util.List;

import org.jeewx.api.core.common.AccessToken;
import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.wxsendmsg.JwSendMessageAPI;
import org.jeewx.api.wxsendmsg.model.WxArticle;
import org.jeewx.api.wxsendmsg.model.WxArticlesResponse;
import org.jeewx.api.wxsendmsg.model.WxMediaResponse;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 请使用认证的服务号测试
 * 
 * @author LIAIJUN
 * 
 */
public class MessageTest {
	private static String newAccessToken = null;
	private static String touser = null;

	/**
	 * 测试获取token
	 */
	// @Ignore
	@Before
	public void getToken() throws WexinReqException {
		touser = "oA1Vct-_r1rAd5mcL3lEZKgcvGZY";
		String appId = "wx6fdc3953994264a6";
		String appSecret = "b874abf79931998b57ecc3a6f6d9665e";
		AccessToken token = new AccessToken(appId, appSecret);

		String strtoken = token.getNewAccessToken();
		newAccessToken = strtoken;
		System.out.println(strtoken);

	}

	// 文本预览
	@Test
	public void testmessagePrivateUsedText() {
		JwSendMessageAPI service = new JwSendMessageAPI();
		try {
			String r = service.messagePrivate(newAccessToken, touser, "我要预览啊");
			System.out.println(r);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 上传资源
	// @Ignore
	@Test
	public void testuploadmedia() {

		JwSendMessageAPI service = new JwSendMessageAPI();
		try {
			WxMediaResponse r = service.uploadMediaFile(newAccessToken, "F:\\img\\", "showqrcode.jpg", "image");
			System.out.println(r);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 上传素材
	@Ignore
	@Test
	public void testuploadnews() {

		JwSendMessageAPI service = new JwSendMessageAPI();
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

			WxArticlesResponse result = service.uploadArticles(newAccessToken, wxArticles);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 图文消息预览
	@Test
	public void testmessagePrivateUsedNews() {

		JwSendMessageAPI service = new JwSendMessageAPI();
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

}
