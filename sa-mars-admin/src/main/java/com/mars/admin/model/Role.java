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
    private Long id;

    private Long orgId;

    private String roleName;

    private String roleCode;

    private String roleType;

    private String status;

    private String remarks;

    private Long creatorId;

    private Long modifierId;

    private Date gmtCreated;

    private Date gmtModified;

    private String isDeleted;

}