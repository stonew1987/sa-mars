package com.mars.manage.controller;

import com.github.pagehelper.PageInfo;
import com.mars.share.common.message.BaseResult;
import com.mars.share.manage.dto.UserDTO;
import com.mars.share.manage.service.UserService11;
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
public class UserController {


    @Autowired
    private UserService11 userService;

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    public BaseResult<UserDTO> getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public BaseResult<Integer> saveUser(UserDTO userDTO){
        BaseResult<Integer> baseResult = userService.addUser(userDTO);
        return baseResult;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public BaseResult<Integer> deleteUser(@PathVariable Long id){
        BaseResult<Integer> baseResult = userService.deleteUserById(id);
        return baseResult;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public BaseResult<PageInfo> getPageUser(UserDTO userDTO){
        BaseResult<PageInfo> baseResult = userService.getPageUser(userDTO);
        return baseResult;
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public BaseResult<Integer> updateUser(UserDTO userDTO){
        BaseResult<Integer> baseResult = userService.updateUser(userDTO);
        return baseResult;
    }

}
