package com.mars.manage.model;

import lombok.*;

import java.util.Date;


@Setter
@Getter
@Builder
public class UserRole extends UserRoleKey {
    private String remarks;

    private Long creatorId;

    private Long modifierId;

    private Date gmtCreated;

    private Date gmtModified;

    private String isDeleted;


}