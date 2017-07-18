package com.mars.manage.model;

public class RoleMenuKey {
    private Long roleId;

    private Long menuId;

    public RoleMenuKey(Long roleId, Long menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

    public RoleMenuKey() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}