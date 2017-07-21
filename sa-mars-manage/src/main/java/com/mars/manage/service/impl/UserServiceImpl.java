package com.mars.manage.service.impl;

import com.mars.manage.mapper.UserMapper;
import com.mars.manage.model.User;
import com.mars.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService实现
 * @author stonew
 * @data 2017-07-19 11:35
 **/

@Service
public class UserServiceImpl implements UserService{

   @Autowired
    private UserMapper userMapper;


    @Override
    public User getUser() {
        User user = userMapper.selectByPrimaryKey(1L);
        return user;
    }
}
