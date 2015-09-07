package org.jeewx.api.custservice.multicustservice.model;

import org.jeewx.api.core.req.model.WeixinReqParam;

/**
 * 客服聊天记录
 * @author caojm
 */
public class ChatRecord  extends WeixinReqParam{
    
    //客服帐号
    private String worker = "";
    
    //用户标识
    private String openId = "";
    
    /**
     *  操作ID
     *  1000    创建未接入会话
     *  1001    接入会话
     *  1002    主动发起会话
     *  1004    关闭会话
     *  1005    抢接会话
     *  2001    公众号收到消息
     *  2002    客服发送消息
     *  2003    客服收到消息
     */
    private String opercode = "";
    
    //操作时间，UNIX时间戳
    private String time = "";
    
    //聊天记录
    private String text = "";

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
