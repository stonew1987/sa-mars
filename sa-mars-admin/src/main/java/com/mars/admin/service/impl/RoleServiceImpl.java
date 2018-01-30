package com.mars.admin.service.impl;

import com.mars.admin.dto.RoleDTO;
import com.mars.admin.mapper.RoleMapper;
import com.mars.admin.model.Dept;
import com.mars.admin.model.Role;
import com.mars.admin.service.RoleService;
import com.mars.share.enums.CodeEnum;
import com.mars.share.message.BaseResult;
import com.mars.share.utils.BeanValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;


    @Override
    public BaseResult<Integer> insert(RoleDTO roleDTO) {
        Role role = new Role();
        try {
            BeanValidator.check(roleDTO);
            BeanUtils.copyProperties(role,roleDTO);
            roleMapper.insert(role);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("保存角色信息role = {}失败，message = {}", role, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_CREATE_ERR);
        }
    }

    @Override
    public BaseResult<Integer> delete(Long id) {
        try {
            roleMapper.deleteByPrimaryKey(id);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("删除角色信息id= {}失败，message = {}", id, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_DELETE_ERR);
        }
    }

    @Override
    public BaseResult<Integer> update(RoleDTO roleDTO) {
        Role role = new Role();
        try {
            BeanValidator.check(roleDTO);
            BeanUtils.copyProperties(role,roleDTO);
            roleMapper.updateByPrimaryKeySelective(role);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("修改部门信息role = {}失败，message = {}", role, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_UPDATE_ERR);
        }
    }
}
