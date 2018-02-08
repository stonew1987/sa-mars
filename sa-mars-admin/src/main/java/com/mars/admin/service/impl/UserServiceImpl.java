package com.mars.admin.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mars.admin.mapper.UserMapper;
import com.mars.admin.model.User;
import com.mars.admin.service.UserService;
import com.mars.share.dto.admin.UserDTO;
import com.mars.share.enums.CodeEnum;
import com.mars.share.enums.YesNoEnum;
import com.mars.share.message.BaseResult;
import com.mars.share.utils.BeanValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
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
            BeanValidator.check(userDTO);
            BeanUtils.copyProperties(user,userDTO);
            user.setCreator(1L);
            user.setModifier(1L);
            user.setGmtCreated(new Date());
            user.setGmtModified(new Date());
            user.setIsDeleted(YesNoEnum.No.getCode());
            userMapper.insert(user);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("保存用户信息userDTO = {}失败，message = {}", userDTO, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_CREATE_ERR);
        }
    }

    @Override
    public BaseResult<Integer> deleteUser(Long id) {
        try {
            userMapper.deleteByPrimaryKey(id);
            return BaseResult.createBySuccess();
        } catch (Exception e){
            log.error("删除用户信息id= {}失败，message = {}", id, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_DELETE_ERR);
        }
    }

    @Override
    public BaseResult<PageInfo> listUserPage(UserDTO userDTO) {
        User user = new User();
        try {
            BeanUtils.copyProperties(user,userDTO);
            PageHelper.startPage(userDTO.getPageNum(), userDTO.getPageSize());

            List<User> list = userMapper.selectUserList(user);
            List<UserDTO> userDTOList = new ArrayList<>();
            list.stream().forEach(u -> {
                UserDTO dto = new UserDTO();
                BeanUtils.copyProperties(u,dto);
                userDTOList.add(dto);
            });
            PageInfo pageInfo = new PageInfo(userDTOList);
            return BaseResult.createBySuccess(pageInfo);
        } catch (Exception e){
            log.error("查询用户分页信息userDTO = {}失败，message = {}", userDTO, e.getMessage(), e);
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
            log.error("根据主键id = {} 查询用户信息失败，message = {}", id, e.getMessage(), e);
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
            log.error("根据用户名username = {}查询用户信息失败，message = {}", username, e.getMessage(), e);
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
            log.error("修改用户信息userDTO = {}失败，message = {}", userDTO, e.getMessage(), e);
            return BaseResult.createByError(CodeEnum.CMN_UPDATE_ERR);
        }
    }
}
