package com.jeecg.qywx.api.userandopenmsg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.jeecg.qywx.api.base.JwAccessTokenAPI;
import com.jeecg.qywx.api.base.JwParamesAPI;
import com.jeecg.qywx.api.core.common.AccessToken;
import com.jeecg.qywx.api.core.util.HttpUtil;
import com.jeecg.qywx.api.user.JwUserAPI;
import com.jeecg.qywx.api.user.vo.User;
import com.jeecg.qywx.api.userandopenmsg.vo.OpenToUser;
import com.jeecg.qywx.api.userandopenmsg.vo.UserToOpen;

public class JwCardMessageAPI {
private static final Logger logger = LoggerFactory.getLogger(JwUserAPI.class);
//userid转换成openid接口
private static String card_userConverOpen_url ="https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_openid?access_token=ACCESS_TOKEN";
//openid转换成userid接口
private static String card_openConverUser_url="https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_userid?access_token=ACCESS_TOKEN";


/**
 * userid转换成openid接口的api
 * @param UserToOpen 用户实例 
 * @param accessToken 有效的access_token 
 * @return   0表示成功，其他值表示失败 
 */
public static int userConverOpen(UserToOpen userToOpen, String accessToken){
	int result = 0;  
	logger.info("[CREATEUSER]", "createUser param:userToOpen:{},accessToken:{}", new Object[]{userToOpen,accessToken});
	// 拼装获取成员列表的url  
    String url = card_userConverOpen_url.replace("ACCESS_TOKEN", accessToken);  
    // 将成员对象转换成json字符串  
    String jsonUserTOOpen = JSONObject.toJSONString(userToOpen);  
    logger.info("[CREATEUSER]", "createUser param:jsonUser:{}", new Object[]{jsonUserTOOpen});
    // 调用接口创建用户 
    JSONObject jsonObject = HttpUtil.sendPost(url, jsonUserTOOpen);
 
    logger.info("[CREATEUSER]", "createUser response:{}", new Object[]{jsonObject.toJSONString()});
    // 调用接口创建用户  
    if (null != jsonObject) {  
    	int errcode = jsonObject.getIntValue("errcode");
        result = errcode;
    }  
	return result;
}
/**
 * openid转换成userid接口
 * @param OpenToUser 用户实例 
 * @param accessToken 有效的access_token 
 * @return   0表示成功，其他值表示失败 
 */

public static int openConverUser(OpenToUser openToUser, String accessToken){
	int result = 0;  
	logger.info("[CREATEUSER]", "createUser param:openToUser:{},accessToken:{}", new Object[]{openToUser,accessToken});
	// 拼装获取成员列表的url  
    String url = card_userConverOpen_url.replace("ACCESS_TOKEN", accessToken);  
    // 将成员对象转换成json字符串  
    String jsonOpenToUser = JSONObject.toJSONString(openToUser);  
    logger.info("[CREATEUSER]", "createUser param:jsonOpenToUser:{}", new Object[]{jsonOpenToUser});
    // 调用接口创建用户 
    JSONObject jsonObject = HttpUtil.sendPost(url, jsonOpenToUser);
    logger.info("[CREATEUSER]", "createUser response:{}", new Object[]{jsonObject.toJSONString()});
    // 调用接口创建用户  
    if (null != jsonObject) {  
    	int errcode = jsonObject.getIntValue("errcode");
        result = errcode;
    }  
	return result;
}
public static void main(String[] args) {
	AccessToken accessToken = JwAccessTokenAPI.getAccessToken(JwParamesAPI.corpId,JwParamesAPI.secret);
	//测试userConverOpen 测试成功openid=oTFwXt76Y9nRM7itV1WmYS0OJ6WE token=DnwUIQ-4WrhvqoPqMEb9-KCuLmlZAOankR4b2SuVA_DkhT49J1uPI0pNivZ2ohVp
	UserToOpen user=new UserToOpen();
	user.setAgentid(1);
	user.setUserid("malimei");
	JwCardMessageAPI.userConverOpen(user, accessToken.getAccesstoken());

	//openid转换成userid接口,暂时没有测通过去
	/*OpenToUser open=new OpenToUser();
	open.setOpenid("oTFwXt76Y9nRM7itV1WmYS0OJ6WE");
	String accessToken="DnwUIQ-4WrhvqoPqMEb9-KCuLmlZAOankR4b2SuVA_DkhT49J1uPI0pNivZ2ohVp";
	JwCardMessageAPI.openConverUser(open, accessToken);*/
	
	
}

}
