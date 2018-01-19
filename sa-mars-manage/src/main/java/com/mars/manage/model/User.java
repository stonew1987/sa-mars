package com.mars.manage.model;

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

    private Long companyId;

    private Long deptId;

    private String loginName;

    private String password;

    private Long accountId;

    private String userName;

    private String email;

    private String phone;

    private String userType;

    private String loginIp;

    private Date lastLoginDate;

    private String loginFlag;

    private String remarks;

    private Long creatorId;

    private Long modifierId;

    private Date gmtCreated;

    private Date gmtModified;

    private String isDeleted;

}