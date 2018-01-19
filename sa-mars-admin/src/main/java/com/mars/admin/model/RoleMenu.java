package com.mars.admin.model;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@Builder
public class RoleMenu extends RoleMenuKey {
    private String remarks;

    private Long creatorId;

    private Long modifierId;

    private Date gmtCreated;

    private Date gmtModified;

    private String isDeleted;

}