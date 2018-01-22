package com.mars.admin.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.mars.admin.dto.UserDTO;
import com.mars.share.message.BaseResult;

/**
 * 用户service
 * @author stonew
 * @data 2017-07-19 11:34
 **/

public interface UserService {

    /**
     * 用户添加
     * @param userDTO
     * @return
     */
    BaseResult<Integer> insertUser(UserDTO userDTO);

    /**
     * 用户删除
     * @param id
     * @return
     */
    BaseResult<Integer> deleteUser(Long id);

    /**
     * 获取用户分页列表
     * @param userDTO
     * @return
     */
    BaseResult<PageInfo> listUserPage(UserDTO userDTO, Page page);

    /**
     * 根据主键更新用户信息
     * @param userDTO
     * @return
     */
    BaseResult<Integer> updateUser(UserDTO userDTO);

    /**
     * 根据主键查询用户信息
     * @param id
     * @return
     */
    BaseResult<UserDTO> getUserById(Long id);

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    BaseResult<UserDTO> getUserByUserName(String username);


}
