package com.mars.admin.service.impl;

import com.mars.admin.mapper.DeptMapper;
import com.mars.admin.model.Dept;
import com.mars.admin.service.DeptService;
import com.mars.share.dto.admin.DeptDTO;
import com.mars.share.enums.CodeEnum;
import com.mars.share.message.BaseResult;
import com.mars.share.utils.BeanValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptMapper deptMapper;


    @Override
    public BaseResult<Integer> insert(DeptDTO deptDTO) {
        Dept dept = new Dept();
        try {
            BeanValidator.check(deptDTO);
            BeanUtils.copyProperties(dept,deptDTO);
            deptMapper.insert(dept);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("保存部门信息dept = {}失败，message = {}", dept, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_CREATE_ERR);
        }
    }

    @Override
    public BaseResult<Integer> delete(Long id) {
        try {
            deptMapper.deleteByPrimaryKey(id);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("删除部门信息id= {}失败，message = {}", id, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_DELETE_ERR);
        }
    }

    @Override
    public BaseResult<Integer> update(DeptDTO deptDTO) {
        Dept dept = new Dept();
        try {
            BeanValidator.check(deptDTO);
            BeanUtils.copyProperties(dept,deptDTO);
            deptMapper.updateByPrimaryKeySelective(dept);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("修改部门信息dept = {}失败，message = {}", dept, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_UPDATE_ERR);
        }
    }
}
