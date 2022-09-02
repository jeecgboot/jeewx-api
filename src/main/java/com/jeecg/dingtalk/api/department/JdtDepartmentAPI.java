package com.jeecg.dingtalk.api.department;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jeecg.dingtalk.api.core.response.Response;
import com.jeecg.dingtalk.api.core.util.ApiUrls;
import com.jeecg.dingtalk.api.core.util.HttpUtil;
import com.jeecg.dingtalk.api.core.util.JdtTypes;
import com.jeecg.dingtalk.api.department.vo.Department;
import com.jeecg.dingtalk.api.department.vo.DeptParentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 钉钉部门接口
 *
 * @author sunjianlei
 */
public class JdtDepartmentAPI {

    private static final Logger logger = LoggerFactory.getLogger(JdtDepartmentAPI.class);

    /**
     * 创建部门
     * <br>
     * https://developers.dingtalk.com/document/app/create-a-department-v2
     *
     * @param department  部门实例
     * @param accessToken 有效的access_token
     * @return Response&lt;String&gt 成功返回dept_id
     */
    public static Response<Integer> create(Department department, String accessToken) {
        String url = ApiUrls.get(ApiUrls.DEPART_CREATE, accessToken);
        Response<JSONObject> originResponse = HttpUtil.post(url, JSON.toJSONString(department));
        Response<Integer> response = new Response<>(originResponse);
        if (response.isSuccess()) {
            // 将常用的dept_id直接返回（实际上也就只有这一个返回参数）
            Integer dept_id = originResponse.getResult().getInteger("dept_id");
            response.setResult(dept_id);
        }
        logger.info("[DEPART_CREATE] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

    /**
     * 更新部门信息
     * <br>
     * https://developers.dingtalk.com/document/app/update-a-department-v2
     *
     * @param department  部门实例
     * @param accessToken 有效的access_token
     * @return Response&lt;JSONObject&gt
     */
    public static Response<JSONObject> update(Department department, String accessToken) {
        String url = ApiUrls.get(ApiUrls.DEPART_UPDATE, accessToken);
        Response<JSONObject> response = HttpUtil.post(url, JSON.toJSONString(department));
        logger.info("[DEPART_UPDATE] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

    /**
     * 根据部门ID删除指定部门
     * <br>
     * https://developers.dingtalk.com/document/app/delete-a-department-v2
     *
     * @param dept_id     部门id
     * @param accessToken 有效的access_token
     * @return Response&lt;JSONObject&gt
     */
    public static Response<JSONObject> delete(int dept_id, String accessToken) {
        String url = ApiUrls.get(ApiUrls.DEPART_DELETE, accessToken);
        JSONObject body = new JSONObject();
        body.put("dept_id", dept_id);
        Response<JSONObject> response = HttpUtil.post(url, body.toJSONString());
        logger.info("[DEPART_DELETE] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

    /**
     * 伪批量删除部门（for循环调接口）
     *
     * @param deptIds     部门ID列表
     * @param accessToken 有效的access_token
     * @return List&lt;Response&lt;JSONObject&gt&gt
     */
    public static List<Response<JSONObject>> batchDeletePseudo(Collection<Integer> deptIds, String accessToken) {
        List<Response<JSONObject>> list = new ArrayList<>();
        for (Integer deptId : deptIds) {
            list.add(JdtDepartmentAPI.delete(deptId, accessToken));
        }
        return list;
    }

    /**
     * 获取根部门下的子部门列表（不包含子部门的子部门）
     * <br>
     * https://developers.dingtalk.com/document/app/obtain-the-department-list-v2
     *
     * @param accessToken 有效的access_token
     * @return Response&lt;List&lt;Department&gt;&gt;
     */
    public static Response<List<Department>> listByRoot(String accessToken) {
        String url = ApiUrls.get(ApiUrls.DEPART_LIST_SUB, accessToken);
        Response<List<Department>> response = HttpUtil.post(url, "", JdtTypes.List_Department);
        logger.info("[DEPART_LIST_ROOT_SUB] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

    /**
     * 根据父ID获取子部门列表（不包含子部门的子部门）
     * <br>
     * https://developers.dingtalk.com/document/app/obtain-the-department-list-v2
     *
     * @param dept_id     父部门ID
     * @param accessToken 有效的access_token
     * @return Response&lt;List&lt;Department&gt;&gt;
     */
    public static Response<List<Department>> listByParentId(int dept_id, String accessToken) {
        String url = ApiUrls.get(ApiUrls.DEPART_LIST_SUB, accessToken);
        JSONObject body = new JSONObject();
        body.put("dept_id", dept_id);
        Response<List<Department>> response = HttpUtil.post(url, body.toJSONString(), JdtTypes.List_Department);
        logger.info("[DEPART_LIST_SUB_BY_PARENT_ID] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

    /**
     * 根据dept_id获取部门详情
     * <br>
     * https://developers.dingtalk.com/document/app/query-department-details0-v2
     *
     * @param dept_id     部门id
     * @param accessToken 有效的access_token
     * @return Response&lt;Department&gt;
     */
    public static Response<Department> getDepartmentById(int dept_id, String accessToken) {
        String url = ApiUrls.get(ApiUrls.DEPART_GET, accessToken);
        JSONObject body = new JSONObject();
        body.put("dept_id", dept_id);
        Response<Department> response = HttpUtil.post(url, body.toJSONString(), Department.class);
        logger.info("[DEPART_GET_BY_ID] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

    /**
     * 获取子部门ID列表
     * <br>
     * https://developers.dingtalk.com/document/app/obtain-a-sub-department-id-list-v2
     *
     * @param dept_id     部门id
     * @param accessToken 有效的access_token
     * @return Response&lt;List&lt;Integer&gt;&gt; 成功返回子部门id列表
     */
    public static Response<List<Integer>> getListSubId(int dept_id, String accessToken) {
        String url = ApiUrls.get(ApiUrls.DEPART_GET_LIST_SUB_ID, accessToken);
        JSONObject body = new JSONObject();
        body.put("dept_id", dept_id);
        Response<JSONObject> originResponse = HttpUtil.post(url, body.toJSONString());
        Response<List<Integer>> response = new Response<>(originResponse);
        if (response.isSuccess()) {
            List<Integer> dept_id_list = originResponse.getResult().getJSONArray("dept_id_list").toJavaList(Integer.class);
            response.setResult(dept_id_list);
        }
        logger.info("[DEPART_GET_LIST_SUB_ID] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

    /**
     * 获取指定用户的所有父部门列表
     * <br>
     * https://developers.dingtalk.com/document/app/queries-the-list-of-all-parent-departments-of-a-user
     *
     * @param userid      用户id
     * @param accessToken 有效的access_token
     * @return Response&lt;List&lt;DeptParentResponse&gt;&gt; 成功返回父部门id列表
     */
    public static Response<List<DeptParentResponse>> getListParentByUser(String userid, String accessToken) {
        String url = ApiUrls.get(ApiUrls.DEPART_GET_LIST_PARENT_BY_USER, accessToken);
        JSONObject body = new JSONObject();
        body.put("userid", userid);
        Response<JSONObject> originResponse = HttpUtil.post(url, body.toJSONString());
        Response<List<DeptParentResponse>> response = new Response<>(originResponse);
        if (response.isSuccess()) {
            List<DeptParentResponse> parent_list = originResponse.getResult().getJSONArray("parent_list").toJavaList(DeptParentResponse.class);
            response.setResult(parent_list);
        }
        logger.info("[DEPART_GET_LIST_PARENT_BY_USER] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

    /**
     * 获取指定部门的所有父部门列表
     * <br>
     * https://developers.dingtalk.com/document/app/query-the-list-of-all-parent-departments-of-a-department
     *
     * @param dept_id     部门id
     * @param accessToken 有效的access_token
     * @return Response&lt;List&lt;Integer&gt;&gt; 成功返回父部门id列表
     */
    public static Response<List<Integer>> getListParentByDept(String dept_id, String accessToken) {
        String url = ApiUrls.get(ApiUrls.DEPART_GET_LIST_PARENT_BY_DEPT, accessToken);
        JSONObject body = new JSONObject();
        body.put("dept_id", dept_id);
        Response<JSONObject> originResponse = HttpUtil.post(url, body.toJSONString());
        Response<List<Integer>> response = new Response<>(originResponse);
        if (response.isSuccess()) {
            List<Integer> parent_id_list = originResponse.getResult().getJSONArray("parent_id_list").toJavaList(Integer.class);
            response.setResult(parent_id_list);
        }
        logger.info("[DEPART_GET_LIST_PARENT_BY_DEPT] response:{}", new Object[]{JSON.toJSONString(response)});
        return response;
    }

    /**
     * 非官方API接口：获取钉钉的所有部门，平铺返回，不关心失败情况
     *
     * @param accessToken 有效的access_token
     * @return List&lt;Department&gt;
     */
    public static List<Department> listAll(String accessToken) {
        List<Department> all = new ArrayList<>();
        int topDepId = 1;
        // 先查出来顶级的部门
        Response<Department> response = JdtDepartmentAPI.getDepartmentById(topDepId, accessToken);
        if (response.isSuccess()) {
            all.add(response.getResult());
            JdtDepartmentAPI.listAllGetChildren(topDepId, accessToken, all);
        }
        return all;
    }

    /**
     * 非官方API接口：获取钉钉的所有部门，平铺返回，返回失败结果
     *
     * @param accessToken 有效的access_token
     * @return List&lt;Response&lt;Department&gt;&gt;
     */
    public static List<Response<Department>> listAllResponse(String accessToken) {
        List<Response<Department>> res = new ArrayList<>();
        List<Department> all = new ArrayList<>();
        int topDepId = 1;
        // 先查出来顶级的部门
        Response<Department> response = JdtDepartmentAPI.getDepartmentById(topDepId, accessToken);
        res.add(response);
        if (response.isSuccess()) {
            all.add(response.getResult());
            JdtDepartmentAPI.listAllGetChildren(topDepId, accessToken, all, res);
        }
        return res;
    }

    private static void listAllGetChildren(int parentDepId, String accessToken, List<Department> all) {
        JdtDepartmentAPI.listAllGetChildren(parentDepId, accessToken, all, null);
    }

    private static void listAllGetChildren(int parentDepId, String accessToken, List<Department> all, List<Response<Department>> res) {
        Response<List<Department>> response = JdtDepartmentAPI.listByParentId(parentDepId, accessToken);
        if (response.isSuccess()) {
            List<Department> departments = response.getResult();
            if (departments.size() != 0) {
                all.addAll(departments);
                for (Department department : departments) {
                    if (res != null) {
                        res.add(new Response<>(response, department));
                    }
                    JdtDepartmentAPI.listAllGetChildren(department.getDept_id(), accessToken, all, res);
                }
            }
        } else if (res != null) {
            res.add(new Response<>(response));
        }
    }

}
