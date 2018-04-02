package com.jeecg.qywx.api.menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSONObject;
import com.jeecg.qywx.api.base.JwAccessTokenAPI;
import com.jeecg.qywx.api.base.JwParamesAPI;
import com.jeecg.qywx.api.core.common.AccessToken;
import com.jeecg.qywx.api.core.util.HttpUtil;
import com.jeecg.qywx.api.menu.vo.Button;
import com.jeecg.qywx.api.menu.vo.CommonButton;
import com.jeecg.qywx.api.menu.vo.ComplexButton;
import com.jeecg.qywx.api.menu.vo.Menu;
import com.jeecg.qywx.api.menu.vo.ViewButton;

/**
 * 企业微信--menu
 * 
 * @author zhoujf
 * 
 */
public class JwMenuAPI {
	private static final Logger logger = LoggerFactory.getLogger(JwMenuAPI.class);

	//创建应用菜单（POST）   
	private static String menu_create_url = "https://qyapi.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN&agentid=AGENTID";  
	//删除菜单（GET）   
	private static String menu_delete_url = "https://qyapi.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN&agentid=AGENTID";  
	//获取菜单列表（GET）   
	private static String menu_get_url = "https://qyapi.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN&agentid=AGENTID";  
	
	
	/** 
	 * 创建应用菜单
	 * @param menu 菜单实例 
	 * 		button	是	一级菜单数组，个数应为1~3个
	 * 		sub_button	否	二级菜单数组，个数应为1~5个
	 * 		type	是	菜单的响应动作类型
	 * 		name	是	菜单标题，不超过16个字节，子菜单不超过40个字节
	 * 		key	click等点击类型必须	菜单KEY值，用于消息接口推送，不超过128字节
	 * 		url	view类型必须	网页链接，用户点击菜单可打开链接，不超过256字节
	 * @param accessToken 有效的access_token 
	 * @param agentid  企业应用的id，整型，可在应用的设置页面查看
	 * @return 0表示成功，其他值表示失败 
	 */  
	public static int createMenu(Menu menu, String accessToken,String agentid) {  
		logger.info("[CREATEMENU]", "createMenu param:accessToken:{},agentid:{},menu:{}", new Object[]{accessToken,agentid,menu});
	    int result = 0;  
	    // 拼装创建菜单的url  
	    String url = menu_create_url.replace("ACCESS_TOKEN", accessToken).replace("AGENTID", agentid);  
	    // 将菜单对象转换成json字符串  
	    String jsonMenu = JSONObject.toJSONString(menu);  
	    logger.info("[CREATEMENU]", "createMenu param:jsonMenu:{}", new Object[]{jsonMenu});
	    // 调用接口创建菜单  
	    JSONObject jsonObject = HttpUtil.sendPost(url, jsonMenu);  
	    logger.info("[CREATEMENU]", "createMenu response:{}", new Object[]{jsonObject.toJSONString()});
	    if (null != jsonObject) {  
	    	int errcode = jsonObject.getIntValue("errcode");
	        result = errcode;
	    }  
	    return result;  
	}  
	
	
	
	
	/**
	 * 删除菜单
	 * @param accessToken 有效的access_token
	 * @param agentid 企业应用的id，整型，可在应用的设置页面查看
	 * @return 0表示成功，其他值表示失败 
	 */
	public static int deleteMenu(String accessToken,String agentid) {  
		logger.info("[DELETEMENU]", "deleteMenu param:accessToken:{},agentid:{}", new Object[]{accessToken,agentid});
	    int result = 0;  
	    // 拼装删除菜单的url  
	    String url = menu_delete_url.replace("ACCESS_TOKEN", accessToken).replace("AGENTID", agentid);  
	    // 调用接口删除菜单  
	    JSONObject jsonObject = HttpUtil.sendGet(url);  
	    logger.info("[DELETEMENU]", "deleteMenu response:{}", new Object[]{jsonObject.toJSONString()});
	    if (null != jsonObject) {  
	    	int errcode = jsonObject.getIntValue("errcode");
	        result = errcode;
	    }  
	    return result;  
	}  
	
	
	
	/**
	 * 获取菜单列表
	 * @param accessToken 有效的access_token
	 * @param agentid 企业应用的id，整型，可在应用的设置页面查看
	 * @return 
	 */
	public static JSONObject getMenu(String accessToken,String agentid) {  
		logger.info("[GETMENU]", "getMenu param:accessToken:{},agentid:{}", new Object[]{accessToken,agentid});
	    // 拼装获取菜单列表的url  
	    String url = menu_get_url.replace("ACCESS_TOKEN", accessToken).replace("AGENTID", agentid);  
	    // 调用接口获取菜单列表
	    JSONObject jsonObject = HttpUtil.sendGet(url);  
	    logger.info("[GETMENU]", "getMenu response:{}", new Object[]{jsonObject.toJSONString()});
	    return jsonObject;  
	}  
	
	
	
	
	
	
	public static void main(String[] args){
		try {
			AccessToken accessToken = JwAccessTokenAPI.getAccessToken(JwParamesAPI.corpId,JwParamesAPI.secret);
			 Menu menu = new Menu();  
			 CommonButton btn11 = new CommonButton();  
		     btn11.setName("菜单1-1");  
		     btn11.setType("click");  
		     btn11.setKey("11");
		     CommonButton btn12 = new CommonButton();  
		     btn12.setName("菜单1-2");  
		     btn12.setType("click");  
		     btn12.setKey("12");
		     CommonButton btn13 = new CommonButton();  
		     btn13.setName("菜单1-3");  
		     btn13.setType("click");  
		     btn13.setKey("13");
		     CommonButton btn14 = new CommonButton();  
		     btn14.setName("菜单1-4");  
		     btn14.setType("click");  
		     btn14.setKey("14");
		     CommonButton btn15 = new CommonButton();  
		     btn15.setName("菜单1-5");  
		     btn15.setType("click");  
		     btn15.setKey("15");
		     
		     CommonButton btn21 = new CommonButton();  
		     btn21.setName("菜单2-1");  
		     btn21.setType("click");  
		     btn21.setKey("21");
		     CommonButton btn22 = new CommonButton();  
		     btn22.setName("菜单2-2");  
		     btn22.setType("click");  
		     btn22.setKey("22");
		     CommonButton btn23 = new CommonButton();  
		     btn23.setName("菜单2-3");  
		     btn23.setType("click");  
		     btn23.setKey("23");
		     CommonButton btn24 = new CommonButton();  
		     btn24.setName("菜单2-4");  
		     btn24.setType("click");  
		     btn24.setKey("24");
		     CommonButton btn25 = new CommonButton();  
		     btn25.setName("菜单2-5");  
		     btn25.setType("click");  
		     btn25.setKey("25");
		     
		     
		      ViewButton btn31 = new ViewButton();  
		      btn31.setName("菜单Url3-1");  
		      btn31.setType("view");  
		      btn31.setUrl("http://www.baidu.com");
		      CommonButton btn32 = new CommonButton();  
		      btn32.setName("菜单3-2");  
		      btn32.setType("click");  
		      btn32.setKey("32"); 
		      CommonButton btn33 = new CommonButton();  
		      btn33.setName("菜单3-3");  
		      btn33.setType("click");  
		      btn33.setKey("33"); 
		      CommonButton btn34 = new CommonButton();  
		      btn34.setName("菜单3-4");  
		      btn34.setType("click");  
		      btn34.setKey("34"); 
		      CommonButton btn35 = new CommonButton();  
		      btn35.setName("菜单3-5");  
		      btn35.setType("click");  
		      btn35.setKey("35"); 
		      
		      ComplexButton mainBtn1 = new ComplexButton();  
		      mainBtn1.setName("菜单1");  
		      mainBtn1.setSub_button(new Button[] { btn11, btn12, btn13, btn14, btn15});  
		  
		      ComplexButton mainBtn2 = new ComplexButton();  
		      mainBtn2.setName("菜单2");  
		      mainBtn2.setSub_button(new Button[] { btn21, btn22, btn23, btn24, btn25 });  
		  
		      ComplexButton mainBtn3 = new ComplexButton();  
		      mainBtn3.setName("菜单3");  
		      mainBtn3.setSub_button(new Button[] { btn31, btn32, btn33, btn34, btn35});  
		      
		      menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });
		      //创建菜单
			  JwMenuAPI.createMenu(menu, accessToken.getAccesstoken(), JwParamesAPI.agentid);
			  
			  //删除菜单
//			  JwMenuAPI.deleteMenu(accessToken.getAccesstoken(), JwParamesAPI.agentid);
		      
		      //获取菜单列表
//		      JwMenuAPI.getMenu(accessToken.getAccesstoken(), JwParamesAPI.agentid);
			  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
