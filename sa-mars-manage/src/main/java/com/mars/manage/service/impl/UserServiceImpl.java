package com.mars.manage.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mars.manage.mapper.UserMapper;
import com.mars.manage.model.User;
import com.mars.manage.service.UserService;
import com.mars.manage.tools.UserChange;
import com.mars.share.common.message.BaseResult;
import com.mars.share.manage.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * UserService实现
 * @author stonew
 * @data 2017-07-19 11:35
 **/

@Service
public class UserServiceImpl implements UserService {

   @Autowired
    private UserMapper userMapper;


    @Override
    public BaseResult<UserDTO> getUserById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        UserDTO userDTO = UserChange.UserToDTO(user);
        return BaseResult.createBySuccess(userDTO);
    }

    @Override
    public BaseResult<List<UserDTO>> getUserList(UserDTO userDTO) {
        List<UserDTO> userDTOList = new ArrayList<>();
        List<User> list = userMapper.selectUserList(UserChange.DTOToUser(userDTO));
        if (null != list && list.size() > 0){
            for (User user : list){
                UserDTO dto = UserChange.UserToDTO(user);
                userDTOList.add(dto);
            }
        }
        return BaseResult.createBySuccess(userDTOList);
    }

    @Override
    public BaseResult<PageInfo> getPageUser(UserDTO userDTO) {
        PageHelper.startPage(userDTO.getPageNo(), userDTO.getPageSize());
        List<UserDTO> userDTOList = new ArrayList<>();
        List<User> list = userMapper.selectUserList(UserChange.DTOToUser(userDTO));
        if (null != list && list.size() > 0){
            for (User user : list){
                UserDTO dto = UserChange.UserToDTO(user);
                userDTOList.add(dto);
            }
        }
        PageInfo pageInfo = new PageInfo(userDTOList);
        return BaseResult.createBySuccess(pageInfo);
    }

    @Override
    public BaseResult<Integer> addUser(UserDTO userDTO) {
        int i = userMapper.insert(UserChange.DTOToUser(userDTO));
        return BaseResult.createBySuccess(i);
    }

    @Override
    public BaseResult<Integer> updateUser(UserDTO userDTO) {
        int i = userMapper.updateByPrimaryKey(UserChange.DTOToUser(userDTO));
        return BaseResult.createBySuccess(i);
    }

    @Override
    public BaseResult<Integer> deleteUserById(Long id) {
        int i = userMapper.deleteByPrimaryKey(id);
        return BaseResult.createBySuccess(i);
    }
}
