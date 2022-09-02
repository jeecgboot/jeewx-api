package com.jeecg.dingtalk.api.message.vo;

/**
 * 钉钉消息超类
 *
 * @author sunjianlei
 */
public class SuperMessage {
    protected SuperMessage(String msgtype) {
        this.msgtype = msgtype;
    }

    private String msgtype;

    public String getMsgtype() {
        return msgtype;
    }
}
