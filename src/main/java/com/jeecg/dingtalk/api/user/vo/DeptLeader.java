package com.jeecg.dingtalk.api.user.vo;

/**
 * 员工在对应的部门中是否领导。
 *
 * @author sunjianlei
 */
public class DeptLeader {

    /**
     * 部门ID
     */
    private Number dept_id;
    /**
     * 是否是领导
     */
    private Boolean leader;

    public Number getDept_id() {
        return dept_id;
    }

    public DeptLeader setDept_id(Number dept_id) {
        this.dept_id = dept_id;
        return this;
    }

    public Boolean getLeader() {
        return leader;
    }

    public DeptLeader setLeader(Boolean leader) {
        this.leader = leader;
        return this;
    }

}
