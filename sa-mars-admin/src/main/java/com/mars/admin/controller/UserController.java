package com.mars.admin.controller;

import com.github.pagehelper.PageInfo;
import com.mars.admin.service.UserService;
import com.mars.share.dto.admin.UserDTO;
import com.mars.share.message.BaseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户管理controller
 * @author stonew
 * @data 2017-07-19 11:33
 **/

@RestController
@RequestMapping("/admin/users")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public BaseResult<UserDTO> getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public BaseResult<Integer> insertUser(@RequestBody UserDTO userDTO){
        BaseResult<Integer> baseResult = userService.insertUser(userDTO);
        return baseResult;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseResult<Integer> deleteUser(@PathVariable Long id){
        BaseResult<Integer> baseResult = userService.deleteUser(id);
        return baseResult;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public BaseResult<PageInfo> listUserPage(UserDTO userDTO){
        BaseResult<PageInfo> baseResult = userService.listUserPage(userDTO);
        return baseResult;
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public BaseResult<Integer> updateUser(@RequestBody UserDTO userDTO){
        BaseResult<Integer> baseResult = userService.updateUser(userDTO);
        return baseResult;
    }

}
