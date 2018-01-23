package com.mars.admin.mapper;

import com.mars.admin.model.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey();

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey();

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}