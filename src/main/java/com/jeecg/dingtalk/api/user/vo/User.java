package com.jeecg.dingtalk.api.user.vo;

import java.util.Arrays;

/**
 * 钉钉用户对象
 *
 * @author sunjianlei
 */
public class User {

    /**
     * 员工的userid
     */
    private String userid;
    /**
     * 员工在当前开发者企业账号范围内的唯一标识
     */
    private String unionid;
    /**
     * 员工名称
     */
    private String name;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 国际电话区号
     */
    private String state_code;
    /**
     * 员工的直属主管
     */
    private String manager_userid;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 是否隐藏号码
     */
    private Boolean hide_mobile;
    /**
     * 分机号
     */
    private String telephone;
    /**
     * 员工工号
     */
    private String job_number;
    /**
     * 职位
     */
    private String title;
    /**
     * 员工邮箱
     */
    private String email;
    /**
     * 办公地点
     */
    private String work_place;
    /**
     * 备注
     */
    private String remark;
    /**
     * 专属帐号登录名
     */
    private String login_id;
    /**
     * 专属帐号类型： sso：企业自建专属帐号；dingtalk：钉钉自建专属帐号
     */
    private String exclusive_account_type;
    /**
     * 是否专属帐号
     */
    private Boolean exclusive_account;
    /**
     * 所属部门ID列表
     */
    private String dept_id_list;
    /**
     * 员工在对应的部门中的排序
     */
    private DeptOrder[] dept_order_list;
    /**
     * 扩展属性，最大长度2000个字符
     */
    private String extension;
    /**
     * 入职时间，Unix时间戳，单位毫秒
     */
    private Number hired_date;
    /**
     * 是否激活了钉钉
     */
    private Boolean active;
    /**
     * 是否完成了实名认证
     */
    private Boolean real_authed;
    /**
     * 是否为企业的高管
     */
    private Boolean senior;
    /**
     * 是否为企业的管理员
     */
    private Boolean admin;
    /**
     * 是否为企业的老板
     */
    private Boolean boss;
    /**
     * 员工在对应的部门中是否领导
     */
    private DeptLeader[] leader_in_dept;
    /**
     * 角色列表
     */
    private UserRole[] role_list;
    /**
     * 当用户来自于关联组织时的关联信息
     */
    private UnionEmpExt union_emp_ext;

    public String getUserid() {
        return userid;
    }

    public User setUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public String getUnionid() {
        return unionid;
    }

    public User setUnionid(String unionid) {
        this.unionid = unionid;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public User setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getState_code() {
        return state_code;
    }

    public User setState_code(String state_code) {
        this.state_code = state_code;
        return this;
    }

    public String getManager_userid() {
        return manager_userid;
    }

    public User setManager_userid(String manager_userid) {
        this.manager_userid = manager_userid;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public User setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public Boolean getHide_mobile() {
        return hide_mobile;
    }

    public User setHide_mobile(Boolean hide_mobile) {
        this.hide_mobile = hide_mobile;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public User setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getJob_number() {
        return job_number;
    }

    public User setJob_number(String job_number) {
        this.job_number = job_number;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public User setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getWork_place() {
        return work_place;
    }

    public User setWork_place(String work_place) {
        this.work_place = work_place;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public User setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getLogin_id() {
        return login_id;
    }

    public User setLogin_id(String login_id) {
        this.login_id = login_id;
        return this;
    }

    public String getExclusive_account_type() {
        return exclusive_account_type;
    }

    public User setExclusive_account_type(String exclusive_account_type) {
        this.exclusive_account_type = exclusive_account_type;
        return this;
    }

    public Boolean getExclusive_account() {
        return exclusive_account;
    }

    public User setExclusive_account(Boolean exclusive_account) {
        this.exclusive_account = exclusive_account;
        return this;
    }

    public String getDept_id_list() {
        return dept_id_list;
    }

    public Integer[] getDept_id_listArray() {
        if (dept_id_list != null) {
            return Arrays.stream(dept_id_list.split(",")).map(Integer::parseInt).toArray(Integer[]::new);
        }
        return null;
    }

    public User setDept_id_list(Integer... dept_id_list) {
        this.dept_id_list = String.join(",", Arrays.stream(dept_id_list).map(Object::toString).toArray(String[]::new));
        return this;
    }

    public DeptOrder[] getDept_order_list() {
        return dept_order_list;
    }

    public User setDept_order_list(DeptOrder[] dept_order_list) {
        this.dept_order_list = dept_order_list;
        return this;
    }

    public String getExtension() {
        return extension;
    }

    public User setExtension(String extension) {
        this.extension = extension;
        return this;
    }

    public Number getHired_date() {
        return hired_date;
    }

    public User setHired_date(Number hired_date) {
        this.hired_date = hired_date;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public User setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public Boolean getReal_authed() {
        return real_authed;
    }

    public User setReal_authed(Boolean real_authed) {
        this.real_authed = real_authed;
        return this;
    }

    public Boolean getSenior() {
        return senior;
    }

    public User setSenior(Boolean senior) {
        this.senior = senior;
        return this;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public User setAdmin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    public Boolean getBoss() {
        return boss;
    }

    public User setBoss(Boolean boss) {
        this.boss = boss;
        return this;
    }

    public DeptLeader[] getLeader_in_dept() {
        return leader_in_dept;
    }

    public User setLeader_in_dept(DeptLeader[] leader_in_dept) {
        this.leader_in_dept = leader_in_dept;
        return this;
    }

    public UserRole[] getRole_list() {
        return role_list;
    }

    public User setRole_list(UserRole[] role_list) {
        this.role_list = role_list;
        return this;
    }

    public UnionEmpExt getUnion_emp_ext() {
        return union_emp_ext;
    }

    public User setUnion_emp_ext(UnionEmpExt union_emp_ext) {
        this.union_emp_ext = union_emp_ext;
        return this;
    }

}
