package org.jeewx.api.wxsendmsg.util;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jeewx.api.core.util.FileUtils;

public class ReadImgUrls {

	public static String[] getImgs(String content) {
		String img = "";
		Pattern p_image;
		Matcher m_image;
		String str = "";
		String[] images = null;
		String regEx_img = "(<img.*src\\s*=\\s*(.*?)[^>]*?>)";
		p_image = Pattern.compile(regEx_img, Pattern.CASE_INSENSITIVE);
		m_image = p_image.matcher(content);
		while (m_image.find()) {
			img = m_image.group();
			Matcher m = Pattern.compile("src\\s*=\\s*\"?(.*?)(\"|>|\\s+)").matcher(img);
			while (m.find()) {
				String tempSelected = m.group(1);
				if ("".equals(str)) {
					str = tempSelected;
				} else {
					String temp = tempSelected;
					if(temp.indexOf("mmbiz.qpic.cn")==-1){
						str = str + "," + temp;
					}
				}
			}
		}
		if (!"".equals(str)) {
			images = str.split(",");
		}
		return images;
	}
	
	public static void main(String[] args) {
		String baseImageUrl = System.getProperty("user.dir");
		String domainUrl = "http://www.jeewx.com/jeewx";
		try {
			String c = FileUtils.readFile("D:/workspace-JEECGONE/jeewx-api/src/main/java/org/jeewx/api/wxsendmsg/uploadimg/1.html");
			String[] urls = getImgs(c);
			for(String url:urls){
				System.out.println(url);
				
//				url = url.replace(domainUrl, "");
//				url = baseImageUrl + url;
				
//				System.out.println(url);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
