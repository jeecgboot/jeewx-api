package org.jeewx.api.wxbase.wxmedia;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.jeewx.api.core.common.WxstoreUtils;
import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.core.req.WeiXinReqService;
import org.jeewx.api.core.req.model.DownloadMedia;
import org.jeewx.api.core.req.model.UploadMedia;
import org.jeewx.api.core.util.WeiXinConstant;
import org.jeewx.api.core.util.WeiXinReqUtil;
import org.jeewx.api.wxbase.wxmedia.model.WxArticlesRequest;
import org.jeewx.api.wxbase.wxmedia.model.WxArticlesRequestByMaterial;
import org.jeewx.api.wxbase.wxmedia.model.WxArticlesRespponseByMaterial;
import org.jeewx.api.wxbase.wxmedia.model.WxCountResponse;
import org.jeewx.api.wxbase.wxmedia.model.WxDescriptionRequest;
import org.jeewx.api.wxbase.wxmedia.model.WxDwonload;
import org.jeewx.api.wxbase.wxmedia.model.WxItem;
import org.jeewx.api.wxbase.wxmedia.model.WxMediaForMaterial;
import org.jeewx.api.wxbase.wxmedia.model.WxMediaForMaterialResponse;
import org.jeewx.api.wxbase.wxmedia.model.WxNews;
import org.jeewx.api.wxbase.wxmedia.model.WxNewsArticle;
import org.jeewx.api.wxbase.wxmedia.model.WxUpdateArticle;
import org.jeewx.api.wxbase.wxmedia.model.WxUpload;
import org.jeewx.api.wxsendmsg.JwSendMessageAPI;
import org.jeewx.api.wxsendmsg.model.WxArticle;
import org.jeewx.api.wxsendmsg.model.WxArticlesResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 微信--token信息
 * 
 * @author lizr
 * 
 */
public class JwMediaAPI {
	private static Logger logger = LoggerFactory.getLogger(JwMediaAPI.class);
