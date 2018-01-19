package com.mars.manage.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRoleKey {
    private Long userId;

    private Long roleId;

    public UserRoleKey(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

}