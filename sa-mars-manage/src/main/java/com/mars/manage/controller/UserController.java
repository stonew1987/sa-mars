package com.mars.manage.controller;

import com.mars.manage.model.User;
import com.mars.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理controller
 * @author stonew
 * @data 2017-07-19 11:33
 **/

@RestController
@RequestMapping(value = "/users/")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return userService.getUser();
    }

}
