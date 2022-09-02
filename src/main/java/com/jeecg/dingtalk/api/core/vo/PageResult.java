package com.jeecg.dingtalk.api.core.vo;


import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * 分页返回结果
 *
 * @author sunjianlei
 */
public class PageResult<T> {

    /**
     * 是否还有更多的数据
     */
    private Boolean has_more;

    /**
     * 下一次分页的游标，如果has_more为false，表示没有更多的分页数据。
     */
    private Integer next_cursor;

    /**
     * 结果列表
     */
    private List<T> list;


    public PageResult() {
    }

    public PageResult(JSONObject json, Class<T> clazz) {
        this.has_more = json.getBoolean("has_more");
        this.next_cursor = json.getInteger("next_cursor");
        this.list = json.getJSONArray("list").toJavaList(clazz);
    }

    public Boolean getHas_more() {
        return has_more;
    }

    public PageResult<T> setHas_more(Boolean has_more) {
        this.has_more = has_more;
        return this;
    }

    public Integer getNext_cursor() {
        return next_cursor;
    }

    public PageResult<T> setNext_cursor(Integer next_cursor) {
        this.next_cursor = next_cursor;
        return this;
    }

    public List<T> getList() {
        return list;
    }

    public PageResult<T> setList(List<T> list) {
        this.list = list;
        return this;
    }

}
