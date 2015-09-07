package org.jeewx.api.core.test;

import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.core.req.WeiXinReqService;
import org.jeewx.api.core.req.model.AccessToken;
import org.jeewx.api.core.req.model.DownloadMedia;
import org.jeewx.api.core.req.model.ServiceIP;
import org.jeewx.api.core.req.model.UploadMedia;
import org.jeewx.api.core.req.model.kfaccount.KfaccountList;

public class ReqTest {

	/**
	 * 测试获取token
	 * @return
	 * @throws WexinReqException
	 */
	public String getToken() throws WexinReqException{
		String appId = "wx00737224cb9dbc7d";
		String appSecret = "b9479ebdb58d1c6b6efd4171ebe718b5";
		AccessToken token = new AccessToken();
		token.setAppid(appId);
		token.setSecret(appSecret);
		String strtoken = WeiXinReqService.getInstance().doWeinxinReq(token);
		System.out.println(strtoken);
		return strtoken;
	}
	
	
	/**
	 * 测试获取服务器ip
	 * @return
	 * @throws WexinReqException
	 */
	public String getServieIp(String token) throws WexinReqException{
		ServiceIP ip = new ServiceIP();
		ip.setAccess_token(token); 
		String strip = WeiXinReqService.getInstance().doWeinxinReq(ip);
		System.out.println(strip);
		return strip;
	}
	
	/**
	 * 测试上传文件
	 * @return
	 * @throws WexinReqException
	 */
	public String getUploadMedia(String token) throws WexinReqException{
		UploadMedia media = new UploadMedia();
		media.setAccess_token(token);
		media.setType("image");
		media.setFilePathName("C:/Users/sfli.sir/Desktop/temp/0020380102.jpg");
		String tokenFFF = WeiXinReqService.getInstance().doWeinxinReq(media);
		System.out.println(tokenFFF);
		return tokenFFF;
	}
	
	
	/**
	 * 测试上传文件
	 * @return
	 * @throws WexinReqException
	 */
	public String getDownMedia(String token) throws WexinReqException{
		DownloadMedia media = new DownloadMedia();
		media.setAccess_token(token);
		media.setMedia_id("fV1ivFheJ-YsMIV8luw04Anu_kw1tfUmYY6ALV7gZi17Uo1n3RSlCiTgIlQRibLF");
		media.setFilePath("G:/temp");
		String tokenFFF = WeiXinReqService.getInstance().doWeinxinReq(media);
		return tokenFFF;
	}
	
	
	/**
	 * 测试获取token
	 * @return
	 * @throws WexinReqException
	 */
	public String getKfaccountList(String access_token) throws WexinReqException{
		KfaccountList kf = new KfaccountList();
		kf.setAccess_token(access_token);
		String strtoken = WeiXinReqService.getInstance().doWeinxinReq(kf);
		System.out.println(strtoken);
		return strtoken;
	}
	
	/**
	 * 
	 * 
	 * ReqTest test = new ReqTest();
		String ddd;
		try {
			//test.getToken();
			// GroupGet g = new GroupGet();
			/*
			 * GroupUpdate g = new GroupUpdate(); Group gg = new Group();
			 * gg.setId("111"); gg.setName("test修改"); g.setGroup(gg);
			 QrcodeCreate g = new QrcodeCreate();
			g.setAction_name("二维测试信息细信息");
			QrcodeActionInfo a = new QrcodeActionInfo();
			QrcodeScene s = new QrcodeScene();
			s.setScene_str("8298389");
			a.setScene(s);
			g.setAction_info(a);
			g.setAction_name("QR_LIMIT_SCENE"); 
			//UserInfoListGet g = new UserInfoListGet();
			//UploadMedia g = new UploadMedia();
			DownloadMedia g = new DownloadMedia();
			g.setFilePath("H:/temp");
			g.setMedia_id("nH-tzebPcZY41Hlao3mjPHpUHHJSIbfP8hbGJy73LUj5BfvVDV9b84uIpZ8Yjlzw");
			g.setAccess_token("bbkXUUyC6F85R_vh7FOokDZn54P4jY6RVg8rvtzd0D10nIgd7Ksg7bBc8mncX6SZ1mMEI7v1q1OBtWoWG8--iR6ohe3kXbx5jUTHGAjGPAU");
			ddd = WeiXinReqUtil.getInstance().doWeinxinReq(g);
			// test.getKfaccountList("NG0cpHAPJix5bULT26Hvk9pX5ZOqleIObl9HNKUfPA2PIxJzf-X4U-YOGP4vo-rdwvCy3GCn7v9GNTXNWVM27qEQz-Xs3fgAnj0kdhL07gI");
			// test.getServieIp("QsLy729ukRchgw4O3bQvO2UwD0vn2zQ1I0TjZa2kx-dGX9TEFuVCGd7K9AsBhdfynUAaEWVILeDNS7OQXTKZdX1YxbnNqyVBfDmW9I63WWc");
			// test.getUploadMedia("QsLy729ukRchgw4O3bQvO2UwD0vn2zQ1I0TjZa2kx-dGX9TEFuVCGd7K9AsBhdfynUAaEWVILeDNS7OQXTKZdX1YxbnNqyVBfDmW9I63WWc");
			// ddd =
			// test.getDownMedia("QsLy729ukRchgw4O3bQvO2UwD0vn2zQ1I0TjZa2kx-dGX9TEFuVCGd7K9AsBhdfynUAaEWVILeDNS7OQXTKZdX1YxbnNqyVBfDmW9I63WWc");
			System.out.println(ddd);
		} catch (WexinReqException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// {"groups":[{"id":0,"name":"未分组","count":77},{"id":1,"name":"黑名单","count":0},
		// {"id":2,"name":"星标组","count":0},{"id":100,"name":"测试2","count":0},{"id":101,"name":"最新测试分组","count":0},
		// {"id":102,"name":"北京用户","count":0},{"id":103,"name":"一级","count":0},{"id":104,"name":"二级","count":0},
		// {"id":105,"name":"三级","count":0},{"id":106,"name":"星标组","count":0},{"id":107,"name":"星标组","count":0},
		// {"id":108,"name":"星标组","count":0},{"id":109,"name":"111","count":0},{"id":110,"name":"群发分组","count":0},
		// {"id":111,"name":"12222","count":0}]}

		/*
		{"action_name": "QR_LIMIT_SCENE","action_info":{"scene":{"scene_id":"8298389"}}}
		{"action_name": "QR_LIMIT_SCENE","action_info": {"scene": {"scene_id": 123}}}
		{"action_name": "QR_LIMIT_STR_SCENE", "action_info": {"scene": {"scene_str": "123"}}}
		/*
		 * String appId = "wx00737224cb9dbc7d"; String appSecret =
		 * "b9479ebdb58d1c6b6efd4171ebe718b5"; AccessToken token = new
		 * AccessToken(); token.setAppid(appId); token.setSecret(appSecret);
		// String tokendd = WeiXinReqUtil.getInstance().doWeinxinReq(token);
		// {"access_token":"NG0cpHAPJix5bULT26Hvk4P-Jx3UpvCR76tl4VjQjpbA4tGVV4NndiY0d93CYP1A1v603jhuv8MJ8wNEsrtgT-VqjVPQdoyT7UJ5A8VJ5uI","expires_in":7200}

		/*
		 * UploadMedia media = new UploadMedia(); media.setAccess_token(
		 * "QsLy729ukRchgw4O3bQvO2UwD0vn2zQ1I0TjZa2kx-dGX9TEFuVCGd7K9AsBhdfynUAaEWVILeDNS7OQXTKZdX1YxbnNqyVBfDmW9I63WWc"
		 * ); media.setType("image"); media.setFilePathName(
		 * "C:/Users/sfli.sir/Desktop/temp/2457331_160355071353_2.jpg"); String
		 * tokenFFF = WeiXinReqUtil.getInstance().doWeinxinReq(media);
		// {"type":"image","media_id":"V5c551Gj3EZyOhhWsm4Y9vxkOeCqafkNuAdeqC1Wh_EE-UaYNCqKBLUkY2tZcRrt","created_at":1422023676}

		// System.out.println(tokenFFF);

		// String tokenId = getAuthToke(appId,appSecret);
		// System.out.println(tokenId); ?access_token=ACCESS_TOKEN&type=TYPE
		// {"access_token":"y252TCQhkBrLCbOMtQv6siDGMY3BIQCniQCvmjfF9aF26ZypiLwLYkahrdLFxIWOzyAnz8LG8NIz1xp-NjsnSxXJJhQutMbo5gdPO1yAn54","expires_in":7200}
		// "{\"access_token\":\"sROWom9XJtu0bgvpPJ2teIh1N-WyV3qzbiz20NgksMGbumDHTiBdnsfdhWOoRebKlnsqWXWuaXUueetHnDEaUSKGppzZFXjORvmCknN3kYA\",\"expires_in\":7200}";
		// String userInfo =
		// getAppUser("y252TCQhkBrLCbOMtQv6siDGMY3BIQCniQCvmjfF9aF26ZypiLwLYkahrdLFxIWOzyAnz8LG8NIz1xp-NjsnSxXJJhQutMbo5gdPO1yAn54","");
		// System.out.println(userInfo);

		// {"type":"image","media_id":"ONgomnHZXnbOhDGNmndYkhDeTO-FRqpcWFjhARDsAxkOuBd-bMQtY6PQRJxAVf6v","created_at":1421920436}
		// {"type":"image","media_id":"4zwjEiPBrg_-diDfu8xOnJ-Id-zOinvcyOLZF7jc7-A4FitVNiraTPzkOyA7nkf3","created_at":1421920468}
		/*
		 * InputStream fileIn; try { fileIn = new FileInputStream(new
		 * File("C:/Users/liguo/Desktop/0818/111.jpg")); String userInfo =
		 * uploadMedia(
		 * "y252TCQhkBrLCbOMtQv6siDGMY3BIQCniQCvmjfF9aF26ZypiLwLYkahrdLFxIWOzyAnz8LG8NIz1xp-NjsnSxXJJhQutMbo5gdPO1yAn54"
		 * , "image",fileIn,"test.jpg","image/jpg");
		 * System.out.println(userInfo); } catch (FileNotFoundException e) {
		 * e.printStackTrace(); }
		/*
		 * AccessToken token = new AccessToken(); token.setAccess_token("dddd");
		 * token.setAppid("pppp"); token.setSecret("ddddccccccc");
		 * token.setGrant_type("aflsjdfls"); Map m = getWeixinReqParam(token);
		 * StringBuffer params = new StringBuffer(); for (Iterator iter =
		 * m.entrySet().iterator(); iter .hasNext();) { Entry element = (Entry)
		 * iter.next(); params.append(element.getKey().toString());
		 * params.append("="); try {
		 * params.append(URLEncoder.encode(element.getValue().toString(),
		 * HttpRequestProxy.requestEncoding)); } catch
		 * (UnsupportedEncodingException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } params.append("&"); }
		 * System.out.println(params.toString());
	 * 
	 */
}
