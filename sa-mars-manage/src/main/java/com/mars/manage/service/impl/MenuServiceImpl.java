package com.mars.manage.service.impl;

import com.mars.manage.mapper.MenuMapper;
import com.mars.manage.model.Menu;
import com.mars.manage.service.MenuService;
import com.mars.share.common.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl{// extends BaseServiceImpl<Menu> implements MenuService{

    @Autowired
    private MenuMapper menuMapper;

}
