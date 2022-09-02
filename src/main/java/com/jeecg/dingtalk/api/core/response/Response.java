package com.jeecg.dingtalk.api.core.response;

import com.alibaba.fastjson.JSONObject;

/**
 * API返回
 *
 * @author sunjianlei
 */
public class Response<T> {

    /**
     * 请求ID。
     */
    private String request_id;

    /**
     * 返回码。
     */
    private Integer errcode;

    /**
     * 调用失败时返回的错误信息。
     */
    private String errmsg;

    /**
     * 返回结果。
     */
    private T result;

    public Response() {
    }

    public Response(Response origin) {
        this.request_id = origin.request_id;
        this.errcode = origin.errcode;
        this.errmsg = origin.errmsg;
    }

    public Response(Response origin, T result) {
        this.request_id = origin.request_id;
        this.errcode = origin.errcode;
        this.errmsg = origin.errmsg;
        this.result = result;
    }

    public Response(JSONObject origin) {
        this.request_id = origin.getString("request_id");
        this.errcode = origin.getInteger("errcode");
        this.errmsg = origin.getString("errmsg");
    }

    /**
     * 当前请求是否成功
     */
    public boolean isSuccess() {
        if (this.errcode == null) {
            return false;
        }
        return this.errcode == 0;
    }

    public String getRequest_id() {
        return request_id;
    }

    public Response<T> setRequest_id(String request_id) {
        this.request_id = request_id;
        return this;
    }

    public Integer getErrcode() {
        return errcode;
    }

    public Response<T> setErrcode(Integer errcode) {
        this.errcode = errcode;
        return this;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public Response<T> setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }

    public T getResult() {
        return result;
    }

    public Response<T> setResult(T result) {
        this.result = result;
        return this;
    }
}
