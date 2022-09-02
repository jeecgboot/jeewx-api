package com.jeecg.dingtalk.api.message;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jeecg.dingtalk.api.core.response.Response;
import com.jeecg.dingtalk.api.core.util.ApiUrls;
import com.jeecg.dingtalk.api.core.util.HttpUtil;
import com.jeecg.dingtalk.api.message.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 钉钉消息通知接口
 * <p>
 * 发送工作通知消息需要注意以下事项：
 * <p>
 * 同一个应用相同消息的内容同一个用户一天只能接收一次。
 * <p>
 * 同一个应用给同一个用户发送消息，企业内部应用一天不得超过500次。
 * <p>
 * 通过设置to_all_user参数全员推送消息，一天最多3次。
 * <p>
 * 超出以上限制次数后，接口返回成功，但用户无法接收到。详细的限制说明，请参考工作通知消息限制。
 * <p>
 * 该接口是异步发送消息，接口返回成功并不表示用户一定会收到消息，需要通过获取工作通知消息的发送结果接口查询是否给用户发送成功。
 * <p>
 * 消息类型和样例可参考消息类型与数据格式。
 *
 * @author sunjianlei
 */
public class JdtMessageAPI {

    private static final Logger logger = LoggerFactory.getLogger(JdtMessageAPI.class);

    /**
     * 发送消息
     */
    private static <T extends SuperMessage> Response<String> sendMessage(Message<T> message, String accessToken, String logText) {
        String url = ApiUrls.get(ApiUrls.MSG_ASYNC_SEND, accessToken);
        logger.info("[" + logText + "] params:{}", new Object[]{JSON.toJSONString(message)});
        JSONObject originResponse = HttpUtil.sendPost(url, JSON.toJSONString(message));
        Response<String> response = new Response<>(originResponse);
        if (response.isSuccess()) {
            // 将常用的task_id直接返回（实际上也就只有这一个返回参数）
            String task_id = originResponse.getString("task_id");
            response.setResult(task_id);
        }
        logger.info("[" + logText + "] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

    /**
     * 发送文本消息
     * <br>
     * https://developers.dingtalk.com/document/app/asynchronous-sending-of-enterprise-session-messages
     *
     * @param message     文本消息
     * @param accessToken 有效的access_token
     * @return Response&lt;String&gt 成功返回task_id（任务id，可用于撤回）
     */
    public static Response<String> sendTextMessage(Message<TextMessage> message, String accessToken) {
        return JdtMessageAPI.sendMessage(message, accessToken, "MSG_SEND_TEXT_MESSAGE");
    }

    /**
     * 发送图片消息
     * <br>
     * https://developers.dingtalk.com/document/app/asynchronous-sending-of-enterprise-session-messages
     *
     * @param message     图片消息
     * @param accessToken 有效的access_token
     * @return Response&lt;String&gt 成功返回task_id（任务id，可用于撤回）
     */
    public static Response<String> sendImageMessage(Message<ImageMessage> message, String accessToken) {
        return JdtMessageAPI.sendMessage(message, accessToken, "MSG_SEND_IMAGE_MESSAGE");
    }

    /**
     * 发送语音消息
     * <br>
     * https://developers.dingtalk.com/document/app/asynchronous-sending-of-enterprise-session-messages
     *
     * @param message     语音消息
     * @param accessToken 有效的access_token
     * @return Response&lt;String&gt 成功返回task_id（任务id，可用于撤回）
     */
    public static Response<String> sendVoiceMessage(Message<VoiceMessage> message, String accessToken) {
        return JdtMessageAPI.sendMessage(message, accessToken, "MSG_SEND_VOICE_MESSAGE");
    }

    /**
     * 发送文件消息
     * <br>
     * https://developers.dingtalk.com/document/app/asynchronous-sending-of-enterprise-session-messages
     *
     * @param message     文件消息
     * @param accessToken 有效的access_token
     * @return Response&lt;String&gt 成功返回task_id（任务id，可用于撤回）
     */
    public static Response<String> sendFileMessage(Message<FileMessage> message, String accessToken) {
        return JdtMessageAPI.sendMessage(message, accessToken, "MSG_SEND_FILE_MESSAGE");
    }

    /**
     * 发送链接消息
     * <br>
     * https://developers.dingtalk.com/document/app/asynchronous-sending-of-enterprise-session-messages
     *
     * @param message     链接消息
     * @param accessToken 有效的access_token
     * @return Response&lt;String&gt 成功返回task_id（任务id，可用于撤回）
     */
    public static Response<String> sendLinkMessage(Message<LinkMessage> message, String accessToken) {
        return JdtMessageAPI.sendMessage(message, accessToken, "MSG_SEND_LINK_MESSAGE");
    }

    /**
     * 发送Markdown消息
     * <br>
     * https://developers.dingtalk.com/document/app/asynchronous-sending-of-enterprise-session-messages
     *
     * @param message     Markdown消息
     * @param accessToken 有效的access_token
     * @return Response&lt;String&gt 成功返回task_id（任务id，可用于撤回）
     */
    public static Response<String> sendMarkdownMessage(Message<MarkdownMessage> message, String accessToken) {
        return JdtMessageAPI.sendMessage(message, accessToken, "MSG_SEND_MARKDOWN_MESSAGE");
    }

    /**
     * 发送卡片消息
     * <br>
     * https://developers.dingtalk.com/document/app/asynchronous-sending-of-enterprise-session-messages
     *
     * @param message     卡片消息
     * @param accessToken 有效的access_token
     * @return Response&lt;String&gt 成功返回task_id（任务id，可用于撤回）
     */
    public static Response<String> sendActionCardMessage(Message<ActionCardMessage> message, String accessToken) {
        return JdtMessageAPI.sendMessage(message, accessToken, "MSG_SEND_ACTION_CARD_MESSAGE");
    }

    /**
     * 撤回消息。仅支持撤回24小时内的工作消息通知。<br>
     * https://developers.dingtalk.com/document/app/notification-of-work-withdrawal
     *
     * @param agent_id    发送消息时使用的微应用的ID。
     * @param msg_task_id 发送消息时钉钉返回的任务ID。
     * @param accessToken 有效的access_token
     * @return Response&lt;JSONObject&gt
     */
    public static Response<JSONObject> recallMessage(int agent_id, String msg_task_id, String accessToken) {
        String url = ApiUrls.get(ApiUrls.MSG_RECALL, accessToken);
        JSONObject body = new JSONObject();
        body.put("agent_id", agent_id);
        body.put("msg_task_id", msg_task_id);
        Response<JSONObject> response = HttpUtil.post(url, body.toJSONString());
        logger.info("[MSG_RECALL_MESSAGE] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

}
