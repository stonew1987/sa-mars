package com.mars.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mars.admin.mapper.RoleMapper;
import com.mars.admin.model.Role;
import com.mars.admin.service.RoleService;
import com.mars.share.dto.admin.RoleDTO;
import com.mars.share.enums.CodeEnum;
import com.mars.share.enums.YesNoEnum;
import com.mars.share.exception.ParamException;
import com.mars.share.message.BaseResult;
import com.mars.share.utils.BeanValidator;
import com.mars.share.vo.admin.RoleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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
            BeanUtils.copyProperties(roleDTO,role);
            role.setCreator(1L);
            role.setModifier(1L);
            role.setGmtCreated(new Date());
            role.setGmtModified(new Date());
            role.setIsDeleted(YesNoEnum.No.getCode());
            roleMapper.insert(role);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("保存角色信息roleDTO = {}失败，message = {}", roleDTO, e.getMessage(), e);
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
            BeanUtils.copyProperties(roleDTO,role);
            roleMapper.updateByPrimaryKeySelective(role);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("修改部门信息role = {}失败，message = {}", role, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_UPDATE_ERR);
        }
    }

    @Override
    public BaseResult<PageInfo> listRolePage(RoleVO roleVO) {
        Role role = new Role();
        try {
            BeanValidator.check(roleVO);
            BeanUtils.copyProperties(role,roleVO);
            PageHelper.startPage(roleVO.getPageNum(), roleVO.getPageSize());
            List<Role> list = roleMapper.listRole(role);

            List<RoleVO> roleVOList = new ArrayList<>();
            list.stream().forEach(r -> {
                RoleVO vo = new RoleVO();
                BeanUtils.copyProperties(r, vo);
                roleVOList.add(vo);
            });
            return BaseResult.createBySuccess(new PageInfo(roleVOList));
        } catch (ParamException paramException){
            return BaseResult.createByError(CodeEnum.CMN_NOTEMPTY_ERR);
        }catch (Exception e){
            log.error("获取角色列表失败，参数-->roleDTO = {}，message = {}", roleVO, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_QUERY_ERR);
        }
    }

    /**
     * 检查角色名是否存在
     * @param roleName  角色名称
     * @param roleCode  角色编码
     * @return
     */
    private boolean checkExist(String roleName, String roleCode){
        return roleMapper.countRole(roleName, roleCode) > 0;
    }
}
