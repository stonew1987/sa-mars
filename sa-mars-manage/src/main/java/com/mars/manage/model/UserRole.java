package com.mars.manage.model;

import java.util.Date;

public class UserRole extends UserRoleKey {
    private String remarks;

    private Long creatorId;

    private Long modifierId;

    private Date gmtCreated;

    private Date gmtModified;

    private String isDeleted;

    public UserRole(Long userId, Long roleId, String remarks, Long creatorId, Long modifierId, Date gmtCreated, Date gmtModified, String isDeleted) {
        super(userId, roleId);
        this.remarks = remarks;
        this.creatorId = creatorId;
        this.modifierId = modifierId;
        this.gmtCreated = gmtCreated;
        this.gmtModified = gmtModified;
        this.isDeleted = isDeleted;
    }

    public UserRole() {
        super();
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