package com.mars.admin.controller;

import com.github.pagehelper.PageInfo;
import com.mars.admin.service.RoleService;
import com.mars.share.dto.admin.RoleDTO;
import com.mars.share.message.BaseResult;
import com.mars.share.vo.admin.RoleVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 角色管理controller
 * @author stonew
 * @data 2017-07-19 11:33
 **/

@RestController
@RequestMapping(value = "/admin/roles")
public class RoleController {

    @Resource
    private RoleService roleService;

    /**
     * 角色添加
     * @param roleDTO
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public BaseResult<Integer> insertRole(@RequestBody RoleDTO roleDTO){
        BaseResult<Integer> baseResult = roleService.insert(roleDTO);
        return baseResult;
    }

    /**
     * 根据角色ID删除角色
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseResult<Integer> deleteRole(@PathVariable Long id){
        BaseResult<Integer> baseResult = roleService.delete(id);
        return baseResult;
    }


    /**
     * 根据角色id更新角色信息
     * @param roleDTO
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public BaseResult<Integer> updateRole(@RequestBody RoleDTO roleDTO){
        BaseResult<Integer> baseResult = roleService.update(roleDTO);
        return baseResult;
    }

    /**
     * 分页查询角色信息
     * @param roleVO
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public BaseResult<PageInfo> listRolePage(RoleVO roleVO){
        BaseResult<PageInfo> baseResult = roleService.listRolePage(roleVO);
        return baseResult;
    }

}
