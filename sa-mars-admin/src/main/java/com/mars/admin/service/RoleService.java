package com.mars.admin.service;


import com.mars.admin.dto.RoleDTO;
import com.mars.share.message.BaseResult;

public interface RoleService{

    /**
     * 角色添加
     * @param roleDTO
     * @return
     */
    BaseResult<Integer> insert(RoleDTO roleDTO);

    /**
     * 角色删除
     * @param id
     * @return
     */
    BaseResult<Integer> delete(Long id);

    /**
     * 根据主键更新角色信息
     * @param roleDTO
     * @return
     */
    BaseResult<Integer> update(RoleDTO roleDTO);
}
