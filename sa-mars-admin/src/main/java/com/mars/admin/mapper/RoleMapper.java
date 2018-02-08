package com.mars.admin.mapper;

import com.mars.admin.model.Role;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    /**
     * 查询角色列表
     * @param role
     * @return
     */
    List<Role> listRole(Role role);
}