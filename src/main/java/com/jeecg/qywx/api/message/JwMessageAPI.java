package com.jeecg.qywx.api.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.jeecg.qywx.api.base.JwAccessTokenAPI;
import com.jeecg.qywx.api.base.JwParamesAPI;
import com.jeecg.qywx.api.core.common.AccessToken;
import com.jeecg.qywx.api.core.util.HttpUtil;
import com.jeecg.qywx.api.media.vo.MpnewEntity;
import com.jeecg.qywx.api.message.vo.File;
import com.jeecg.qywx.api.message.vo.FileEntity;
import com.jeecg.qywx.api.message.vo.FixMpnews;
import com.jeecg.qywx.api.message.vo.Image;
import com.jeecg.qywx.api.message.vo.ImageEntity;
import com.jeecg.qywx.api.message.vo.Mpnews;
import com.jeecg.qywx.api.message.vo.MpnewsArticles;
import com.jeecg.qywx.api.message.vo.News;
import com.jeecg.qywx.api.message.vo.NewsArticle;
import com.jeecg.qywx.api.message.vo.NewsEntity;
import com.jeecg.qywx.api.message.vo.Text;
import com.jeecg.qywx.api.message.vo.TextEntity;
import com.jeecg.qywx.api.message.vo.Video;
import com.jeecg.qywx.api.message.vo.VideoEntity;
import com.jeecg.qywx.api.message.vo.Voice;
import com.jeecg.qywx.api.message.vo.VoiceEntity;
import com.jeecg.qywx.api.user.JwUserAPI;

public class JwMessageAPI {
	private static final Logger logger = LoggerFactory.getLogger(JwMessageAPI.class);
	//发送消息（post）
	 static String message_send_url="https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=ACCESS_TOKEN";
	 /*
	  * 发送文本信息
	 */
	 public static JSONObject sendTextMessage(Text text, String accessToken) {  
			logger.info("[CREATEMENU]", "createText param:accessToken:{},text:{}", new Object[]{accessToken,text});
		    int result = 0;  
		    // 拼装发送信息的url  
		    String url = message_send_url.replace("ACCESS_TOKEN", accessToken);  
		    // 将信息对象转换成json字符串  
		    String jsonText = JSONObject.toJSONString(text);  
		    logger.info("[CREATEMENU]", "sendMessage param:jsonText:{}", new Object[]{jsonText});
		    // 调用接口发送信息 
		    JSONObject jsonObject = HttpUtil.sendPost(url,jsonText);  
		
		    
		    logger.info("[CREATEMENU]", "sendMessage response:{}", new Object[]{jsonObject.toJSONString()});
		    if (null != jsonObject) {  
		    	int errcode = jsonObject.getIntValue("errcode");
		        result = errcode;
		    }  
		    return jsonObject;  
		}  
	 /*发送图片信息
	  * 
	  */
	 public static int sendImageMessage(Image image, String accessToken,String agentid) {  
			logger.info("[CREATEMENU]", "createText param:accessToken:{},agentid:{},image:{}", new Object[]{accessToken,agentid,image});
		    int result = 0;  
		    // 拼装发送信息的url  
		    String url = message_send_url.replace("ACCESS_TOKEN", accessToken).replace("AGENTID", agentid);  
		    // 将信息对象转换成json字符串  
		    String jsonImage = JSONObject.toJSONString(image);  
		    logger.info("[CREATEMENU]", "sendMessage param:jsonText:{}", new Object[]{jsonImage});
		    // 调用接口发送信息 
		    JSONObject jsonObject = HttpUtil.sendPost(url, jsonImage); 
		 
		    logger.info("[CREATEMENU]", "sendMessage response:{}", new Object[]{jsonObject.toJSONString()});
		    if (null != jsonObject) {  
		    	int errcode = jsonObject.getIntValue("errcode");
		        result = errcode;
		    }  
		    return result;  
		}  
	 
	 /*发送音频信息
	  * 
	  */
	 public static int sendVoiceMessage(Voice voice, String accessToken,String agentid) {  
			logger.info("[CREATEMENU]", "createText param:accessToken:{},agentid:{},voice:{}", new Object[]{accessToken,agentid,voice});
		    int result = 0;  
		    // 拼装发送信息的url  
		    String url = message_send_url.replace("ACCESS_TOKEN", accessToken).replace("AGENTID", agentid);  
		    // 将信息对象转换成json字符串  
		    String jsonVoice = JSONObject.toJSONString(voice);  
		    logger.info("[CREATEMENU]", "sendMessage param:jsonText:{}", new Object[]{jsonVoice});
		    // 调用接口发送信息 
		    JSONObject jsonObject = HttpUtil.sendPost(url, jsonVoice);  
		    logger.info("[CREATEMENU]", "sendMessage response:{}", new Object[]{jsonObject.toJSONString()});
		    if (null != jsonObject) {  
		    	int errcode = jsonObject.getIntValue("errcode");
		        result = errcode;
		    }  
		    return result;  
		}  
	 /*
	  * 发送视频消息
	  */
	 public static int sendVideoMessage(Video video, String accessToken,String agentid) {  
			logger.info("[CREATEMENU]", "createText param:accessToken:{},agentid:{},video:{}", new Object[]{accessToken,agentid,video});
		    int result = 0;  
		    // 拼装发送信息的url  
		    String url = message_send_url.replace("ACCESS_TOKEN", accessToken).replace("AGENTID", agentid);  
		    // 将信息对象转换成json字符串  
		    String jsonVideo = JSONObject.toJSONString(video);  
		    logger.info("[CREATEMENU]", "sendMessage param:jsonText:{}", new Object[]{jsonVideo});
		    // 调用接口发送信息 
		    JSONObject jsonObject = HttpUtil.sendPost(url, jsonVideo);  
		    logger.info("[CREATEMENU]", "sendMessage response:{}", new Object[]{jsonObject.toJSONString()});
		    if (null != jsonObject) {  
		    	int errcode = jsonObject.getIntValue("errcode");
		        result = errcode;
		    }  
		    return result;  
		}  
	 /*
	  * 发送媒体文件
	  * 
	  */
	 public static int sendFileMessage(File file, String accessToken,String agentid) {  
			logger.info("[CREATEMENU]", "createText param:accessToken:{},agentid:{},file:{}", new Object[]{accessToken,agentid,file});
		    int result = 0;  
		    // 拼装发送信息的url  
		    String url = message_send_url.replace("ACCESS_TOKEN", accessToken).replace("AGENTID", agentid);  
		    // 将信息对象转换成json字符串  
		    String jsonFile = JSONObject.toJSONString(file);  
		    logger.info("[CREATEMENU]", "sendMessage param:jsonText:{}", new Object[]{jsonFile});
		    // 调用接口发送信息 
		    JSONObject jsonObject = HttpUtil.sendPost(url, jsonFile);  
		    logger.info("[CREATEMENU]", "sendMessage response:{}", new Object[]{jsonObject.toJSONString()});
		    if (null != jsonObject) {  
		    	int errcode = jsonObject.getIntValue("errcode");
		        result = errcode;
		    }  
		    return result;  
		}  
	 /*
	  * 发送媒体文件消息
	  * 
	  */
	 public static JSONObject sendNewsMessage(News news, String accessToken) {  
			logger.info("[CREATEMENU]", "createText param:accessToken:{},news:{}", new Object[]{accessToken,news});
		    int result = 0;  
		    // 拼装发送信息的url  
		    String url = message_send_url.replace("ACCESS_TOKEN", accessToken);  
		    // 将信息对象转换成json字符串  
		    String jsonNews = JSONObject.toJSONString(news);  
		    logger.info("[CREATEMENU]", "sendMessage param:jsonText:{}", new Object[]{jsonNews});
		    // 调用接口发送信息 
		    JSONObject jsonObject = HttpUtil.sendPost(url, jsonNews);  
		    logger.info("[CREATEMENU]", "sendMessage response:{}", new Object[]{jsonObject.toJSONString()});
		    if (null != jsonObject) {  
		    	int errcode = jsonObject.getIntValue("errcode");
		        result = errcode;
		    }  
		    return jsonObject;  
		} 
	 /*
	  * 发送时直接带上素材
	  * 
	  */
	 public static int sendMpnewsMessage(Mpnews mpnews, String accessToken,String agentid) {  
			logger.info("[CREATEMENU]", "createText param:accessToken:{},agentid:{},mpnews:{}", new Object[]{accessToken,agentid,mpnews});
		    int result = 0;  
		    // 拼装发送信息的url  
		    String url = message_send_url.replace("ACCESS_TOKEN", accessToken).replace("AGENTID", agentid);  
		    // 将信息对象转换成json字符串  
		    String jsonMpnews = JSONObject.toJSONString(mpnews);  
		    logger.info("[CREATEMENU]", "sendMessage param:jsonText:{}", new Object[]{jsonMpnews});
		    // 调用接口发送信息 
		    JSONObject jsonObject = HttpUtil.sendPost(url, jsonMpnews);  
		    logger.info("[CREATEMENU]", "sendMessage response:{}", new Object[]{jsonObject.toJSONString()});
		    if (null != jsonObject) {  
		    	int errcode = jsonObject.getIntValue("errcode");
		        result = errcode;
		    }  
		    return result;  
		} 
	 /*
	  * 发送时使用永久性图文素材
	  * 
	  */
	 public static int sendFixMpnewsMessage(FixMpnews fixmpnews, String accessToken,String agentid) {  
			logger.info("[CREATEMENU]", "createText param:accessToken:{},agentid:{},fixmpnews:{}", new Object[]{accessToken,agentid,fixmpnews});
		    int result = 0;  
		    // 拼装发送信息的url  
		    String url = message_send_url.replace("ACCESS_TOKEN", accessToken).replace("AGENTID", agentid);  
		    // 将信息对象转换成json字符串  
		    String jsonFixMpnews = JSONObject.toJSONString(fixmpnews);  
		    logger.info("[CREATEMENU]", "sendMessage param:jsonText:{}", new Object[]{jsonFixMpnews});
		    // 调用接口发送信息 
		    JSONObject jsonObject = HttpUtil.sendPost(url, jsonFixMpnews);  
		    logger.info("[CREATEMENU]", "sendMessage response:{}", new Object[]{jsonObject.toJSONString()});
		    if (null != jsonObject) {  
		    	int errcode = jsonObject.getIntValue("errcode");
		        result = errcode;
		    }  
		    return result;  
		} 
	 
	 
//测试
	 public static void main(String[] args){
		 AccessToken accessToken = JwAccessTokenAPI.getAccessToken(JwParamesAPI.corpId,JwParamesAPI.secret);
		
		 Text text=new Text();
		text.setTouser("malimei");
		// text.setToparty("678910");
		// text.setTotag("112233");
		 text.setMsgtype("text");
		 text.setAgentid(1);
		TextEntity text1=new TextEntity();
		text1.setContent("aaaaaaa");
		text.setText(text1);
		text.setSafe("0");
		JwMessageAPI.sendTextMessage(text, accessToken.getAccesstoken());
		
		 
		 /*
		  * 图片
		  */
		/* Image image=new Image();
		 image.setTouser("malimei");
		 image.setMsgtype("image");
		 image.setAgentid(1);
		 ImageEntity imageEntity=new ImageEntity();
		 imageEntity.setMedia_id("1cjeJstIy7hU0FPsIEnXAj4QgTZZLVqI0Tjqamd8LzAUuGO6hMREqw-fUgiE2mpgD9Vw8qTWoIyhKa4-KF7PbBQ");
		 image.setImage(imageEntity);
		 String agentid="1";
		 JwMessageAPI.sendImageMessage(image, accessToken.getAccesstoken(), agentid);//{"errcode":0,"errmsg":"ok"}
		 */
		 //1NSJSg-ccFTPqSG5ccqwTiIwsrGOY6-6nJ9SPyYl9pIOyEzH5kaAmHFll0_SU5R_6CVVCFLJsjC-_rpWr_jCXAg
		/* Voice voice=new Voice();
		 voice.setTouser("malimei");
		 voice.setMsgtype("voice");
		 voice.setAgentid(1);
		 VoiceEntity voiceEntity=new VoiceEntity();
		 voiceEntity.setMedia_id("1NSJSg-ccFTPqSG5ccqwTiIwsrGOY6-6nJ9SPyYl9pIOyEzH5kaAmHFll0_SU5R_6CVVCFLJsjC-_rpWr_jCXAg");
		
		 voice.setVoice(voiceEntity);
		 String agentid="1";
		 JwMessageAPI.sendVoiceMessage(voice, accessToken.getAccesstoken(), agentid);//String agentid="1";
*/
		 /*
		 *视频
		 *
		
		 Video video=new Video();
		 video.setTouser("malimei");
		 video.setMsgtype("video");
		 video.setAgentid(1);
		 VideoEntity videoEntity=new VideoEntity();
		 videoEntity.setMedia_id("1k7eovYCr58zU4JC9CuDfvk3F1mL7EUqphvVMfNgBGw4D2_as1L5Nd9kRnK6hXv7TVIMl2u3uNlCvEQzgFW-iWw");
		 video.setVideo(videoEntity);
		 String agentid="1";
		 JwMessageAPI.sendVideoMessage(video, accessToken.getAccesstoken(), agentid);//{"errcode":0,"errmsg":"ok"}
		  **/
		 
		 /*
		  * 文件
		 
		 File file=new File();
		 file.setTouser("malimei");
		 file.setMsgtype("file");
		 file.setAgentid(1);
		FileEntity fileEntity=new FileEntity();
		fileEntity.setMedia_id("1k7eovYCr58zU4JC9CuDfvk3F1mL7EUqphvVMfNgBGw4D2_as1L5Nd9kRnK6hXv7TVIMl2u3uNlCvEQzgFW-iWw");
		file.setFile(fileEntity);
		 String agentid="1";
		 JwMessageAPI.sendFileMessage(file, accessToken.getAccesstoken(), agentid);*/
		 /*发送图文信息
		  * 
		  */
		 News news=new News();
	//	news.setTouser("malimei|xinglei|zhoujf");
		 news.setToparty("1");
		 news.setMsgtype("news");
		 news.setAgentid(1);
		 
		 
		 NewsArticle newsArticles=new NewsArticle();
	
		 newsArticles.setTitle("哈喽");
		 String picurl="https://qyapi.weixin.qq.com/cgi-bin/media/get?access_token=eJ5FMzxYTeH12awmT33DAVUpPM2_zec8Nmct4N6rSMzE3f9L5ahksQ8dxqE0wjJE&media_id=1gbGp35rCKh_CT-Zl-d6HJeLubqyHqHiMevE56o2X6Ba2pxOp9wm-WMcOKwA5vbHezQrV_AiApj2V09KhzCV9yA";
		 newsArticles.setPicurl(picurl);
		 
	//	 NewsEntity newsEntity=new NewsEntity();
		// newsEntity.setArticles(new NewsArticle[] {newsArticles});
		// news.setNews(newsEntity);
		
		 
		 NewsArticle newsArticles1=new NewsArticle();
		 newsArticles1.setTitle("你好");
		 String picurl1="https://qyapi.weixin.qq.com/cgi-bin/media/get?access_token=eJ5FMzxYTeH12awmT33DAVUpPM2_zec8Nmct4N6rSMzE3f9L5ahksQ8dxqE0wjJE&media_id=1gbGp35rCKh_CT-Zl-d6HJeLubqyHqHiMevE56o2X6Ba2pxOp9wm-WMcOKwA5vbHezQrV_AiApj2V09KhzCV9yA";
		 newsArticles.setPicurl(picurl1);
		 NewsEntity newsEntity1=new NewsEntity();
		newsEntity1.setArticles(new NewsArticle[] {newsArticles1 ,newsArticles});
		 news.setNews(newsEntity1);
		 
		 
		 JwMessageAPI.sendNewsMessage(news, accessToken.getAccesstoken());
		
		 
		 /*
		  *mpnews消息
		  */
		 
		/* Mpnews mpnewsa=new Mpnews();
		 mpnewsa.setTouser("malimei");
		 mpnewsa.setMsgtype("mpnews");
		 mpnewsa.setAgentid(1);
		 MpnewsArticles articles=new MpnewsArticles();
		 articles.setTitle("嘿嘿");
		 articles.setContent("a");
		 articles.setThumb_media_id("1S9IBhHEbQ8eUpntYiTQioj6ttEi0Cbpve-2SRVcUEDo8-yKzGCD7JtSLpF7Qv5jgmt1SAmj2haczUx-rFa6Z0Q");
	MpnewEntity mpnews=new MpnewEntity();
	mpnews.setArticles(new MpnewsArticles[] {articles});
	mpnews.setMpnews(mpnews);
	String agentid="1";
	//String accessToken="eJ5FMzxYTeH12awmT33DAVUpPM2_zec8Nmct4N6rSMzE3f9L5ahksQ8dxqE0wjJE";
	JwMessageAPI.sendMpnewsMessage(mpnewsa, accessToken.getAccesstoken(), agentid);
		 */
		 
		 
	 }
}
