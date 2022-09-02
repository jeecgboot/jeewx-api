package com.jeecg.dingtalk.api.message.vo;

import java.util.Arrays;
import java.util.Collection;

/**
 * 钉钉消息
 *
 * @author sunjianlei
 */
public class Message<T extends SuperMessage> {

    /**
     * 发送消息时使用的微应用的AgentID。
     */
    private Integer agent_id;
    /**
     * 接收者的userid列表，最大用户列表长度100。
     */
    private Collection<String> userid_list;
    /**
     * 接收者的部门id列表，最大列表长度20。    接收者是部门ID时，包括子部门下的所有用户。
     */
    private Collection<String> dept_id_list;
    /**
     * 是否发送给企业全部用户。当设置为false时必须指定userid_list或dept_id_list其中一个参数的值。
     */
    private Boolean to_all_user;

    /**
     * 消息内容，最长不超过2048个字节
     */
    private T msg;

    public Message(Integer agent_id, T msg) {
        this.agent_id = agent_id;
        this.msg = msg;
    }

    public Integer getAgent_id() {
        return agent_id;
    }

    public String getUserid_list() {
        if (userid_list != null) {
            return String.join(",", userid_list);
        }
        return null;
    }

    public Message setUserid_list(Collection<String> userid_list) {
        this.userid_list = userid_list;
        return this;
    }

    public Message setUserid_list(String... userid_list) {
        this.userid_list = Arrays.asList(userid_list);
        return this;
    }

    public String getDept_id_list() {
        if (dept_id_list != null) {
            return String.join(",", dept_id_list);
        }
        return null;
    }

    public Message setDept_id_list(Collection<String> dept_id_list) {
        this.dept_id_list = dept_id_list;
        return this;
    }


    public Message setDept_id_list(String... dept_id_list) {
        this.dept_id_list = Arrays.asList(dept_id_list);
        return this;
    }

    public Boolean getTo_all_user() {
        return to_all_user;
    }

    public Message setTo_all_user(Boolean to_all_user) {
        this.to_all_user = to_all_user;
        return this;
    }

    public T getMsg() {
        return msg;
    }
}
