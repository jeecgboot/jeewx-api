package com.jeecg.dingtalk.api.message.vo;

import com.alibaba.fastjson.JSONObject;
import com.jeecg.dingtalk.api.core.util.MessageType;

/**
 * 钉钉链接消息
 *
 * @author sunjianlei
 */
public class LinkMessage extends SuperMessage {

    private JSONObject link = new JSONObject();

    /**
     * 钉钉链接消息
     *
     * @param messageUrl 消息点击链接地址
     * @param picUrl     图片地址，可以通过上传媒体文件接口获取。
     * @param title      消息标题，建议100字符以内。
     * @param text       消息描述，建议500字符以内。
     */
    public LinkMessage(String messageUrl, String picUrl, String title, String text) {
        super(MessageType.LINK);
        this.link.put("messageUrl", messageUrl);
        this.link.put("picUrl", picUrl);
        this.link.put("title", title);
        this.link.put("text", text);
    }

    public JSONObject getLink() {
        return this.link;
    }

}
