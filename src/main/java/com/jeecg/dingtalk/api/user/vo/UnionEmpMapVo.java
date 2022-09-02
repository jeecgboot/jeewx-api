package com.jeecg.dingtalk.api.user.vo;

/**
 * 关联映射关系
 *
 * @author sunjianlei
 */
public class UnionEmpMapVo {

    /**
     * 关联分支组织中的员工userid
     */
    private String userid;

    /**
     * 关联分支组织的企业corpid
     */
    private String corp_id;

    public String getUserid() {
        return userid;
    }

    public UnionEmpMapVo setUserid(String userid) {
        this.userid = userid;
        return this;
    }

}
