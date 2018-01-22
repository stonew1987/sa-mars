package com.mars.admin.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Date;


@Setter
@Getter
@ToString
public class UserDTO {

    private Long id;

    @NotNull(message = "必须提供用户所在的公司")
    private Long companyId;

    @NotNull(message = "必须提供用户所在的部门")
    private Long deptId;

    @NotBlank(message = "用户名不可以为空")
    @Length(min = 1, max = 20, message = "用户名长度需要在20个字以内")
    private String loginName;

    @NotBlank(message = "用户名不可以为空")
    @Length(min = 1, max = 30, message = "用户名长度需要在30个字以内")
    private String email;

    private String phone;

    private String userType;

    private String loginFlag;

    private String remarks;

}