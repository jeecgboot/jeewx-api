package com.jeecg.weibo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.jeecg.weibo.dto.WeiboFollowersDto;
import com.jeecg.weibo.exception.BusinessException;
import com.jeecg.weibo.util.HttpUtil;
import com.jeecg.weibo.util.WeiboFollowersUtil;

public class WeiboFriendshipsApi {
	private static final Logger logger = LoggerFactory.getLogger(WeiboFriendshipsApi.class);
	//1、获取用户粉丝列表的url
	private static final String followers_url="https://api.weibo.com/2/friendships/followers.json?1=1";
	//2、获取用户粉丝UID列表
	private static final  String followers_url_ids="https://api.weibo.com/2/friendships/followers/ids.json?1=1";
	/**
	 * @param access_token  OAuth授权必填参数 
	 * @param uid  需要查询的用户ID
	 * @param screen_name  需要查询的用户昵称
	 * 获取用户粉丝列表接口
	 */
	public static JSONObject getFollowers(WeiboFollowersDto followers){
		JSONObject j=null;
		try {
			logger.info("获取用户粉丝列表的参数为:"+followers.toString());
			//验证请求参数
			WeiboFollowersUtil.getFollowersParmValidate(followers);
			String requestUrl = WeiboFollowersUtil.getFollowersUrl(followers_url, followers);
			logger.info("获取用户粉丝列表的路径为:"+requestUrl);
			j = HttpUtil.httpRequest(requestUrl, "GET", null);
			if(j!=null){
				logger.info("获取用户粉丝列表的结果为:"+j.toString());
			}else{
				logger.info("获取用户粉丝列表的结果为:null");
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
	 * @param uid  需要查询的用户ID
	 * @param screen_name  需要查询的用户昵称
	 * 获取用户粉丝UID列表接口
	 */
	public static JSONObject getFollowersIds(WeiboFollowersDto followers){
		JSONObject j=null;
		try {
			logger.info("获取用户粉丝UID列表的参数为:"+followers.toString());
			//验证请求参数
			WeiboFollowersUtil.getFollowersIdsParmValidate(followers);
			String requestUrl = WeiboFollowersUtil.getFollowersIdsUrl(followers_url_ids, followers);
			logger.info("获取用户粉丝UID列表的路径为:"+requestUrl);
			j = HttpUtil.httpRequest(requestUrl, "GET", null);
			if(j!=null){
				logger.info("获取用户粉丝UID列表的结果为:"+j.toString());
			}else{
				logger.info("获取用户粉丝UID列表的结果为:null");
			}
		}catch(BusinessException e)	{
			logger.info(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	public static void main(String[] args) {
		//==================获取用户粉丝列表接口测试========start==================================
		/* WeiboFollowersDto followers=new WeiboFollowersDto();
			followers.setAccess_token("2.00rj8pTCRV_yBB5addd99887yjfcyC");
			followers.setUid("2273040767");
			followers.setScreen_name("联通超级炫铃");
			getFollowers(followers);*/
		//===================获取用户粉丝列表接口测试========end===================================
		
		//==================取用户粉丝UID列表接口测试========start==================================
	     /* WeiboFollowersDto followers=new WeiboFollowersDto();
		   	followers.setAccess_token("2.00rj8pTCRV_yBB5addd99887yjfcyC");
			//followers.setUid("2273040767");
			//followers.setScreen_name("随意平素");
			getFollowersIds(followers);*/
		//===================取用户粉丝UID列表接口测试========end===================================
	}
}
