package org.jeewx.api.wxuser;

import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.wxbase.wxtoken.JwTokenAPI;
import org.jeewx.api.wxuser.user.JwUserAPI;

public class Test {

	public static void main(String[] args) {
		try {
			String s = JwTokenAPI.getAccessToken("wxa842e07813a1380a","80a457401915ccbc10da0971fa6d404a");
			System.out.println(JwUserAPI.getWxuser(s, "oGCDRjvr9L1NoqxbyXLReCVYVyV0").getCity());
		} catch (WexinReqException e) {
			e.printStackTrace();
		}
	}
}
