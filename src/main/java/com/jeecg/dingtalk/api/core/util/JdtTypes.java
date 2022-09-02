package com.jeecg.dingtalk.api.core.util;

import com.alibaba.fastjson.TypeReference;
import com.jeecg.dingtalk.api.core.vo.PageResult;
import com.jeecg.dingtalk.api.department.vo.Department;
import com.jeecg.dingtalk.api.user.vo.User;

import java.lang.reflect.Type;
import java.util.List;

/**
 * 用于JSON泛型转换，定义各种实际类型
 *
 * @author sunjianlei
 */
public class JdtTypes {

    public final static Type PageResult_User = new TypeReference<PageResult<User>>() {
    }.getType();

    public final static Type PageResult_Department = new TypeReference<PageResult<Department>>() {
    }.getType();

    public final static Type List_String = new TypeReference<List<String>>() {
    }.getType();

    public final static Type List_Department = new TypeReference<List<Department>>() {
    }.getType();

}
