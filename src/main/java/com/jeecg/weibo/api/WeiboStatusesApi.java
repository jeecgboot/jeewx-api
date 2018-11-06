package com.jeecg.weibo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jeecg.weibo.dto.WeiBoMentionsDto;
import com.jeecg.weibo.dto.WeiboUserTimelineDto;
import com.jeecg.weibo.exception.BusinessException;
import com.jeecg.weibo.util.HttpUtil;
import com.jeecg.weibo.util.WeiboStatusesUtil;

public class WeiboStatusesApi {
	private static final Logger logger = LoggerFactory.getLogger(WeiboStatusesApi.class);
	//1、获取用户发布的微博的url
	private static final String user_timeline_url="https://api.weibo.com/2/statuses/user_timeline.json?1=1";
	//2、获取用户发布的微博的ID的url
	private static final String user_timeline_ids_url="https://api.weibo.com/2/statuses/user_timeline/ids.json?1=1";
	//3、获取批量获取指定微博的转发数评论数的url
	private static final String count_url="https://api.weibo.com/2/statuses/count.json?1=1";
	//4、根据ID获取单条微博信息的url
	private static final String show_url="https://api.weibo.com/2/statuses/show.json?1=1";
	//5、获取@当前用户的最新微博的url
	private static final String mentions_url="https://api.weibo.com/2/statuses/mentions.json?1=1";
	//6、获取@当前用户的最新微博的ID的url
	private static final String mentions_ids_url="https://api.weibo.com/2/statuses/mentions/ids.json?1=1";
	/**
	 * @param access_token  OAuth授权必填参数 
	 * 
	 * 获取用户发布的微博接口
	 */
	public static JSONObject getUserTimeline(WeiboUserTimelineDto userTimeline){
		JSONObject j=null;
		try {
			logger.info("请求获取用户发布的微博的参数为:"+userTimeline.toString());
			//验证请求参数
			WeiboStatusesUtil.getUserTimelineParmValidate(userTimeline);
			String requestUrl = WeiboStatusesUtil.getUserTimelineUrl(user_timeline_url, userTimeline);
			logger.info("请求获取用户发布的微博的路径为:"+requestUrl);
			j = HttpUtil.httpRequest(requestUrl, "GET", null);
			if(j!=null){
				logger.info("请求获取用户发布的微博的结果为:"+j.toString());
			}else{
				logger.info("请求获取用户发布的微博的结果为:null");
			}
		}catch(BusinessException e)	{
			logger.info(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}
	/**
	 * @param access_token  OAuth授权必填参数 
	 * 
	 * 获取用户发布的微博的ID的接口
	 * 
	 */
	public static JSONObject getUserTimelineIds(WeiboUserTimelineDto userTimeline){
		JSONObject j=null;
		try {
			logger.info("获取用户发布的微博的ID的参数为:"+userTimeline.toString());
			//验证请求参数
			WeiboStatusesUtil.getUserTimelineIdsParmValidate(userTimeline);
			String requestUrl = WeiboStatusesUtil.getUserTimelineUrl(user_timeline_ids_url, userTimeline);
			logger.info("获取用户发布的微博的ID的路径为:"+requestUrl);
			j = HttpUtil.httpRequest(requestUrl, "GET", null);
			if(j!=null){
				logger.info("获取用户发布的微博的ID的结果为:"+j.toString());
			}else{
				logger.info("获取用户发布的微博的ID的结果为:null");
			}
		}catch(BusinessException e)	{
			logger.info(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}
	/**
	 * @param access_token  OAuth授权必填参数 
	 * @param ids 需要获取数据的微博ID,多个之间用逗号分隔
	 * 批量获取指定微博的转发数评论数接口
	 */
	public static JSONArray getCount(String access_token,String ids){
		JSONArray j=null;
		try {
			logger.info("批量获取指定微博的转发数评论数的参数为:access_token:"+access_token+"     微博ID:"+ids);
			//验证请求参数
			WeiboStatusesUtil.getCountParmValidate(access_token,ids);
			String requestUrl = WeiboStatusesUtil.getCountUrl(count_url, access_token, ids);
			logger.info("批量获取指定微博的转发数评论数的路径为:"+requestUrl);
			j = HttpUtil.httpRequestArr(requestUrl, "GET", null);
			if(j!=null){
				logger.info("批量获取指定微博的转发数评论数的结果为:"+j.toString());
			}else{
				logger.info("批量获取指定微博的转发数评论数的结果为:null");
			}
		}catch(BusinessException e)	{
			logger.info(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}
	/**
	 * @param access_token  OAuth授权必填参数 
	 * @param 需要获取的微博ID
	 * 
	 * 根据ID获取单条微博信息接口 
	 * 
	 */
	public static JSONObject getShow(String access_token,String id){
		JSONObject j=null;
		try {
			logger.info("根据ID获取单条微博信息的参数为:access_token:"+access_token+"     微博ID:"+id);
			//验证请求参数
			WeiboStatusesUtil.getShowParmValidate(access_token,id);
			String requestUrl = WeiboStatusesUtil.getShowUrl(show_url, access_token, id);
			logger.info("根据ID获取单条微博信息的路径为:"+requestUrl);
			j = HttpUtil.httpRequest(requestUrl, "GET", null);
			if(j!=null){
				logger.info("根据ID获取单条微博信息的结果为:"+j.toString());
			}else{
				logger.info("根据ID获取单条微博信息的结果为:null");
			}
		}catch(BusinessException e)	{
			logger.info(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}
	
	/**
	 * 
	 * @param access_token  OAuth授权必填参数 
	 * 
	 * 获取@当前用户的最新微博接口
	 */
	 public static JSONObject getMentions(WeiBoMentionsDto mentions){
			JSONObject j=null;
			try {
				logger.info("获取@当前用户的最新微博的参数为:"+mentions.toString());
				//验证请求参数
				WeiboStatusesUtil.getMentionsParmValidate(mentions);
				String requestUrl = WeiboStatusesUtil.getMentionsUrl(mentions_url, mentions);
				logger.info("获取@当前用户的最新微博路径为:"+requestUrl);
				j = HttpUtil.httpRequest(requestUrl, "GET", null);
				if(j!=null){
					logger.info("获取@当前用户的最新微博的结果为:"+j.toString());
				}else{
					logger.info("获取@当前用户的最新微博的结果为:null");
				}
			}catch(BusinessException e)	{
				logger.info(e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return j;
		}
	 /**
		 * 
		 * @param access_token  OAuth授权必填参数 
		 * 
		 * 获取@当前用户的最新微博的ID接口
		 */
		 public static JSONObject getMentionsIds(WeiBoMentionsDto mentions){
				JSONObject j=null;
				try {
					logger.info("获取@当前用户的最新微博的ID的参数为:"+mentions.toString());
					//验证请求参数
					WeiboStatusesUtil.getMentionsParmValidate(mentions);
					String requestUrl = WeiboStatusesUtil.getMentionsUrl(mentions_ids_url, mentions);
					logger.info("获取@当前用户的最新微博的ID路径为:"+requestUrl);
					j = HttpUtil.httpRequest(requestUrl, "GET", null);
					if(j!=null){
						logger.info("获取@当前用户的最新微博的ID的结果为:"+j.toString());
					}else{
						logger.info("获取@当前用户的最新微博的ID的结果为:null");
					}
				}catch(BusinessException e)	{
					logger.info(e.getMessage());
				} catch (Exception e) {
					e.printStackTrace();
				}
				return j;
			}
		 
	 
	public static void main(String[] args) {
		//=========================获取用户发布的微博接口测试======start=================================
	/*	WeiboUserTimelineDto userTimeline =new WeiboUserTimelineDto(); 
		userTimeline.setAccess_token("2.00rj8pTCRV_yBB5addd99887yjfcyC");
		//userTimeline.setUid("2273040767");
		//userTimeline.setScreen_name("联通超级炫铃");
		getUserTimeline(userTimeline);*/
		//==========================获取用户发布的微博接口测试======end===================================
		
		//=================获取用户发布的微博的ID的接口测试========start===================================
	/*	WeiboUserTimelineDto userTimeline =new WeiboUserTimelineDto(); 
		userTimeline.setAccess_token("2.00rj8pTCRV_yBB5addd99887yjfcyC");
		//userTimeline.setUid("2273040767");
		userTimeline.setScreen_name("联通超级炫铃");
		getUserTimelineIds(userTimeline);*/
		//===================获取用户发布的微博的ID的接口测试=======end====================================
		
		//==================批量获取指定微博的转发数评论数接口测试========start==================================
		/*String access_token="2.00rj8pTCRV_yBB5addd99887yjfcyC";
		String ids="4042534311692339,4042534311692377";
		getCount(access_token, ids);*/
		//===================批量获取指定微博的转发数评论数接口测试========end===================================
		
		//==================根据ID获取单条微博信息接口测试========start==================================
		/*String access_token="2.00rj8pTCRV_yBB5addd99887yjfcyC";
		String id="3720211465180913";
		getShow(access_token, id);*/
		//===================根据ID获取单条微博信息接口测试========end===================================
		
		//==================获取@当前用户的最新微博接口测试========start==================================
		/*WeiBoMentionsDto mentions=new WeiBoMentionsDto();
		mentions.setAccess_token("2.00rj8pTCRV_yBB5addd99887yjfcyC");
		getMentions(mentions);*/
		//===================获取@当前用户的最新微博接口测试========end===================================
		
		//==================获取@当前用户的最新微博的ID接口测试========start==================================
		/*WeiBoMentionsDto mentions=new WeiBoMentionsDto();
		mentions.setAccess_token("2.00rj8pTCRV_yBB5addd99887yjfcyC");
		getMentionsIds(mentions);*/
		//===================获取@当前用户的最新微博的ID接口测试========end===================================
	}
}
