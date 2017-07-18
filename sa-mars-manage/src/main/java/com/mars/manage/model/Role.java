package com.mars.manage.model;

import java.util.Date;

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

    public Role(Long id, Long orgId, String roleName, String roleCode, String roleType, String status, String remarks, Long creatorId, Long modifierId, Date gmtCreated, Date gmtModified, String isDeleted) {
        this.id = id;
        this.orgId = orgId;
        this.roleName = roleName;
        this.roleCode = roleCode;
        this.roleType = roleType;
        this.status = status;
        this.remarks = remarks;
        this.creatorId = creatorId;
        this.modifierId = modifierId;
        this.gmtCreated = gmtCreated;
        this.gmtModified = gmtModified;
        this.isDeleted = isDeleted;
    }

    public Role() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }
}