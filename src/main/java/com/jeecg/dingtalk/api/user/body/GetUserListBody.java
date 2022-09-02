package com.jeecg.dingtalk.api.user.body;

/**
 * 获取用户列表接口所需参数
 *
 * @author sunjianlei
 */
public class GetUserListBody {

    /**
     * 部门ID，根部门ID为1。必填
     */
    private int dept_id;

    /**
     * 分页查询的游标，最开始传0，后续传返回参数中的next_cursor值
     */
    private int cursor;

    /**
     * 分页大小
     */
    private int size;

    /**
     * 部门成员的排序规则，默认不传是按自定义排序（custom）：
     * <br>
     * entry_asc：代表按照进入部门的时间升序
     * <br>
     * entry_desc：代表按照进入部门的时间降序
     * <br>
     * modify_asc：代表按照部门信息修改时间升序
     * <br>
     * modify_desc：代表按照部门信息修改时间降序
     * <br>
     * custom：代表用户定义(未定义时按照拼音)排序
     */
    private String order_field;

    /**
     * 是否返回访问受限的员工。
     */
    private Boolean contain_access_limit;

    /**
     * 通讯录语言，取值。
     * <br>
     * zh_CN：中文（默认值）。
     * <br>
     * en_US：英文。
     */
    private String language;

    public GetUserListBody(int dept_id, int cursor, int size) {
        this.dept_id = dept_id;
        this.cursor = cursor;
        this.size = size;
    }

    public int getDept_id() {
        return dept_id;
    }

    public int getCursor() {
        return cursor;
    }

    public int getSize() {
        return size;
    }

    public String getOrder_field() {
        return order_field;
    }

    public GetUserListBody setOrder_field(String order_field) {
        this.order_field = order_field;
        return this;
    }

    public Boolean getContain_access_limit() {
        return contain_access_limit;
    }

    public GetUserListBody setContain_access_limit(Boolean contain_access_limit) {
        this.contain_access_limit = contain_access_limit;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public GetUserListBody setLanguage(String language) {
        this.language = language;
        return this;
    }

}
