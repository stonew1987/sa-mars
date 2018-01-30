package com.mars.admin.model;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Role {

    //角色主键
    private Long id;
    //角色名称
    private String roleName;
    //角色编码
    private String roleCode;
    //角色类型
    private String roleType;
    //角色状态
    private String status;
    //备注
    private String remarks;
    //创建人
    private Long creator;
    //修改人
    private Long modifier;
    //创建人
    private Date gmtCreated;
    //最后修改时间
    private Date gmtModified;
    //删除状态
    private String isDeleted;

}