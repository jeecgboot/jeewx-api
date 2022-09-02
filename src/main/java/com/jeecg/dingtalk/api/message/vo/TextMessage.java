package com.jeecg.dingtalk.api.message.vo;

import com.alibaba.fastjson.JSONObject;
import com.jeecg.dingtalk.api.core.util.MessageType;

/**
 * 钉钉文本消息
 *
 * @author sunjianlei
 */
public class TextMessage extends SuperMessage {

    private JSONObject text = new JSONObject();

    /**
     * 钉钉文本消息
     *
     * @param content 消息内容
     */
    public TextMessage(String content) {
        super(MessageType.TEXT);
        this.text.put("content", content);
    }

    public JSONObject getText() {
        return this.text;
    }

}
