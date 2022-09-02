package com.jeecg.dingtalk.api.user.vo;

/**
 * 当用户来自于关联组织时的关联信息
 *
 * @author sunjianlei
 */
public class UnionEmpExt {

    /**
     * 员工的userid
     */
    private String userid;
    /**
     * 关联映射关系
     */
    private UnionEmpMapVo[] union_emp_map_list;
    /**
     * 当前用户所属的组织的企业corpid
     */
    private String corp_id;

    public String getUserid() {
        return userid;
    }

    public UnionEmpExt setUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public UnionEmpMapVo[] getUnion_emp_map_list() {
        return union_emp_map_list;
    }

    public UnionEmpExt setUnion_emp_map_list(UnionEmpMapVo[] union_emp_map_list) {
        this.union_emp_map_list = union_emp_map_list;
        return this;
    }

    public String getCorp_id() {
        return corp_id;
    }

    public UnionEmpExt setCorp_id(String corp_id) {
        this.corp_id = corp_id;
        return this;
    }

}
