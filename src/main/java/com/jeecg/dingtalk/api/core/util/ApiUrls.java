package com.jeecg.dingtalk.api.core.util;

/**
 * 钉钉Api接口地址
 *
 * @author sunjianlei
 */
public class ApiUrls {

    // ========================= JdtBaseAPI =========================

    /**
     * 【GET】获取 access_token，appKey，appSecret
     */
    public final static String ACCESS_TOKEN = "https://oapi.dingtalk.com/gettoken?appkey=%s&appsecret=%s";

    // ========================= JdtUserAPI =========================

    /**
     * 【POST】创建用户：access_token
     */
    public final static String USER_CREATE = "https://oapi.dingtalk.com/topapi/v2/user/create?access_token=%s";
    /**
     * 【POST】更新用户信息：access_token
     */
    public final static String USER_UPDATE = "https://oapi.dingtalk.com/topapi/v2/user/update?access_token=%s";
    /**
     * 【POST】删除用户：access_token
     */
    public final static String USER_DELETE = "https://oapi.dingtalk.com/topapi/v2/user/delete?access_token=%s";
    /**
     * 【POST】根据userid获取用户详情：access_token
     */
    public final static String USER_GET = "https://oapi.dingtalk.com/topapi/v2/user/get?access_token=%s";
    /**
     * 【POST】获取部门用户详细信息：access_token
     */
    public final static String USER_LIST = "https://oapi.dingtalk.com/topapi/v2/user/list?access_token=%s";
    /**
     * 【POST】获取部门用户基础信息：access_token
     */
    public final static String USER_LIST_SIMPLE = "https://oapi.dingtalk.com/topapi/user/listsimple?access_token=%s";
    /**
     * 【POST】获取部门用户userid列表：access_token
     */
    public final static String USER_LIST_ID = "https://oapi.dingtalk.com/topapi/user/listid?access_token=%s";
    /**
     * 【POST】获取员工人数：access_token
     */
    public final static String USER_COUNT = "https://oapi.dingtalk.com/topapi/user/count?access_token=%s";
    /**
     * 【POST】根据手机号获取userid：access_token
     */
    public final static String USER_GET_ID_BY_MOBILE = "https://oapi.dingtalk.com/topapi/v2/user/getbymobile?access_token=%s";
    /**
     * 【POST】根据unionid获取用户userid：access_token
     */
    public final static String USER_GET_ID_BY_UNIONID = "https://oapi.dingtalk.com/topapi/user/getbyunionid?access_token=%s";

    // ========================= JdtDepartmentAPI =========================

    /**
     * 【POST】创建部门：access_token
     */
    public final static String DEPART_CREATE = "https://oapi.dingtalk.com/topapi/v2/department/create?access_token=%s";
    /**
     * 【POST】更新部门：access_token
     */
    public final static String DEPART_UPDATE = "https://oapi.dingtalk.com/topapi/v2/department/update?access_token=%s";
    /**
     * 【POST】根据部门ID删除指定部门：access_token
     */
    public final static String DEPART_DELETE = "https://oapi.dingtalk.com/topapi/v2/department/delete?access_token=%s";
    /**
     * 【POST】根据部门ID获取子部门列表：access_token
     */
    public final static String DEPART_LIST_SUB = "https://oapi.dingtalk.com/topapi/v2/department/listsub?access_token=%s";
    /**
     * 【POST】根据部门ID获取指定部门详情：access_token
     */
    public final static String DEPART_GET = "https://oapi.dingtalk.com/topapi/v2/department/get?access_token=%s";
    /**
     * 【POST】获取子部门ID列表：access_token
     */
    public final static String DEPART_GET_LIST_SUB_ID = "https://oapi.dingtalk.com/topapi/v2/department/listsubid?access_token=%s";
    /**
     * 【POST】获取指定用户的所有父部门列表：access_token
     */
    public final static String DEPART_GET_LIST_PARENT_BY_USER = "https://oapi.dingtalk.com/topapi/v2/department/listparentbyuser?access_token=%s";
    /**
     * 【POST】获取指定部门的所有父部门列表：access_token
     */
    public final static String DEPART_GET_LIST_PARENT_BY_DEPT = "https://oapi.dingtalk.com/topapi/v2/department/listparentbydept?access_token=%s";

    // ========================= JdtMessageAPI =========================

    /**
     * 【POST】发送工作通知：access_token
     */
    public final static String MSG_ASYNC_SEND = "https://oapi.dingtalk.com/topapi/message/corpconversation/asyncsend_v2?access_token=%s";
    /**
     * 【POST】撤回工作通知消息：access_token
     */
    public final static String MSG_RECALL = "https://oapi.dingtalk.com/topapi/message/corpconversation/recall?access_token=%s";

    // ========================= JdtOauth2API =========================

    /**
     * 【POST】获取用户token
     */
    public final static String OAUTH2_USER_ACCESS_TOKEN = "https://api.dingtalk.com/v1.0/oauth2/userAccessToken";
    /**
     * 【GET】获取用户通讯录个人信息：unionId
     */
    public final static String OAUTH2_CONTACT_USERS = "https://api.dingtalk.com/v1.0/contact/users/%s";

    // ========================= 辅助方法 =========================

    /**
     * 获取URL，自动替换参数
     */
    public static String get(String url, Object... args) {
        return String.format(url, args);
    }

}
