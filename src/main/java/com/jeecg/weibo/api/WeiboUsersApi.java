package com.jeecg.weibo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jeecg.weibo.exception.BusinessException;
import com.jeecg.weibo.util.HttpUtil;
import com.jeecg.weibo.util.WeiboUsersUtil;

public class WeiboUsersApi {
	private static final Logger logger = LoggerFactory.getLogger(WeiboUsersApi.class);
	//1、根据用户ID获取用户信息的url
	private static final String show_url="https://api.weibo.com/2/users/show.json?1=1";
	//2、批量获取用户的粉丝数、关注数、微博数
	private static final String counts_url="https://api.weibo.com/2/users/counts.json?1=1";
	/**
	 * @param access_token  OAuth授权必填参数 
	 * @param uid  需要查询的用户ID
	 * @param screen_name  需要查询的用户昵称
	 * 根据用户ID获取用户信息
	 */
	public static JSONObject getShow(String access_token,String uid,String screen_name){
		JSONObject j=null;
		try {
			logger.info("根据用户ID获取用户信息的参数为:access_token:"+access_token+"    需要查询的用户ID:"+uid+"     需要查询的用户昵称:"+screen_name);
			//验证请求参数
			WeiboUsersUtil.getShowParmValidate(access_token,uid,screen_name);
			String requestUrl = WeiboUsersUtil.getShowUrl(show_url, access_token, uid, screen_name);
			logger.info("根据用户ID获取用户信息的路径为:"+requestUrl);
			j = HttpUtil.httpRequest(requestUrl, "GET", null);
			if(j!=null){
				logger.info("根据用户ID获取用户信息的结果为:"+j.toString());
			}else{
				logger.info("根据用户ID获取用户信息的结果为:null");
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
	 * @param uids  需要获取数据的用户UID，多个之间用逗号分隔
	 * 
	 * 批量获取用户的粉丝数、关注数、微博数接口
	 */
	public static JSONArray getCounts(String access_token,String uids){
		JSONArray j=null;
		try {
			logger.info("根据用户ID获取用户信息的参数为:access_token:"+access_token+"    需要查询的用户ID:"+uids);
			//验证请求参数
			WeiboUsersUtil.getCountsParmValidate(access_token, uids);
			String requestUrl = WeiboUsersUtil.getCountsUrl(counts_url, access_token, uids);
			logger.info("根据用户ID获取用户信息的路径为:"+requestUrl);
			j = HttpUtil.httpRequestArr(requestUrl, "GET", null);
			if(j!=null){
				logger.info("根据用户ID获取用户信息的结果为:"+j.toString());
			}else{
				logger.info("根据用户ID获取用户信息的结果为:null");
			}
		}catch(BusinessException e)	{
			logger.info(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}
	
	public static void main(String[] args) {
		//==================根据用户ID获取用户信息接口测试========start==================================
		/*String access_token="2.00rj8pTCRV_yBB5addd99887yjfcyC";
		String uid="";
		//String uid="2273040767";
		String screen_name="联通超级炫铃";
		//String screen_name="";
		getShow(access_token, uid, screen_name);*/
		//===================根据用户ID获取用户信息接口测试========end===================================
		
		//==================根据用户ID获取用户信息接口测试========start==================================
	/*	String access_token="2.00rj8pTCRV_yBB5addd99887yjfcyC";
		 String uids="4042534311692339,4042534311692377";
		//String uids="2273040767";
		getCounts(access_token, uids);*/
		//===================根据用户ID获取用户信息接口测试========end===================================
	}
}
