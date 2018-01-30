package com.mars.admin.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.mars.admin.dto.DeptDTO;
import com.mars.admin.dto.UserDTO;
import com.mars.admin.service.DeptService;
import com.mars.admin.service.UserService;
import com.mars.share.message.BaseResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 部门管理controller
 * @author stonew
 * @data 2017-07-19 11:33
 **/

@RestController
@RequestMapping(value = "/admin")
public class DeptController {

    @Resource
    private DeptService deptService;

    /**
     * 部门添加
     * @param deptDTO
     * @return
     */
    @RequestMapping(value = "/depts", method = RequestMethod.POST)
    public BaseResult<Integer> insertUser(DeptDTO deptDTO){
        BaseResult<Integer> baseResult = deptService.insert(deptDTO);
        return baseResult;
    }

    /**
     * 根据部门ID删除部门
     * @param id
     * @return
     */
    @RequestMapping(value = "/depts/{id}", method = RequestMethod.DELETE)
    public BaseResult<Integer> deleteUser(@PathVariable Long id){
        BaseResult<Integer> baseResult = deptService.delete(id);
        return baseResult;
    }


    /**
     * 根据部门id更新部门信息
     * @param deptDTO
     * @return
     */
    @RequestMapping(value = "/depts", method = RequestMethod.PUT)
    public BaseResult<Integer> updateUser(DeptDTO deptDTO){
        BaseResult<Integer> baseResult = deptService.update(deptDTO);
        return baseResult;
    }

}
