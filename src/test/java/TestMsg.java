import java.util.HashMap;
import java.util.Map;
import org.jeewx.api.core.exception.WexinReqException;
import org.jeewx.api.core.req.model.message.TemplateData;
import org.jeewx.api.core.req.model.message.TemplateMessageSendResult;
import org.jeewx.api.wxsendmsg.JwSendTemplateMsgAPI;


public class TestMsg {

	private static final String accessToken = "8_E1-SgIlqoOncwBL_KEoct50MzwAzygB6RH1NkGjLRfB9aHNcNWEvf9h4CiDpsdPO_NT4P_d5DTmkuEXeL-I4dA1N3Duj1LkntFXQeJxfSyJ8ozHhlVWw6K8rQwoZBOdCBAMOB";
	
	/**
	 * 新活动通知模板
	 * @param args
	 */
	public static void main3(String[] args) {
		TemplateMessageSendResult msgSend = new TemplateMessageSendResult();
		Map<String, TemplateData> data = new HashMap<String, TemplateData>();
		data.put("first", new TemplateData("小伙伴醒醒啦，当前有大奖活动，动动小手试试运气啦！","#173177"));
		data.put("keyword1", new TemplateData("东方时尚大转盘","#173177"));
		data.put("keyword2", new TemplateData("大奖iPhone","#173177"));
		data.put("keyword3", new TemplateData("大奖未出","#173177"));
		data.put("keyword4", new TemplateData("2018年3月15日","#173177"));
		data.put("remark", new TemplateData("点击详情，可参与活动！","#173177"));
		msgSend.setTemplate_id("e_aj3kaB-g8Zq0I52imrXrKs7B4J_z0x5yizPNZNzP4");
		msgSend.setTouser("oGCDRjvr9L1NoqxbyXLReCVYVyV0");
		msgSend.setUrl("https://w.url.cn/s/A7MdF2r");
		msgSend.setData(data);
		try {
			JwSendTemplateMsgAPI.sendTemplateMsg(accessToken, msgSend);
		} catch (WexinReqException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 新活动通知模板
	 * @param args
	 */
	public static void main2(String[] args) {
		TemplateMessageSendResult msgSend = new TemplateMessageSendResult();
		Map<String, TemplateData> data = new HashMap<String, TemplateData>();
		data.put("first", new TemplateData("小伙伴醒醒啦，当前有大奖活动，动动小手试试运气啦！","#173177"));
		data.put("keyword1", new TemplateData("东方时尚大转盘","#173177"));
		data.put("keyword2", new TemplateData("进行中","#173177"));
		data.put("time", new TemplateData("2018年3月15日","#173177"));
		data.put("remark", new TemplateData("点击详情，可参与活动！","#173177"));
		msgSend.setTemplate_id("n-urivSo-9oNOks1KXNj9Cava_pcE168QocdjQ_0KjM");
		msgSend.setTouser("oGCDRjvr9L1NoqxbyXLReCVYVyV0");
		msgSend.setUrl("https://w.url.cn/s/A7MdF2r");
		msgSend.setData(data);
		try {
			JwSendTemplateMsgAPI.sendTemplateMsg(accessToken, msgSend);
		} catch (WexinReqException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 购买通知模板
	 * @param args
	 */
	public static void main(String[] args) {
		TemplateMessageSendResult msgSend = new TemplateMessageSendResult();
		Map<String, TemplateData> data = new HashMap<String, TemplateData>();
		data.put("first", new TemplateData("恭喜你购买成功！","#173177"));
		data.put("product", new TemplateData("在线聊天插件","#173177"));
		data.put("price", new TemplateData("500元","#173177"));
		data.put("time", new TemplateData("2018年3月15日","#173177"));
		data.put("remark", new TemplateData("欢迎再次购买！","#173177"));
		msgSend.setTemplate_id("1l7ldFbwNoXsYPzKmuccHPtCAQ21HeHL5kPAKaKh770");
		msgSend.setTouser("oGCDRjvr9L1NoqxbyXLReCVYVyV0");
		msgSend.setUrl("http://yun.jeecg.org");
		msgSend.setData(data);
		try {
			JwSendTemplateMsgAPI.sendTemplateMsg(accessToken, msgSend);
		} catch (WexinReqException e) {
			e.printStackTrace();
		}
	}
}
