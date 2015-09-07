package org.jeewx.api.wxsendmsg;

import java.io.File;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jeewx.api.core.common.WxstoreUtils;
import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.core.req.model.user.Group;
import org.jeewx.api.core.util.WeiXinReqUtil;
import org.jeewx.api.wxbase.wxmedia.model.WxArticlesRequest;
import org.jeewx.api.wxbase.wxmedia.model.WxArticlesRequestByMaterial;
import org.jeewx.api.wxbase.wxmedia.model.WxArticlesRespponseByMaterial;
import org.jeewx.api.wxbase.wxmedia.model.WxCountResponse;
import org.jeewx.api.wxbase.wxmedia.model.WxDescriptionRequest;
import org.jeewx.api.wxbase.wxmedia.model.WxMediaForMaterial;
import org.jeewx.api.wxbase.wxmedia.model.WxMediaForMaterialResponse;
import org.jeewx.api.wxbase.wxmedia.model.WxNews;
import org.jeewx.api.wxbase.wxmedia.model.WxUpdateArticle;
import org.jeewx.api.wxsendmsg.model.SendMessageReport;
import org.jeewx.api.wxsendmsg.model.SendMessageResponse;
import org.jeewx.api.wxsendmsg.model.WxArticle;
import org.jeewx.api.wxsendmsg.model.WxArticlesResponse;
import org.jeewx.api.wxsendmsg.model.WxMedia;
import org.jeewx.api.wxsendmsg.model.WxMediaResponse;
import org.jeewx.api.wxuser.user.model.Wxuser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JwSendMessageAPI {
	private static Logger logger = LoggerFactory.getLogger(JwSendMessageAPI.class);
	// 消息预览URL
	private static String message_preview_url = "https://api.weixin.qq.com/cgi-bin/message/mass/preview?access_token=ACCESS_TOKEN";
	// 上传媒体资源URL
	private static String upload_media_url = "http://file.api.weixin.qq.com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE";
	// 上传图文素材资源URL
	private static String upload_article_url = "https://api.weixin.qq.com/cgi-bin/media/uploadnews?access_token=ACCESS_TOKEN";
	// 根据分组进行群发URL
	private static String message_group_url = "https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token=ACCESS_TOKEN";
	// 根据OpenID列表群发URL
	private static String message_openid_url = "https://api.weixin.qq.com/cgi-bin/message/mass/send?access_token=ACCESS_TOKEN";
	// 删除群发URL
	private static String message_delete_url = "https://api.weixin.qq.com/cgi-bin/message/mass/delete?access_token=ACCESS_TOKEN";
	// 查询群发消息发送状态URL
	private static String message_get_url = "https://api.weixin.qq.com/cgi-bin/message/mass/get?access_token=ACCESS_TOKEN";
			
	/**
	 * 图文消息预览
	 * 
	 * @param touser
	 *            接收人openid
	 * @param wxArticles
	 *            图文集合
	 * @throws WexinReqException
	 */
	public static void messagePrivate(String accesstoken, String touser, List<WxArticle> wxArticles) throws WexinReqException {

		if (accesstoken != null) {
			String requestUrl = message_preview_url.replace("ACCESS_TOKEN", accesstoken);
			try {
				String mediaId = getMediaId(accesstoken, wxArticles);
				JSONObject obj = new JSONObject();
				JSONObject mpnews = new JSONObject();
				obj.put("touser", touser);
				obj.put("msgtype", "mpnews");
				mpnews.put("media_id", mediaId);
				obj.put("mpnews", mpnews);
				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
	}

	/**
	 * 文本消息预览
	 * 
	 * @param touser
	 * @param content
	 * @throws Exception
	 */
	public static String messagePrivate(String accesstoken, String touser, String content) throws WexinReqException {
		String ret = "";
		if (accesstoken != null) {
			String requestUrl = message_preview_url.replace("ACCESS_TOKEN", accesstoken);
			try {

				JSONObject obj = new JSONObject();
				JSONObject text = new JSONObject();
				obj.put("touser", touser);
				obj.put("msgtype", "text");
				text.put("content", content);
				obj.put("text", text);
				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				ret = result.toString();
			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
		return ret;
	}

	/**
	 * 语音，图片，视频消息预览
	 * 
	 * @param touser
	 * @param wxArticles
	 * @throws Exception
	 */
	public static void messagePrivate(String accesstoken, String touser, WxMedia wxMedia) throws WexinReqException {

		if (accesstoken != null) {
			String requestUrl = message_preview_url.replace("ACCESS_TOKEN", accesstoken);
			try {

				String mediaId = getMediaId(accesstoken, wxMedia);
				JSONObject obj = new JSONObject();
				JSONObject type = new JSONObject();
				obj.put("touser", touser);
				obj.put("msgtype", wxMedia.getType());
				type.put("media_id", mediaId);
				obj.put(wxMedia.getType(), type);
				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				if (result.getInt("errcode") != 0) {
					logger.error("多媒体消息预览失败！errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
					throw new Exception("多媒体消息预览失败！errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
				}
			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
	}

	/**
	 * 群发图文消息到指定的微信分组或所有人
	 * 
	 * @param accesstoken
	 * @param is_to_all
	 *            是否发送给所有人 ，ture 发送给所有人，false 按组发送
	 * @param group
	 *            微信的用户组，如果is_to_all=false,则字段必须填写
	 * @param wxArticles
	 *            图文素材集合
	 * @return
	 * @throws WexinReqException
	 */
	public static SendMessageResponse sendMessageToGroupOrAllWithArticles(String accesstoken, boolean is_to_all, Group group, List<WxArticle> wxArticles) throws WexinReqException {
		SendMessageResponse response = null;
		if (accesstoken != null) {
			String requestUrl = message_group_url.replace("ACCESS_TOKEN", accesstoken);
			try {
				String mediaId = getMediaId(accesstoken, wxArticles);
				JSONObject obj = new JSONObject();
				JSONObject filter = new JSONObject();
				JSONObject mpnews = new JSONObject();

				filter.put("is_to_all", is_to_all);
				if (!is_to_all) {
					filter.put("group_id", group.getId());

				}
				obj.put("filter", filter);

				mpnews.put("media_id", mediaId);
				obj.put("mpnews", mpnews);

				obj.put("msgtype", "mpnews");
				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				response = (SendMessageResponse) JSONObject.toBean(result, SendMessageResponse.class);
			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
		return response;
	}

	/**
	 * 群发文本消息到指定的微信分组或所有人
	 * 
	 * @param accesstoken
	 * @param is_to_all
	 *            是否发送给所有人 ，ture 发送给所有人，false 按组发送
	 * @param group
	 *           微信的用户组，如果is_to_all=false,则字段必须填写
	 * @param content
	 *            文本内容
	 * @return
	 * @throws WexinReqException
	 */
	public static SendMessageResponse sendMessageToGroupOrAllWithText(String accesstoken, boolean is_to_all, Group group, String content) throws WexinReqException {
		SendMessageResponse response = null;
		if (accesstoken != null) {
			String requestUrl = message_group_url.replace("ACCESS_TOKEN", accesstoken);
			try {

				JSONObject obj = new JSONObject();
				JSONObject filter = new JSONObject();
				JSONObject text = new JSONObject();

				filter.put("is_to_all", is_to_all);
				if (!is_to_all) {
					filter.put("group_id", group.getId());

				}
				obj.put("filter", filter);

				text.put("content", content);
				obj.put("text", text);

				obj.put("msgtype", "text");

				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				response = (SendMessageResponse) JSONObject.toBean(result, SendMessageResponse.class);
			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
		return response;
	}

	/**
	 * 使用语音、图片、视频群发消息到指定的微信分组或所有人
	 * 
	 * @param accesstoken
	 * @param is_to_all
	 *            是否发送给所有人 ，ture 发送给所有人，false 按组发送
	 * @param group
	 *            微信的用户组，如果is_to_all=false,则字段必须填写
	 * @param wxMedia
	 *            多媒体资源, 语音为voice， 图片为image，视频为video
	 * @return
	 * @throws WexinReqException
	 */
	public static SendMessageResponse sendMessageToGroupOrAllWithMedia(String accesstoken, boolean is_to_all,Group group, WxMedia wxMedia) throws WexinReqException {

		SendMessageResponse response = null;
		if (accesstoken != null) {
			String requestUrl = message_group_url.replace("ACCESS_TOKEN", accesstoken);
			try {

				String mediaId = getMediaId(accesstoken, wxMedia);
				JSONObject obj = new JSONObject();
				JSONObject filter = new JSONObject();
				JSONObject media = new JSONObject();

				filter.put("is_to_all", is_to_all);
				if (!is_to_all) {
					filter.put("group_id", group.getId());

				}
				 
				obj.put("filter", filter);

				media.put("media_id", mediaId);
				obj.put(wxMedia.getType(), media);

				obj.put("msgtype", wxMedia.getType());

				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				response = (SendMessageResponse) JSONObject.toBean(result, SendMessageResponse.class);
			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
		return response;
	}

	/**
	 * 群发图文消息到指定的微信openid数组
	 * 
	 * @param accesstoken
	 * @param wxusers
	 *            接受消息的微信用户数组
	 * @param wxArticles
	 *            图文素材集合
	 * @return
	 * @throws WexinReqException
	 */
	public static SendMessageResponse sendMessageToOpenidsWithArticles(String accesstoken, Wxuser[] wxusers, List<WxArticle> wxArticles) throws WexinReqException {
		SendMessageResponse response = null;
		if (accesstoken != null) {
			String requestUrl = message_openid_url.replace("ACCESS_TOKEN", accesstoken);
			List<String> openids = new ArrayList<String>();
			for(Wxuser wxuser : wxusers)
			{
				openids.add(wxuser.getOpenid());
			}
			try {
				String mediaId = getMediaId(accesstoken, wxArticles);
				JSONObject obj = new JSONObject();
				JSONObject mpnews = new JSONObject();
				obj.put("touser", openids);

				mpnews.put("media_id", mediaId);
				obj.put("mpnews", mpnews);

				obj.put("msgtype", "mpnews");
				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				response = (SendMessageResponse) JSONObject.toBean(result, SendMessageResponse.class);
			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
		return response;
	}

	/**
	 * 群发文本消息到指定的微信openid数组
	 * 
	 * @param accesstoken
	 * @param wxusers
	 *            接受消息的微信用户数组
	 * @param content
	 *            文本内容
	 * @return
	 * @throws WexinReqException
	 */
	public static SendMessageResponse sendMessageToOpenidsWithText(String accesstoken, Wxuser[] wxusers, String content) throws WexinReqException {
		SendMessageResponse response = null;
		if (accesstoken != null) {
			String requestUrl = message_openid_url.replace("ACCESS_TOKEN", accesstoken);
			List<String> openids = new ArrayList<String>();
			for(Wxuser wxuser : wxusers)
			{
				openids.add(wxuser.getOpenid());
			}
			try {

				JSONObject obj = new JSONObject();
				JSONObject text = new JSONObject();

				obj.put("touser", openids);

				text.put("content", content);
				obj.put("text", text);

				obj.put("msgtype", "text");

				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				response = (SendMessageResponse) JSONObject.toBean(result, SendMessageResponse.class);
			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
		return response;
	}

	/**
	 * 使用语音、图片、视频群发消息到指定的微信openid数组
	 * 
	 * @param accesstoken
	 * @param wxusers
	 *            接受消息的微信用户数组
	 * @param wxMedia
	 *            多媒体资源, 语音为voice， 图片为image，视频为video
	 * @return
	 * @throws WexinReqException
	 */
	public static SendMessageResponse sendMessageToOpenidsWithMedia(String accesstoken, Wxuser[] wxusers, WxMedia wxMedia) throws WexinReqException {

		SendMessageResponse response = null;
		if (accesstoken != null) {
			String requestUrl = message_openid_url.replace("ACCESS_TOKEN", accesstoken);
			List<String> openids = new ArrayList<String>();
			for(Wxuser wxuser : wxusers)
			{
				openids.add(wxuser.getOpenid());
			}
			try {

				String mediaId = getMediaId(accesstoken, wxMedia);
				JSONObject obj = new JSONObject();
				JSONObject media = new JSONObject();

				obj.put("touser", openids);

				media.put("media_id", mediaId);
				obj.put(wxMedia.getType(), media);

				obj.put("msgtype", wxMedia.getType());

				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				response = (SendMessageResponse) JSONObject.toBean(result, SendMessageResponse.class);
			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
		return response;
	}

	/**
	 * 根据群发的msg_id删除群发<br/>
	 * 请注意，只有已经发送成功的消息才能删除删除消息只是将消息的图文详情页失效，已经收到的用户，还是能在其本地看到消息卡片。
	 * 另外，删除群发消息只能删除图文消息和视频消息，其他类型的消息一经发送，无法删除。
	 * 
	 * @param accesstoken
	 * @param msg_id
	 *            群发消息的msg_id
	 * @return
	 * @throws WexinReqException
	 */
	public static String deleteSendMessage(String accesstoken, String msg_id) throws WexinReqException {

		String response = null;
		if (accesstoken != null) {
			String requestUrl = message_delete_url.replace("ACCESS_TOKEN", accesstoken);
			try {

				JSONObject obj = new JSONObject();

				obj.put("msg_id", msg_id);

				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				response = result.toString();
			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
		return response;
	}

	/**
	 * 根据群发的msg_id查询群发消息发送状态
	 * 
	 * @param accesstoken
	 * @param msg_id
	 *            群发消息的msg_id
	 * @return true表示发送成功，false表示发送失败
	 * @throws WexinReqException
	 */
	public static boolean getSendMessageStatus(String accesstoken, String msg_id) throws WexinReqException {

		boolean response = false;
		if (accesstoken != null) {
			String requestUrl = message_get_url.replace("ACCESS_TOKEN", accesstoken);
			try {

				JSONObject obj = new JSONObject();

				obj.put("msg_id", msg_id);

				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				if (result.containsKey("msg_status")) {

					if ("SEND_SUCCESS".equalsIgnoreCase(result.getString("msg_status"))) {
						response = true;

					}
				}

			} catch (Exception e) {

				throw new WexinReqException(e);
			}
		} else {
			throw new WexinReqException("accesstoken 为空，请检查！");
		}
		return response;
	}

	/**
	 * 
	 * 根据微信事件推送群发结果获取群发消息的发送报告
	 * @param xmlString
	 *            信事件推送群发结果xmlString
	 * @return 微信发送报告实体对象
	 * @throws WexinReqException
	 */
	@SuppressWarnings("rawtypes")
	public static SendMessageReport getReportBySendMessageReturnString(String xmlString) throws WexinReqException {
		SendMessageReport report = new SendMessageReport();
		SAXBuilder build = new SAXBuilder();
		Document doc = null;
		try {
			doc = build.build(new StringReader(xmlString));
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new WexinReqException(e1);
		}
		Element root = doc.getRootElement();
		Iterator itr = (root.getChildren()).iterator();
		Class<SendMessageReport> clazz = SendMessageReport.class;
		while (itr.hasNext()) {
			Element oneLevelDeep = (Element) itr.next();
			// System.out.println("name ==>>" + oneLevelDeep.getName() +
			// ":::: value==>> " + oneLevelDeep.getText());
			try {
				Field filed = clazz.getDeclaredField(oneLevelDeep.getName());
				filed.setAccessible(true);
				filed.set(report, oneLevelDeep.getText());
				filed.setAccessible(false);
			} catch (NoSuchFieldException e) {

			} catch (SecurityException e) {

			} catch (IllegalArgumentException e) {

			} catch (IllegalAccessException e) {

			}

		}

		return report;
	}

	/**
	 * 获取多媒体资源的mediaId
	 * 
	 * @param accesstoken
	 * @param wxMedia
	 * @return
	 * @throws WexinReqException
	 */
	public static String getMediaId(String accesstoken, WxMedia wxMedia) throws WexinReqException {

		WxMediaResponse response = uploadMediaFile(accesstoken, wxMedia.getFilePath(), wxMedia.getFileName(), wxMedia.getType());
		if (response == null) {
			throw new WexinReqException("获取多媒体资源的mediaId失败");
		}
		return response.getMedia_id();

	}
	
	
	
	

	public static String getMediaId(String accesstoken, List<WxArticle> wxArticles) throws WexinReqException {

		WxArticlesResponse response = uploadArticles(accesstoken, wxArticles);
		if (response == null) {
			throw new WexinReqException("获取图文的mediaId失败");
		}
		return response.getMedia_id();
	}
	
	/**
	 * 上传图文消息素材
	 * 
	 * @param accesstoken
	 * @param wxArticles
	 *            图文集合，数量不大于10
	 * @return WxArticlesResponse 上传图文消息素材返回结果
	 * @throws WexinReqException
	 */
	public static WxArticlesResponse uploadArticles(String accesstoken, List<WxArticle> wxArticles) throws WexinReqException {
		WxArticlesResponse wxArticlesResponse = null;
		if (wxArticles.size() == 0) {
			logger.error("没有上传的图文消息");
		} else if (wxArticles.size() > 10) {
			logger.error("图文消息最多为10个图文");
		} else {
			if (accesstoken != null) {
				String requestUrl = upload_article_url.replace("ACCESS_TOKEN", accesstoken);

				for (WxArticle article : wxArticles) {
					if (article.getFileName() != null && article.getFileName().length() > 0) {
						try {
							String mediaId = getFileMediaId(accesstoken, article);
							article.setThumb_media_id(mediaId);

						} catch (Exception e) {
							throw new WexinReqException(e);
						}
					}
				}
				WxArticlesRequest wxArticlesRequest = new WxArticlesRequest();
				wxArticlesRequest.setArticles(wxArticles);
				JSONObject obj = JSONObject.fromObject(wxArticlesRequest);
				JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
				//System.out.println("微信返回的结果：" + result.toString());
				if (result.has("errcode")) {
					logger.error("上传图文消息失败！errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
					throw new WexinReqException("上传图文消息失败！errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
				} else {

					wxArticlesResponse = new WxArticlesResponse();
					wxArticlesResponse.setMedia_id(result.getString("media_id"));
					wxArticlesResponse.setType(result.getString("type"));
					wxArticlesResponse.setCreated_at(new Date(result.getLong("created_at") * 1000));
				}

			}
		}

		return wxArticlesResponse;
	}
	
	

	/**
	 * 获取文件上传文件的media_id
	 * 
	 * @param accesstoken
	 * @param article
	 * @return
	 * @throws WexinReqException
	 */
	public static String getFileMediaId(String accesstoken, WxArticle article) throws WexinReqException {

		WxMediaResponse response = uploadMediaFile(accesstoken, article.getFilePath(), article.getFileName(), "image");
		if (response != null) {
			return response.getMedia_id();
		}
		throw new WexinReqException("获取文件的media_id失败");

	}

	/**
	 * 上传媒体资源
	 * 
	 * @param filePath
	 * @param fileName
	 * @param type
	 *            媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb）
	 * @return
	 * @throws Exception
	 */
	public static WxMediaResponse uploadMediaFile(String accesstoken, String filePath, String fileName, String type) throws WexinReqException {
		WxMediaResponse mediaResource = null;
		if (accesstoken != null) {
			String requestUrl = upload_media_url.replace("ACCESS_TOKEN", accesstoken).replace("TYPE", type);

			File file = new File(filePath + fileName);
			String contentType = WeiXinReqUtil.getFileContentType(fileName.substring(fileName.lastIndexOf(".") + 1));
			JSONObject result = WxstoreUtils.uploadMediaFile(requestUrl, file, contentType);
			//System.out.println("微信返回的结果：" + result.toString());
			if (result.containsKey("errcode")) {
				logger.error("上传媒体资源失败！errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
			} else {
				// {"type":"TYPE","media_id":"MEDIA_ID","created_at":123456789}
				mediaResource = new WxMediaResponse();
				mediaResource.setMedia_id(result.getString("media_id"));
				mediaResource.setType(result.getString("type"));
				mediaResource.setCreated_at(new Date(result.getLong("created_at") * 1000));
			}
			// return mediaResource;
		}
		return mediaResource;
	}
	
	

	public static void main(String[] args) throws WexinReqException {
		/*
		 * String a = "" + "<xml>" +
		 * "<ToUserName><![CDATA[gh_3e8adccde292]]></ToUserName>" +
		 * "<FromUserName><![CDATA[oR5Gjjl_eiZoUpGozMo7dbBJ362A]]></FromUserName>"
		 * + "<CreateTime>1394524295</CreateTime>" +
		 * "<MsgType><![CDATA[event]]></MsgType>" +
		 * "<Event><![CDATA[MASSSENDJOBFINISH]]></Event>" +
		 * "<MsgID>1988</MsgID>" + "<Status><![CDATA[sendsuccess]]></Status>" +
		 * "<TotalCount>100</TotalCount>" + "<FilterCount>80</FilterCount>" +
		 * "<SentCount>75</SentCount>" + "<ErrorCount>5</ErrorCount>" +
		 * "</xml>"; getReportBySendMessageReturnString(a);
		 */

		/*String a = "" + "{" + "   \"errcode\":0," + "   \"errmsg\":\"send job submission success\"," + "   \"msg_id\":34182" + "}";
		SendMessageResponse response = (SendMessageResponse) JSONObject.toBean(JSONObject.fromObject(a), SendMessageResponse.class);
		System.out.println(response);*/
		
		/*List<String> a  = new ArrayList<String>();
		a.add("111");
		a.add("3");
		a.add("4");
		a.add("e");
		a.add("df");
		a.add("222");
		JSONObject aa = new JSONObject();
		aa.put("user", a);
		System.out.println(aa.toString());*/
	}

}
