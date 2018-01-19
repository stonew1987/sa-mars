package com.mars.manage.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoleMenuKey {
    private Long roleId;

    private Long menuId;

    public RoleMenuKey(Long roleId, Long menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

}