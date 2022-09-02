package com.jeecg.dingtalk.api.message.vo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jeecg.dingtalk.api.core.util.MessageType;

/**
 * 钉钉卡片消息
 *
 * @author sunjianlei
 */
public class ActionCardMessage extends SuperMessage {

    private JSONObject action_card = new JSONObject();

    /**
     * 钉钉卡片消息
     *
     * @param markdown 消息内容，支持markdown，语法参考标准markdown语法。建议1000个字符以内。
     */
    public ActionCardMessage(String markdown) {
        super(MessageType.ACTION_CARD);
        this.action_card.put("markdown", markdown);
    }

    public JSONObject getAction_card() {
        return this.action_card;
    }

    public ActionCardMessage put(String key, Object value) {
        this.action_card.put(key, value);
        return this;
    }

    /**
     * 使用整体跳转ActionCard样式时的标题。
     */
    public ActionCardMessage setTitle(String title) {
        return this.put("title", title);
    }

    /**
     * 使用整体跳转ActionCard样式时的标题。必须与single_url同时设置，最长20个字符。
     * <br>
     * 如果是整体跳转的ActionCard样式，则single_title和single_url必须设置。
     */
    public ActionCardMessage setSingle_title(String single_title) {
        return this.put("single_title", single_title);
    }

    /**
     * 使用整体跳转ActionCard样式时的标题。必须与single_url同时设置，最长20个字符。
     * <br>
     * 如果是整体跳转的ActionCard样式，则single_title和single_url必须设置。
     */
    public ActionCardMessage setSingle_url(String single_url) {
        return this.put("single_url", single_url);
    }

    /**
     * 使用独立跳转ActionCard样式时的按钮排列方式：
     * <p>
     * 0：竖直排列
     * <p>
     * 1：横向排列
     * <p>
     * 必须与btn_json_list同时设置。
     */
    public ActionCardMessage setBtn_orientation(String btn_orientation) {
        return this.put("btn_orientation", btn_orientation);
    }

    /**
     * 使用独立跳转ActionCard样式时的按钮列表；必须与btn_orientation同时设置，且长度不超过1000字符。
     *
     * @param title      使用独立跳转ActionCard样式时的按钮的标题，最长20个字符。
     * @param action_url 使用独立跳转ActionCard样式时的跳转链接。
     */
    public ActionCardMessage setBtn_json_list(String title, String action_url) {
        JSONArray btn_json_list = this.action_card.getJSONArray("btn_json_list");
        if (btn_json_list == null) {
            btn_json_list = new JSONArray();
            this.action_card.put("btn_json_list", btn_json_list);
        }
        JSONObject item = new JSONObject();
        item.put("title", title);
        item.put("action_url", action_url);
        btn_json_list.add(item);
        return this;
    }

}
