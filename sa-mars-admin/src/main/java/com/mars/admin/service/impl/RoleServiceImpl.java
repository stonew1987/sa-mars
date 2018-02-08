package com.mars.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mars.admin.mapper.RoleMapper;
import com.mars.admin.model.Role;
import com.mars.admin.service.RoleService;
import com.mars.share.dto.admin.RoleDTO;
import com.mars.share.enums.CodeEnum;
import com.mars.share.message.BaseResult;
import com.mars.share.utils.BeanValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public BaseResult<PageInfo> listRolePage(RoleDTO roleDTO) {
        Role role = new Role();
        try {
            BeanValidator.check(roleDTO);
            BeanUtils.copyProperties(role,roleDTO);
            PageHelper.startPage(roleDTO.getPageNum(), roleDTO.getPageSize());
            List<Role> list = roleMapper.listRole(role);

            List<RoleDTO> roleDTOList = new ArrayList<>();
            list.stream().forEach(r -> {
                RoleDTO dto = new RoleDTO();
                BeanUtils.copyProperties(r, dto);
                roleDTOList.add(dto);
            });
            return BaseResult.createBySuccess(new PageInfo(list));
        } catch (Exception e){
            log.error("获取角色列表失败，参数-->roleDTO = {}，message = {}", roleDTO, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_UPDATE_ERR);
        }
    }
}
