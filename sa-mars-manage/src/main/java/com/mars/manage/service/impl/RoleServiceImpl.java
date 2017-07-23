package com.mars.manage.service.impl;

import com.mars.manage.mapper.RoleMapper;
import com.mars.manage.model.Role;
import com.mars.manage.service.RoleService;
import com.mars.share.common.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;



}
