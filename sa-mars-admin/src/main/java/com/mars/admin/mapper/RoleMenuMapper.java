package com.mars.admin.mapper;

import com.mars.admin.model.RoleMenu;

public interface RoleMenuMapper {

    int deleteByPrimaryKey();

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    RoleMenu selectByPrimaryKey();

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);
}