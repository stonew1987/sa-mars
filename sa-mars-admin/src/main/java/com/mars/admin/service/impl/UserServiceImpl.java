package com.mars.admin.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mars.admin.dto.UserDTO;
import com.mars.admin.mapper.UserMapper;
import com.mars.admin.model.User;
import com.mars.admin.service.UserService;
import com.mars.share.enums.CodeEnum;
import com.mars.share.message.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * UserService实现
 * @author stonew
 * @data 2017-07-19 11:35
 **/

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public BaseResult<Integer> insertUser(UserDTO userDTO) {
        User user = new User();
        try {
            BeanUtils.copyProperties(user,userDTO);
            userMapper.insert(user);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("保存用户信息userDTO = {}失败，message = {}", userDTO, e.getMessage());
            return BaseResult.createByError(CodeEnum.CMN_CREATE_ERR);
        }
    }

    @Override
    public BaseResult<Integer> deleteUser(Long id) {
        try {
            userMapper.deleteByPrimaryKey(id);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("删除用户信息id= {}失败，message = {}", id, e.getMessage());
            return BaseResult.createByError(CodeEnum.CMN_DELETE_ERR);
        }
    }

    @Override
    public BaseResult<PageInfo> listUserPage(UserDTO userDTO, Page page) {
        User user = new User();
        try {
            BeanUtils.copyProperties(user,userDTO);
            List<User> list = userMapper.selectUserList(user);
            PageHelper.startPage(page.getPageNum(), page.getPageSize());
            PageInfo pageInfo = new PageInfo(list);
            return BaseResult.createBySuccess(pageInfo);
        } catch (Exception e){
            log.error("查询用户分页信息userDTO = {}失败，message = {}", userDTO, e.getMessage());
            return BaseResult.createByError(CodeEnum.CMN_QUERY_ERR);
        }
    }

    @Override
    public BaseResult<UserDTO> getUserById(Long id) {
        UserDTO userVo = new UserDTO();
        try {
            User user = userMapper.selectByPrimaryKey(id);
            BeanUtils.copyProperties(userVo,user);
            return BaseResult.createBySuccess(userVo);
        } catch (Exception e){
            log.error("根据主键id = {} 查询用户信息失败，message = {}", id, e.getMessage());
            return BaseResult.createByError(CodeEnum.CMN_QUERY_ERR);
        }
    }

    @Override
    public BaseResult<UserDTO> getUserByUserName(String username) {
        UserDTO userDTO = new UserDTO();
        try {
            User user = userMapper.selectByUserName(username);
            BeanUtils.copyProperties(userDTO,user);
            return BaseResult.createBySuccess(userDTO);
        } catch (Exception e){
            log.error("根据用户名username = {}查询用户信息失败，message = {}", username, e.getMessage());
            return BaseResult.createByError(CodeEnum.CMN_QUERY_ERR);
        }
    }

    @Override
    public BaseResult<Integer> updateUser(UserDTO userDTO) {
        User user = new User();
        try {
            BeanUtils.copyProperties(userDTO,user);
            userMapper.updateByPrimaryKeySelective(user);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("修改用户信息userDTO = {}失败，message = {}", userDTO, e.getMessage());
            return BaseResult.createByError(CodeEnum.CMN_UPDATE_ERR);
        }
    }
}
