package com.mars.admin.mapper;

import com.mars.admin.model.Role;
import org.apache.ibatis.annotations.Param;

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


    /**
     * 根据角色名称or角色编码计数角色数量
     * @param roleName  角色名称
     * @param roleCode  角色编码
     * @return
     */
    int countRole(@Param("roleName") String roleName, @Param("roleCode") String roleCode);
}