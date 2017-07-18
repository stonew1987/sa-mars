package com.mars.manage.model;

import java.util.Date;

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

    public User(Long id, Long companyId, Long deptId, String loginName, String password, Long accountId, String userName, String email, String phone, String userType, String loginIp, Date lastLoginDate, String loginFlag, String remarks, Long creatorId, Long modifierId, Date gmtCreated, Date gmtModified, String isDeleted) {
        this.id = id;
        this.companyId = companyId;
        this.deptId = deptId;
        this.loginName = loginName;
        this.password = password;
        this.accountId = accountId;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.userType = userType;
        this.loginIp = loginIp;
        this.lastLoginDate = lastLoginDate;
        this.loginFlag = loginFlag;
        this.remarks = remarks;
        this.creatorId = creatorId;
        this.modifierId = modifierId;
        this.gmtCreated = gmtCreated;
        this.gmtModified = gmtModified;
        this.isDeleted = isDeleted;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag == null ? null : loginFlag.trim();
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