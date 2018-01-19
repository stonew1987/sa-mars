package com.mars.admin.model;

import lombok.*;

import java.util.Date;


@Setter
@Getter
@Builder
public class UserRole{
    private String remarks;

    private Long creatorId;

    private Long modifierId;

    private Date gmtCreated;

    private Date gmtModified;

    private String isDeleted;


}