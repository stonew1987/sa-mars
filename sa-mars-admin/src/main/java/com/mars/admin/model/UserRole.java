package com.mars.admin.model;

import lombok.*;

import java.util.Date;


@Setter
@Getter
@Builder
public class UserRole{

    private Long userId;

    private Long roleId;

    private String remarks;

    private Long creator;

    private Long modifier;

    private Date gmtCreated;

    private Date gmtModified;

    private String isDeleted;


}