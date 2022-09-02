package com.jeecg.qywx.api.message.vo;

/**
 * @author sunjianlei
 */
public class TextCardEntity {
    private String title; // 是	标题，不超过128个字节，超过会自动截断（支持id转译）
    private String description;// 是	描述，不超过512个字节，超过会自动截断（支持id转译）
    private String url; // 是	点击后跳转的链接。最长2048字节，请确保包含了协议头(http/https)
    private String btntxt;// 否	按钮文字。 默认为“详情”， 不超过4个文字，超过自动截断。

    public String getTitle() {
        return title;
    }

    public TextCardEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TextCardEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public TextCardEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBtntxt() {
        return btntxt;
    }

    public TextCardEntity setBtntxt(String btntxt) {
        this.btntxt = btntxt;
        return this;
    }
}
