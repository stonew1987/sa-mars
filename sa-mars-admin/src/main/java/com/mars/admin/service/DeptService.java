package com.mars.admin.service;

import com.mars.admin.dto.DeptDTO;
import com.mars.admin.dto.UserDTO;
import com.mars.share.message.BaseResult;

/**
 * 部门管理service
 */

public interface DeptService {

    /**
     * 部门添加
     * @param deptDTO
     * @return
     */
    BaseResult<Integer> insert(DeptDTO deptDTO);

    /**
     * 部门删除
     * @param id
     * @return
     */
    BaseResult<Integer> delete(Long id);

    /**
     * 根据主键更新部门信息
     * @param deptDTO
     * @return
     */
    BaseResult<Integer> update(DeptDTO deptDTO);

}
