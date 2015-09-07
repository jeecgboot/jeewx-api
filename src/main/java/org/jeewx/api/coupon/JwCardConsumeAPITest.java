package org.jeewx.api.coupon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.jeewx.api.coupon.consume.JwCardConsumeAPI;
import org.jeewx.api.coupon.consume.model.ConsumeRtnInfo;
import org.jeewx.api.coupon.consume.model.EncryptRtnInfo;
import org.jeewx.api.core.common.AccessToken;
/**
 * 测试卡券核销
 * @author mcl
 * @version v1.0
 */
public class JwCardConsumeAPITest {

	private static String appid = "wxb512901288a94943";
	private static String appscret = "6f94b81b49cf9f89fafe305dcaf2c632";

	/**
	 * 测试
	 */
	public static void main(String[] args) {
		AccessToken atoken = new AccessToken(appid, appscret);
		String newAccessToken = atoken.getNewAccessToken();
		//核销一张卡券
		doConsumeTest(newAccessToken);
		//解码卡券code
		doDecryptTest(newAccessToken);
	}

	public static boolean doConsumeTest(String newAccessToken) {
		ConsumeRtnInfo rtnInfo = null;
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = doConsumeTestParam();
		int len = testCases.size();
		int pass = 0 ; 
		int fail = 0 ;
		try {
			System.out.println("=========JwCardConsumeAPI.doConsume[核销一张卡券]开始测试==========");
			for (int i = 0; i < len; i++) {
				onecase = testCases.get(i);
				rtnInfo = JwCardConsumeAPI.doConsume(newAccessToken, onecase.get("code"), onecase.get("card_id"));
				if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
					pass++;
					System.out.println("JwCardConsumeAPI.doConsume["+i+"]" + ":成功");
				}else{
					fail++;
					System.out.println("JwCardConsumeAPI.doConsume["+i+"]" + ":失败"+"["+rtnInfo.getErrmsg()+"]");
				}
				Thread.sleep(1000);
			}
			System.out.println("==============JwCardConsumeAPI.doConsume测试结果=================");
			System.out.println("====================共计测试用例:[" +len+ "个]====================");
			System.out.println("====================成功测试用例:[" +pass+ "个]====================");
			System.out.println("====================失败测试用例:[" +fail+ "个]====================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	private static List<Map<String, String>> doConsumeTestParam(){
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = new ArrayList<Map<String, String>>();
		for(int i = 0 ; i < 5 ; i++){
			onecase = new HashMap<String,String>();
			onecase.put("code", random(32));
			onecase.put("card_id", random(32));
			testCases.add(onecase);
		}
		return testCases;
	}
	public static boolean doDecryptTest(String newAccessToken) {
		EncryptRtnInfo rtnInfo = null;
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = doDecryptTestParam();
		int len = testCases.size();
		int pass = 0 ; 
		int fail = 0 ;
		try {
			System.out.println("=========JwCardConsumeAPI.doDecrypt[核销一张卡券]开始测试==========");
			for (int i = 0; i < len; i++) {
				onecase = testCases.get(i);
				rtnInfo = JwCardConsumeAPI.doDecrypt(newAccessToken, onecase.get("encrypt_code"));
				if(Integer.parseInt(rtnInfo.getErrcode()) == 0){
					pass++;
					System.out.println("JwCardConsumeAPI.doDecrypt["+i+"]" + ":成功");
				}else{
					fail++;
					System.out.println("JwCardConsumeAPI.doDecrypt["+i+"]" + ":失败"+"["+rtnInfo.getErrmsg()+"]");
				}
				Thread.sleep(1000);
			}
			System.out.println("==============JwCardConsumeAPI.doDecrypt测试结果=================");
			System.out.println("====================共计测试用例:[" +len+ "个]====================");
			System.out.println("====================成功测试用例:[" +pass+ "个]====================");
			System.out.println("====================失败测试用例:[" +fail+ "个]====================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	private static List<Map<String, String>> doDecryptTestParam(){
		Map<String, String> onecase = null;
		List<Map<String, String>> testCases = new ArrayList<Map<String, String>>();
		for(int i = 0 ; i < 5 ; i++){
			onecase = new HashMap<String,String>();
			onecase.put("encrypt_code", random(32));
			testCases.add(onecase);
		}
		return testCases;
	}
	private static String random(int len){
		String BASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			int number = random.nextInt(BASE.length());
			sb.append(BASE.charAt(number));
		}
		return sb.toString();
	}
}
