package com.jeecg.dingtalk.api.message.vo;

import com.alibaba.fastjson.JSONObject;
import com.jeecg.dingtalk.api.core.util.MessageType;

/**
 * 钉钉Markdown消息
 *
 * @author sunjianlei
 */
public class MarkdownMessage extends SuperMessage {

    private JSONObject markdown = new JSONObject();

    /**
     * 钉钉Markdown消息
     *
     * @param title 首屏会话透出的展示内容。
     * @param text  markdown格式的消息，建议500字符以内。
     */
    public MarkdownMessage(String title, String text) {
        super(MessageType.MARKDOWN);
        this.markdown.put("title", title);
        this.markdown.put("text", text);
    }

    public JSONObject getMarkdown() {
        return this.markdown;
    }

}
