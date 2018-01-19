package com.mars.admin.service.impl;

import com.mars.admin.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl{

    @Autowired
    private MenuMapper menuMapper;

}
