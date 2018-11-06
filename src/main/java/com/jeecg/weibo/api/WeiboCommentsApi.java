package com.jeecg.weibo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.jeecg.weibo.dto.WeiBoMentionsDto;
import com.jeecg.weibo.exception.BusinessException;
import com.jeecg.weibo.util.HttpUtil;
import com.jeecg.weibo.util.WeiboCommentsUtil;

public class WeiboCommentsApi {
	private static final Logger logger = LoggerFactory.getLogger(WeiboCommentsApi.class);
	//1、我发出的评论列表的url
	private static final String by_me_url="https://api.weibo.com/2/comments/by_me.json?1=1";
	//2、我收到的评论列表
	private static final String to_me_url="https://api.weibo.com/2/comments/to_me.json?1=1";
	/**
	 * @param access_token  OAuth授权必填参数 
	 * 
	 * 1、我发出的评论列表接口
	 */
	public static JSONObject getByme(WeiBoMentionsDto mentions){
		JSONObject j=null;
		try {
			logger.info("我发出的评论列表的参数为:"+mentions.toString());
			//验证请求参数
			WeiboCommentsUtil.getBymeParmValidate(mentions);
			String requestUrl = WeiboCommentsUtil.getTomeUrl(by_me_url, mentions);
			logger.info("我发出的评论列表的路径为:"+requestUrl);
			j = HttpUtil.httpRequest(requestUrl, "GET", null);
			if(j!=null){
				logger.info("我发出的评论列表的结果为:"+j.toString());
			}else{
				logger.info("我发出的评论列表的结果为:null");
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
	 * 2、我收到的评论列表接口
	 */
	public static JSONObject getTome(WeiBoMentionsDto mentions){
		JSONObject j=null;
		try {
			logger.info("我收到的评论列表的参数为:"+mentions.toString());
			//验证请求参数
			WeiboCommentsUtil.getBymeParmValidate(mentions);
			String requestUrl = WeiboCommentsUtil.getBymeUrl(to_me_url, mentions);
			logger.info("我收到的评论列表的路径为:"+requestUrl);
			j = HttpUtil.httpRequest(requestUrl, "GET", null);
			if(j!=null){
				logger.info("我收到的评论列表的结果为:"+j.toString());
			}else{
				logger.info("我收到的评论列表的结果为:null");
			}
		}catch(BusinessException e)	{
			logger.info(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}
	
	public static void main(String[] args) {
		//==================我发出的评论列表接口测试========start==================================
	/*	WeiBoMentionsDto mentions=new WeiBoMentionsDto();
		mentions.setAccess_token("2.00rj8pTCRV_yBB5addd99887yjfcyC");
		getByme(mentions);*/
		//===================我发出的评论列表接口测试========end===================================
		
		//==================我收到的评论列表接口测试========start==================================
		/*WeiBoMentionsDto mentions=new WeiBoMentionsDto();
		mentions.setAccess_token("2.00rj8pTCRV_yBB5addd99887yjfcyC");
		getTome(mentions);*/
		//===================我收到的评论列表接口测试========end===================================
	}
}
