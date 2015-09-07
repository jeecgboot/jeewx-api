package org.jeewx.api.custservice;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.jeewx.api.core.common.AccessToken;
import org.jeewx.api.custservice.multicustservice.JwMultiCustomerAPI;
import org.jeewx.api.custservice.multicustservice.model.ChatRecord;

public class Test {
    private static String appid = "wxb512901288a94943";
    private static String appscret = "6f94b81b49cf9f89fafe305dcaf2c632";

    /**
     * @param args
     */
    public static void main(String[] args) {
        Test t = new Test();
        // 多客户服务转发测试
        t.getMultiCustServcieMessage();
        //指定用户服务转发测试
        t.getSpecCustServcie();
        //获取指定用户的客服的聊天记录列表
        t.getCustServiceRecordList();
    }

    public String getNewAccessToken() {
        return new AccessToken(appid, appscret).getNewAccessToken();
    }

    // 获取转发多客服的响应消息
    public void getMultiCustServcieMessage() {
        JwMultiCustomerAPI multCust = new JwMultiCustomerAPI();
        System.out.println(multCust.getMultiCustServcieMessage("oqII7uCZnrPv3xc4eRuk9TACVbxU", "wxb512901288a94943"));
    }
    
    // 获取指定客服的响应消息
    public void getSpecCustServcie() {
        JwMultiCustomerAPI multCust = new JwMultiCustomerAPI();
        System.out.println(multCust.getSpecCustServcie(getNewAccessToken(), "oqII7uCZnrPv3xc4eRuk9TACVbxU", "wxb512901288a94943","xxxxx"));
    }
    
    // 获取指定客服的响应消息
    public void getCustServiceRecordList() {
        JwMultiCustomerAPI multCust = new JwMultiCustomerAPI();
        List<ChatRecord> chatRecods = multCust.getCustServiceRecordList(getNewAccessToken(), null, new Date().getTime(), new Date().getTime()+10000, 10, 1);
        for(Iterator<ChatRecord> it = chatRecods.iterator();it.hasNext();){
            ChatRecord chatRecod = (ChatRecord)it.next();
            System.out.println(chatRecod.getText());
        }
    }
}
