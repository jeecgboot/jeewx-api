package com.jeecg.qywx.api.message.vo;

/**
 * Markdown消息体
 *
 * @author sunjianlei
 */
public class MarkdownEntity {
    /**
     * 消息内容，最长不超过2048个字节，注意：主页型应用推送的文本消息在微信端最多只显示20个字（包含中英文）
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
