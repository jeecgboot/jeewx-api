package com.jeecg.dingtalk.api.department.vo;

/**
 * 【返回对象】获取指定用户的所有父部门列表
 *
 * @author sunjianlei
 */
public class DeptParentResponse {

    /**
     * 父部门列表。
     */
    private Integer[] parent_dept_id_list;

    public Integer[] getParent_dept_id_list() {
        return parent_dept_id_list;
    }

    public DeptParentResponse setParent_dept_id_list(Integer[] parent_dept_id_list) {
        this.parent_dept_id_list = parent_dept_id_list;
        return this;
    }
}
