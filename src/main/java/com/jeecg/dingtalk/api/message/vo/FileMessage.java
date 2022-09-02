package com.jeecg.dingtalk.api.message.vo;

import com.alibaba.fastjson.JSONObject;
import com.jeecg.dingtalk.api.core.util.MessageType;

/**
 * 钉钉文件消息
 *
 * @author sunjianlei
 */
public class FileMessage extends SuperMessage {

    private JSONObject file = new JSONObject();

    /**
     * 钉钉文件消息
     *
     * @param media_id 媒体文件ID。 引用的媒体文件最大10MB。可以通过上传媒体文件接口获取。
     */
    public FileMessage(String media_id) {
        super(MessageType.FILE);
        this.file.put("media_id", media_id);
    }

    public JSONObject getFile() {
        return this.file;
    }

}
