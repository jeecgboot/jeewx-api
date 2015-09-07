package org.jeewx.api.coupon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.jeewx.api.core.common.AccessToken;
import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.coupon.manage.JwCardManageAPI;
import org.jeewx.api.coupon.manage.model.BatchGetCardRtnInfo;
import org.jeewx.api.coupon.manage.model.CardUpdate;
import org.jeewx.api.coupon.manage.model.CommCardRtnInfo;
import org.jeewx.api.coupon.manage.model.DelRtnInfo;
import org.jeewx.api.coupon.manage.model.GetCardDetailRtnInfo;
import org.jeewx.api.coupon.manage.model.GetCardRtnInfo;
import org.jeewx.api.coupon.qrcode.JwQrcodeAPI;
import org.jeewx.api.coupon.qrcode.model.GetticketRtn;
/**
 * 测试卡券管理
 * @author mcl
 * @version v1.0
 */
public class JwCardManageAPITest {

	private static String appid = "wxd2b52b8f4bd5af7f";
	private static String appscret = "1b982dba2c3f853c3396babcdfa6cb1e";
	
	/**
	 * 测试卡券管理
	 */
	public static void main1(String[] args) {
		AccessToken atoken = new AccessToken(appid, appscret);
		String newAccessToken = atoken.getNewAccessToken();
		//获取所有卡券ID(此方法适合数量不超过50个的)
		List<String> ls = getCardList(newAccessToken);
		for(String p:ls){
			//根据卡券ID，获取卡券详细
			GetCardDetailRtnInfo rtnInfo = JwCardManageAPI.doGetCardDetail(newAccessToken, p);
			if(rtnInfo.getCard().getCard_type().equals("CASH")){
				System.out.println(rtnInfo.getCard().getCash().getReduce_cost()/100);
			}
		}
		
		
		//1.0批量获取卡券
//		doBatchGetCardTest(newAccessToken);
//		//2.0删除卡券
//		doDelCardTest(newAccessToken);
//		//3.0获取卡券详细信息
//		doGetCardDetailTest(newAccessToken);
//		//4.0获取卡券信息
//		doGetCardTest(newAccessToken);
//		//5.0更新卡券库存
//		doModifystockCardTest(newAccessToken);
//		//6.0设置卡券失效状态
//		doUnavailableCodeTest(newAccessToken);
//		//7.0更新卡券信息
//		doUpdateCardTest(newAccessToken);
//		//8.0更新卡券code
//		doUpdateCodeTest(newAccessToken);
	}

	
	/**
	 * 测试卡券管理
	 */
	public static void main(String[] args) {
		AccessToken atoken = new AccessToken(appid, appscret);
		String newAccessToken = atoken.getNewAccessToken();
		try {
			GetticketRtn s = JwQrcodeAPI.doGetticket(newAccessToken);
			System.out.println(s.getTicket());
		} catch (WexinReqException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> getCardList(String newAccessToken){
		BatchGetCardRtnInfo rtnInfo = null;
		rtnInfo = JwCardManageAPI.doBatchGetCard(newAccessToken, 0, 50);
		if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
			//System.out.println("JwCardManageAPI.doBatchGetCard["+i+"]" + ":成功");
			System.out.println("");
			System.out.println("接口调用成功： card_id_list: "+rtnInfo.getCard_id_list());
			return rtnInfo.getCard_id_list();
		}else{
			System.out.println("接口调用失败："+"["+rtnInfo.getErrmsg()+"]");
			return null;
		}
	}
	
	public static boolean doBatchGetCardTest(String newAccessToken) {
		BatchGetCardRtnInfo rtnInfo = null;
		Map<String, Integer> onecase = null;
		List<Map<String, Integer>> testCases = doBatchGetCardParam();
		int len = testCases.size();
		int pass = 0 ; 
		int fail = 0 ;
		try {
			System.out.println("=========JwCardManageAPI.doBatchGetCard[批量查询卡列表]开始测试==========");
			for (int i = 0; i < len; i++) {
				onecase = testCases.get(i);
				rtnInfo = JwCardManageAPI.doBatchGetCard(newAccessToken, onecase.get("offset"), onecase.get("count"));
				if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
					pass++;
					//System.out.println("JwCardManageAPI.doBatchGetCard["+i+"]" + ":成功");
					System.out.println("card_id_list: "+rtnInfo.getCard_id_list());
				}else{
					fail++;
					System.out.println("JwCardManageAPI.doBatchGetCard["+i+"]" + ":失败"+"["+rtnInfo.getErrmsg()+"]");
				}
				Thread.sleep(1000);
			}
			System.out.println("==============JwCardManageAPI.doBatchGetCard测试结果=================");
			System.out.println("====================共计测试用例:[" +len+ "个]====================");
			System.out.println("====================成功测试用例:[" +pass+ "个]====================");
			System.out.println("====================失败测试用例:[" +fail+ "个]====================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	private static List<Map<String, Integer>> doBatchGetCardParam(){
		Map<String, Integer> onecase = null;
		List<Map<String, Integer>> testCases = new ArrayList<Map<String, Integer>>();
		for(int i = 0 ; i < 5 ; i++){
			onecase = new HashMap<String,Integer>();
			onecase.put("offset", randomInt(1));
			onecase.put("count", randomInt(2));
			testCases.add(onecase);
		}
		return testCases;
	}
	public static boolean doDelCardTest(String newAccessToken) {
		DelRtnInfo rtnInfo = null;
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = doDelCardParam();
		int len = testCases.size();
		int pass = 0 ; 
		int fail = 0 ;
		try {
			System.out.println("=========JwCardManageAPI.doDelCard[删除卡券]开始测试==========");
			for (int i = 0; i < len; i++) {
				onecase = testCases.get(i);
				rtnInfo = JwCardManageAPI.doDelCard(newAccessToken, onecase.get("card_id"));
				if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
					pass++;
					System.out.println("JwCardManageAPI.doDelCard["+i+"]" + ":成功");
				}else{
					fail++;
					System.out.println("JwCardManageAPI.doDelCard["+i+"]" + ":失败"+"["+rtnInfo.getErrmsg()+"]");
				}
				Thread.sleep(1000);
			}
			System.out.println("==============JwCardManageAPI.doDelCard测试结果=================");
			System.out.println("====================共计测试用例:[" +len+ "个]====================");
			System.out.println("====================成功测试用例:[" +pass+ "个]====================");
			System.out.println("====================失败测试用例:[" +fail+ "个]====================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	private static List<Map<String, String>> doDelCardParam(){
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = new ArrayList<Map<String, String>>();
		for(int i = 0 ; i < 5 ; i++){
			onecase = new HashMap<String,String>();
			onecase.put("card_id", randomStr(32));
			testCases.add(onecase);
		}
		return testCases;
	}
	public static boolean doGetCardDetailTest(String newAccessToken) {
		GetCardDetailRtnInfo rtnInfo = null;
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = doGetCardDetailParam();
		int len = testCases.size();
		int pass = 0 ; 
		int fail = 0 ;
		try {
			System.out.println("=========JwCardManageAPI.doGetCardDetail[查询卡券详情]开始测试==========");
			for (int i = 0; i < len; i++) {
				onecase = testCases.get(i);
				rtnInfo = JwCardManageAPI.doGetCardDetail(newAccessToken, onecase.get("card_id"));
				if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
					pass++;
					System.out.println("JwCardManageAPI.doGetCardDetail["+i+"]" + ":成功");
				}else{
					fail++;
					System.out.println("JwCardManageAPI.doGetCardDetail["+i+"]" + ":失败"+"["+rtnInfo.getErrmsg()+"]");
				}
				Thread.sleep(1000);
			}
			System.out.println("==============JwCardManageAPI.doGetCardDetail测试结果=================");
			System.out.println("====================共计测试用例:[" +len+ "个]====================");
			System.out.println("====================成功测试用例:[" +pass+ "个]====================");
			System.out.println("====================失败测试用例:[" +fail+ "个]====================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	private static List<Map<String, String>> doGetCardDetailParam(){
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = new ArrayList<Map<String, String>>();
		for(int i = 0 ; i < 5 ; i++){
			onecase = new HashMap<String,String>();
			onecase.put("card_id", randomStr(32));
			testCases.add(onecase);
		}
		return testCases;
	}
	public static boolean doGetCardTest(String newAccessToken) {
		GetCardRtnInfo rtnInfo = null;
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = doGetCardParam();
		int len = testCases.size();
		int pass = 0 ; 
		int fail = 0 ;
		try {
			System.out.println("=========JwCardManageAPI.doGetCard[查询卡券]开始测试==========");
			for (int i = 0; i < len; i++) {
				onecase = testCases.get(i);
				rtnInfo = JwCardManageAPI.doGetCard(newAccessToken, onecase.get("code"), onecase.get("card_id"));
				if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
					pass++;
					System.out.println("JwCardManageAPI.doGetCard["+i+"]" + ":成功");
				}else{
					fail++;
					System.out.println("JwCardManageAPI.doGetCard["+i+"]" + ":失败"+"["+rtnInfo.getErrmsg()+"]");
				}
				Thread.sleep(1000);
			}
			System.out.println("==============JwCardManageAPI.doGetCard测试结果=================");
			System.out.println("====================共计测试用例:[" +len+ "个]====================");
			System.out.println("====================成功测试用例:[" +pass+ "个]====================");
			System.out.println("====================失败测试用例:[" +fail+ "个]====================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	private static List<Map<String, String>> doGetCardParam(){
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = new ArrayList<Map<String, String>>();
		for(int i = 0 ; i < 5 ; i++){
			onecase = new HashMap<String,String>();
			onecase.put("code", randomStr(32));
			onecase.put("card_id", randomStr(32));
			testCases.add(onecase);
		}
		return testCases;
	}
	public static boolean doModifystockCardTest(String newAccessToken) {
		CommCardRtnInfo rtnInfo = null;
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = doModifystockCardParam();
		int len = testCases.size();
		int pass = 0 ; 
		int fail = 0 ;
		try {
			System.out.println("=========JwCardManageAPI.doModifystockCard[更改库存]开始测试==========");
			for (int i = 0; i < len; i++) {
				onecase = testCases.get(i);
				rtnInfo = JwCardManageAPI.doModifystockCard(newAccessToken, onecase.get("card_id"), Integer.parseInt(onecase.get("increase_stock_value")), Integer.parseInt(onecase.get("reduce_stock_value")));
				if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
					pass++;
					System.out.println("JwCardManageAPI.doModifystockCard["+i+"]" + ":成功");
				}else{
					fail++;
					System.out.println("JwCardManageAPI.doModifystockCard["+i+"]" + ":失败"+"["+rtnInfo.getErrmsg()+"]");
				}
				Thread.sleep(1000);
			}
			System.out.println("==============JwCardManageAPI.doModifystockCard测试结果=================");
			System.out.println("====================共计测试用例:[" +len+ "个]====================");
			System.out.println("====================成功测试用例:[" +pass+ "个]====================");
			System.out.println("====================失败测试用例:[" +fail+ "个]====================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	private static List<Map<String, String>> doModifystockCardParam(){
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = new ArrayList<Map<String, String>>();
		for(int i = 0 ; i < 5 ; i++){
			onecase = new HashMap<String,String>();
			onecase.put("card_id", randomStr(32));
			onecase.put("increase_stock_value", randomInt(1)+"");
			onecase.put("reduce_stock_value", randomInt(2)+"");
			testCases.add(onecase);
		}
		return testCases;
	}
	public static boolean doUnavailableCodeTest(String newAccessToken) {
		CommCardRtnInfo rtnInfo = null;
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = doUnavailableCodeParam();
		int len = testCases.size();
		int pass = 0 ; 
		int fail = 0 ;
		try {
			System.out.println("=========JwCardManageAPI.doUnavailableCode[卡券设置为失效状态]开始测试==========");
			for (int i = 0; i < len; i++) {
				onecase = testCases.get(i);
				rtnInfo = JwCardManageAPI.doUnavailableCode(newAccessToken, onecase.get("code"),onecase.get("card_id"));
				if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
					pass++;
					System.out.println("JwCardManageAPI.doUnavailableCode["+i+"]" + ":成功");
				}else{
					fail++;
					System.out.println("JwCardManageAPI.doUnavailableCode["+i+"]" + ":失败"+"["+rtnInfo.getErrmsg()+"]");
				}
				Thread.sleep(1000);
			}
			System.out.println("==============JwCardManageAPI.doUnavailableCode测试结果=================");
			System.out.println("====================共计测试用例:[" +len+ "个]====================");
			System.out.println("====================成功测试用例:[" +pass+ "个]====================");
			System.out.println("====================失败测试用例:[" +fail+ "个]====================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	private static List<Map<String, String>> doUnavailableCodeParam(){
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = new ArrayList<Map<String, String>>();
		for(int i = 0 ; i < 5 ; i++){
			onecase = new HashMap<String,String>();
			onecase.put("card_id", randomStr(32));
			onecase.put("code", randomStr(32));
			testCases.add(onecase);
		}
		return testCases;
	}
	public static boolean doUpdateCardTest(String newAccessToken) {
		CommCardRtnInfo rtnInfo = null;
		Map<String, Object> onecase = null;
		List<Map<String, Object>> testCases = doUpdateCardParam();
		int len = testCases.size();
		int pass = 0 ; 
		int fail = 0 ;
		try {
			System.out.println("=========JwCardManageAPI.doUpdateCard[更新卡券]开始测试==========");
			for (int i = 0; i < len; i++) {
				onecase = testCases.get(i);
				rtnInfo = JwCardManageAPI.doUpdateCard(newAccessToken, (CardUpdate)(onecase.get("cardUpdate")));
				if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
					pass++;
					System.out.println("JwCardManageAPI.doUpdateCard["+i+"]" + ":成功");
				}else{
					fail++;
					System.out.println("JwCardManageAPI.doUpdateCard["+i+"]" + ":失败"+"["+rtnInfo.getErrmsg()+"]");
				}
				Thread.sleep(1000);
			}
			System.out.println("==============JwCardManageAPI.doUpdateCard测试结果=================");
			System.out.println("====================共计测试用例:[" +len+ "个]====================");
			System.out.println("====================成功测试用例:[" +pass+ "个]====================");
			System.out.println("====================失败测试用例:[" +fail+ "个]====================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	private static List<Map<String, Object>> doUpdateCardParam(){
		Map<String, Object> onecase = null;
		List<Map<String, Object>> testCases = new ArrayList<Map<String, Object>>();
		CardUpdate cardUpdate = new CardUpdate();
		for(int i = 0 ; i < 5 ; i++){
			onecase = new HashMap<String,Object>();
			onecase.put("cardUpdate", cardUpdate);
			testCases.add(onecase);
		}
		return testCases;
	}
	public static boolean doUpdateCodeTest(String newAccessToken) {
		CommCardRtnInfo rtnInfo = null;
		Map<String, Object> onecase = null;
		List<Map<String, Object>> testCases = doUpdateCodeParam();
		int len = testCases.size();
		int pass = 0 ; 
		int fail = 0 ;
		try {
			System.out.println("=========JwCardManageAPI.doUpdateCode[更改code]开始测试==========");
			for (int i = 0; i < len; i++) {
				onecase = testCases.get(i);
				rtnInfo = JwCardManageAPI.doUpdateCode(newAccessToken, onecase.get("code").toString(), onecase.get("card_id").toString(), onecase.get("new_code").toString());
				if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
					pass++;
					System.out.println("JwCardManageAPI.doUpdateCode["+i+"]" + ":成功");
				}else{
					fail++;
					System.out.println("JwCardManageAPI.doUpdateCode["+i+"]" + ":失败"+"["+rtnInfo.getErrmsg()+"]");
				}
				Thread.sleep(1000);
			}
			System.out.println("==============JwCardManageAPI.doUpdateCode测试结果=================");
			System.out.println("====================共计测试用例:[" +len+ "个]====================");
			System.out.println("====================成功测试用例:[" +pass+ "个]====================");
			System.out.println("====================失败测试用例:[" +fail+ "个]====================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	private static List<Map<String, Object>> doUpdateCodeParam(){
		Map<String, Object> onecase = null;
		List<Map<String, Object>> testCases = new ArrayList<Map<String, Object>>();
		for(int i = 0 ; i < 5 ; i++){
			onecase = new HashMap<String,Object>();
			onecase.put("code", randomStr(32));
			onecase.put("card_id", randomStr(32));
			onecase.put("new_code", randomStr(32));
			testCases.add(onecase);
		}
		return testCases;
	}
	
	private static String randomStr(int len){
		String BASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			int number = random.nextInt(BASE.length());
			sb.append(BASE.charAt(number));
		}
		return sb.toString();
	}
	private static Integer randomInt(int len){
		String BASE = "0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			int number = random.nextInt(BASE.length());
			sb.append(BASE.charAt(number));
		}
		return Integer.parseInt(sb.toString());
	}
}
