package com.mars.manage.tools;

import com.mars.manage.model.User;
import com.mars.share.manage.dto.UserDTO;

public class UserChange {
    public static User DTOToUser(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId());
        user.setCompanyId(userDTO.getCompanyId());
        user.setDeptId(userDTO.getDeptId());
        user.setLoginName(userDTO.getLoginName());
        user.setPassword(userDTO.getPassword());
        user.setAccountId(userDTO.getAccountId());
        user.setUserName(userDTO.getUserName());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setUserType(userDTO.getUserType());
        user.setLoginIp(userDTO.getLoginIp());
        user.setLastLoginDate(userDTO.getLastLoginDate());
        user.setLoginFlag(userDTO.getLoginFlag());
        user.setRemarks(userDTO.getRemarks());
        user.setCreatorId(userDTO.getCreatorId());
        user.setModifierId(userDTO.getModifierId());
        user.setGmtCreated(userDTO.getGmtCreated());
        user.setGmtModified(userDTO.getGmtModified());
        user.setIsDeleted(userDTO.getIsDeleted());
        return user;
    }


    public static UserDTO UserToDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setCompanyId(user.getCompanyId());
        userDTO.setDeptId(user.getDeptId());
        userDTO.setLoginName(user.getLoginName());
        userDTO.setPassword(user.getPassword());
        userDTO.setAccountId(user.getAccountId());
        userDTO.setUserName(user.getUserName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhone(user.getPhone());
        userDTO.setUserType(user.getUserType());
        userDTO.setLoginIp(user.getLoginIp());
        userDTO.setLastLoginDate(user.getLastLoginDate());
        userDTO.setLoginFlag(user.getLoginFlag());
        userDTO.setRemarks(user.getRemarks());
        userDTO.setCreatorId(user.getCreatorId());
        userDTO.setModifierId(user.getModifierId());
        userDTO.setGmtCreated(user.getGmtCreated());
        userDTO.setGmtModified(user.getGmtModified());
        userDTO.setIsDeleted(user.getIsDeleted());
        return userDTO;
    }

}
