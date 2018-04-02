package com.jeecg.qywx.api.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jeecg.qywx.api.base.JwAccessTokenAPI;
import com.jeecg.qywx.api.base.JwParamesAPI;
import com.jeecg.qywx.api.core.common.AccessToken;
import com.jeecg.qywx.api.core.util.HttpUtil;
import com.jeecg.qywx.api.user.vo.User;

/**
 * 企业微信--yqj
 * 
 * @author yqj
 * 
 */
public class JwUserAPI {
	private static final Logger logger = LoggerFactory.getLogger(JwUserAPI.class);

	//1 创建成员 
	private static String user_create_url = "https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token=ACCESS_TOKEN";  
	//2 更新成员  
	private static String user_update_url = "https://qyapi.weixin.qq.com/cgi-bin/user/update?access_token=ACCESS_TOKEN";  
	//3 删除成员
	private static String user_delete_url = "https://qyapi.weixin.qq.com/cgi-bin/user/delete?access_token=ACCESS_TOKEN&userid=USERID";  
	//4 批量删除成员
	private static String user_delete_all_url = "https://qyapi.weixin.qq.com/cgi-bin/user/batchdelete?access_token=ACCESS_TOKEN";  
	//5 获取成员
	private static String user_get_url_byuserid = "https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&userid=USERID";  
	//6 获取部门下的成员
	private static String user_get_dep_all_url = "https://qyapi.weixin.qq.com/cgi-bin/user/simplelist?access_token=ACCESS_TOKEN&department_id=DEPARTMENT_ID&fetch_child=FETCH_CHILD&status=STATUS";  
	//7 获取部门成员(详情)
	private static String user_get_url = "https://qyapi.weixin.qq.com/cgi-bin/user/list?access_token=ACCESS_TOKEN&department_id=DEPARTMENT_ID&fetch_child=FETCH_CHILD&status=STATUS";  
	
	
	//1创建成员
	/**
	 * 创建成员
	 * @param user 用户实例
	 * 参数			必须	说明 
	 * access_token	是	调用接口凭证 
	 * userid 		是	成员UserID。对应管理端的帐号，企业内必须唯一。长度为1~64个字节
	 * name			是	成员名称。长度为1~64个字节 
	 * department	否	成员所属部门id列表 
	 * position		否	职位信息。长度为0~64个字节
	 * mobile		否	手机号码。企业内必须唯一，mobile/weixinid/email三者不能同时为空
	 * gender		否	性别。1表示男性，2表示女性 
	 * email			否	邮箱。长度为0~64个字节。企业内必须唯一 
	 * weixinid 		否	微信号。企业内必须唯一。（注意：是微信号，不是微信的名字）
	 * avatar_mediaid否	成员头像的mediaid，通过多媒体接口上传图片获得的mediaid
	 * extattr 		否	扩展属性。扩展属性需要在WEB管理端创建后才生效，否则忽略未知属性的赋值 		 
	 * @param accessToken  有效的access_token 
	 * @return 0表示成功，其他值表示失败 
	 */
	public static int createUser(User user, String accessToken){
		int result = 0;  
		logger.info("[CREATEUSER]", "createUser param:user:{},accessToken:{}", new Object[]{user,accessToken});
		// 拼装获取成员列表的url  
	    String url = user_create_url.replace("ACCESS_TOKEN", accessToken);  
	    // 将成员对象转换成json字符串  
	    String jsonUser = JSONObject.toJSONString(user);  
	    logger.info("[CREATEUSER]", "createUser param:jsonUser:{}", new Object[]{jsonUser});
	    // 调用接口创建用户 
	    JSONObject jsonObject = HttpUtil.sendPost(url, jsonUser);
	    logger.info("[CREATEUSER]", "createUser response:{}", new Object[]{jsonObject.toJSONString()});
	    // 调用接口创建用户  
	    if (null != jsonObject) {  
	    	int errcode = jsonObject.getIntValue("errcode");
	        result = errcode;
	    }  
		return result;
	}
	
	//2更新成员 
	/**
	 * 
	 * @param user 用户实例 
	 * @param accessToken 有效的access_token 
	 * @return   0表示成功，其他值表示失败 
	 */
	public static int updateUser(User user, String accessToken){
		int result=0;
		logger.info("[UPDATEUSER]", "updateUser param:user:{},accessToken:{}", new Object[]{user,accessToken});
		// 拼装更新成员列表的url  
	    String url = user_update_url.replace("ACCESS_TOKEN", accessToken);  
	    // 将成员对象转换成json字符串  
	    String jsonUser = JSONObject.toJSONString(user);  
	    logger.info("[UPDATEUSER]", "updateUser param:jsonUser:{}", new Object[]{jsonUser});
	    // 调用接口更新用户 
	    JSONObject jsonObject = HttpUtil.sendPost(url, jsonUser);  
	    logger.info("[UPDATEUSER]", "updateUser response:{}", new Object[]{jsonObject.toJSONString()});
	    // 调用接口更新成员  
	    if (null != jsonObject) {  
	    	int errcode = jsonObject.getIntValue("errcode");
	        result = errcode;
	    }  
		return result;
	}
	
	//3删除成员
	/**
	 * 
	 * @param userid 用户成员ID
	 * @param accessToken 有效的access_token 
	 * @return  0表示成功，其他值表示失败 
	 */
	public static int deleteUser(String userid, String accessToken){
		int result=0;
		logger.info("[DELETEUSER]", "deleteUser param:userid:{},accessToken:{}", new Object[]{userid,accessToken});
		// 拼装删除成员列表的url  
	    String url = user_delete_url.replace("ACCESS_TOKEN", accessToken).replace("USERID", userid);  
	    // 将成员对象转换成json字符串  
	    logger.info("[DELETEUSER]", "deleteUser param:userid:{}", new Object[]{userid});
	    // 调用接口删除用户 
	    JSONObject jsonObject = HttpUtil.sendPost(url);  
	    logger.info("[DELETEUSER]", "deleteUser response:{}", new Object[]{jsonObject.toJSONString()});
	    // 调用接口删除成员  
	    if (null != jsonObject) {  
	    	int errcode = jsonObject.getIntValue("errcode");
	        result = errcode;
	    }  
		return result;
	}
	
	//4批量删除成员
	/**
	 * 注意转换
	 * @param useridlist 所有用户成员ID
	 * @param accessToken 有效的access_token 
	 * @return 0表示成功，其他值表示失败 
	 */
	public static int batchDeleteUsers(String[] useridlist, String accessToken){
		int result=0;
		logger.info("[BATCHDELETEUSERS]", "batchDeleteUsers param:useridlist:{},accessToken:{}", new Object[]{useridlist,accessToken});
		// 拼装批量删除成员列表的url  
	    String url = user_delete_all_url.replace("ACCESS_TOKEN", accessToken);  
	    // 将成员对象转换成json字符串  
	    Map<String, String[]> paramtermap=new HashMap<String, String[]>();
	    paramtermap.put("useridlist", useridlist);
	    String jsonUserids = JSONObject.toJSONString(paramtermap); 
	    logger.info("[BATCHDELETEUSERS]", "batchDeleteUsers param:useridlist:{}", new Object[]{paramtermap});
	    // 调用接口批量删除
	    JSONObject jsonObject = HttpUtil.sendPost(url,jsonUserids);  
	    logger.info("[BATCHDELETEUSERS]", "batchDeleteUsers response:{}", new Object[]{jsonObject.toJSONString()});
	    // 调用接口批量删除
	    if (null != jsonObject) {  
	    	int errcode = jsonObject.getIntValue("errcode");
	        result = errcode;
	    }  
		return result;
	}
	
	//5获取成员
	public static User getUserByUserid(String userid, String accessToken){
		logger.info("[GETUSERBYUSERID]", "getUserByUserid param:userid:{},accessToken:{}", new Object[]{userid,accessToken});
		// 拼装获取成员的url  
	    String url = user_get_url_byuserid.replace("ACCESS_TOKEN", accessToken).replace("USERID", userid);  
	    // 调用接口获取成员
	    JSONObject jsonObject = HttpUtil.sendPost(url); 
	    logger.info("[GETUSERBYUSERID]", "getUserByUserid response:{}", new Object[]{jsonObject.toJSONString()});
	    //把对象转换成user
	    if (null != jsonObject) {  
	    	int errcode = jsonObject.getIntValue("errcode");
	        if(errcode==0){
	        	User user =	JSONObject.toJavaObject(jsonObject, User.class);
	        	return user;
	        }
	    }  
		return null;
	}
	
	//6获取部门成员
	public static List<User> getUsersByDepartid(String department_id,String fetch_child,String status , String accessToken){
		logger.info("[GETUSERSBYDEPARTID]", "getUsersByDepartid param:department_id:{},fetch_child:{},status:{},accessToken:{}", new Object[]{department_id,fetch_child,status,accessToken});
		// 拼装获取部门成员的列表的url  
	    String url = user_get_dep_all_url.replace("ACCESS_TOKEN", accessToken).replace("DEPARTMENT_ID", department_id);
	    if(fetch_child!=null){
	    	 url = url.replace("FETCH_CHILD", fetch_child);
	    }
	    if(status!=null){
	    	url = url.replace("STATUS", status);  
	    }
	    // 调用接口获取部门成员
	    JSONObject jsonObject = HttpUtil.sendPost(url);  
	    logger.info("[GETUSERSBYDEPARTID]", "getUsersByDepartid response:{}", new Object[]{jsonObject.toJSONString()});
	    if (null != jsonObject) {  
	    	int errcode = jsonObject.getIntValue("errcode");
	        if(errcode==0){
//	        	List<User> users = JSONArray.toJavaObject(jsonObject.getJSONArray("userlist"), List.class);
//	        	List<Object> users =jsonObject.getJSONArray("userlist");
	        	List<User> users  = JSON.parseArray(jsonObject.getString("userlist"),User.class);
	        	return users;
	        }
	    }  
		return null;
	}
	
	//7 获取部门成员(详情)
	public static List<User> getDetailUsersByDepartid(String department_id,String fetch_child,String status , String accessToken){
		if(null==fetch_child){
//			fetch_child="";
			fetch_child="1";
		}
		if(null==status){
//			status="";
			status="0";
		}
		logger.info("[GETDETAILUSERSBYDEPARTID]", "getDetailUsersByDepartid param:department_id:{},fetch_child:{},status:{},accessToken:{}", new Object[]{department_id,fetch_child,status,accessToken});
		// 拼装获取部门成员(详情)的列表的url  
	    String url = user_get_url.replace("ACCESS_TOKEN", accessToken).replace("DEPARTMENT_ID", department_id).replace("FETCH_CHILD", fetch_child).replace("STATUS", status);  
	    // 调用接口获取部门成员(详情)
	    JSONObject jsonObject = HttpUtil.sendPost(url);  
//	    System.out.println("jsonObject="+jsonObject);
	    logger.info("[GETDETAILUSERSBYDEPARTID]", "getDetailUsersByDepartid response:{}", new Object[]{jsonObject.toJSONString()});
	    if (null != jsonObject) {  
	    	int errcode = jsonObject.getIntValue("errcode");
	        if(errcode==0){
//	        	List<User> users = JSONArray.toJavaObject(jsonObject.getJSONArray("userlist"), List.class);
//	        	return users;
	        	List<User> users  = JSON.parseArray(jsonObject.getString("userlist"),User.class);
	        	return users;
	        }
	    }  
		return null;
	}
	
	
	public static void main(String[] args) {
		AccessToken accessToken = JwAccessTokenAPI.getAccessToken(JwParamesAPI.corpId,JwParamesAPI.secret);
		/*JSONObject js = getUsersByDepartid("5", null,null,accessToken.getAccesstoken());
		System.out.println(js.toJSONString());*/
		//1:测试创建成员
		/*User user=new User();
		user.setUserid("yangmoumou1");
		user.setName("杨某某1");
		user.setPosition("JAVA测试人员");
		user.setMobile("13880981678");//电话号码必须要
		user.setDepartment(new Integer[]{5});//设置部门
		int result = createUser(user, accessToken.getAccesstoken());
		System.out.println(result==0?"成功":"失败"+"----"+result);
		*
		*/
		/*User user=new User();
		user.setUserid("yangmoumou3");
		user.setName("杨某某2");
		user.setPosition("JAVA测试人员");
		user.setMobile("13880981672");//电话号码必须要
		user.setDepartment(new Integer[]{5});//设置部门
		int result = createUser(user, accessToken.getAccesstoken());
		System.out.println(result==0?"成功":"失败"+"----"+result);*/
		
		
	
		//2:updateUser
		/*User user=new User();
		user.setUserid("yangmoumou1");
		user.setName("杨某某修改后");
		user.setPosition("JAVA测试人员333");
		user.setMobile("13880981678");//电话号码必须要
		user.setDepartment(new Integer[]{5});//设置部门
		int result = updateUser(user, accessToken.getAccesstoken());
		System.out.println(result==0?"修改成功":"失败"+"----"+result);*/
		//3:deleteUser
		/*int result=deleteUser("yangmoumou1", accessToken.getAccesstoken());//测试删除
		System.out.println(result==0?"删除成功":"失败"+"----"+result);*/
		/*
		 * 4:batchDeleteUsers
		 int result = batchDeleteUsers(new String[]{"yangmoumou3"}, accessToken.getAccesstoken());
		System.out.println(result==0?"删除成功":"失败"+"----"+result);*/
		/**
		 * 5:getUserByUserid
		 */
		User user = getUserByUserid("yangqj", accessToken.getAccesstoken());
		System.out.println(JSONObject.toJSON(user));
		
		/**
		 *6 getUsersByDepartid
		 */
		/*List<User> users=getUsersByDepartid("5", null, null, accessToken.getAccesstoken());
		for (User user : users) {
			System.out.println("xx");
		}
		System.out.println(JSONObject.toJSON(users));*/
		/**
		 * 7 获取部门成员(详情)
		 */
		/*List<User> users=getDetailUsersByDepartid("5", null, null, accessToken.getAccesstoken());
		System.out.println(JSONObject.toJSON(users));*/
	}
}
