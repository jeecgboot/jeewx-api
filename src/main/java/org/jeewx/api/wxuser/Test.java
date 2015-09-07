package org.jeewx.api.wxuser;

import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.wxbase.wxtoken.JwTokenAPI;
import org.jeewx.api.wxuser.user.JwUserAPI;

public class Test {

	public static void main(String[] args) {
		try {
			String s = JwTokenAPI.getAccessToken("wxa842e07813a1380a","76c299c21941e3c90667b1a6f9317900");
			System.out.println(JwUserAPI.getWxuser(s, "oGCDRjhhd0T1ngJaK5MVWRG2bp84").getNickname());
		} catch (WexinReqException e) {
			e.printStackTrace();
		}
	}
}
