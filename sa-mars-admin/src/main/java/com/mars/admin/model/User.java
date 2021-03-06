package com.mars.admin.model;

import lombok.*;

import java.util.Date;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {

    private Long id;

    private Long deptId;

    private String loginName;

    private String password;

    private String userName;

    private String email;

    private String phone;

    private String loginIp;

    private Date lastLoginDate;

    private String loginFlag;

    private String remarks;

    private Long creator;

    private Long modifier;

    private Date gmtCreated;

    private Date gmtModified;

    private String isDeleted;

}