package com.mars.share.dto.admin;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class DeptDTO {

    private Long id;

    private Long parentId = 0L;

    @NotBlank(message = "部门名称不可以为空")
    @Length(min = 1, max = 30, message = "用户名长度需要在30个字以内")
    private String deptName;

    @NotBlank(message = "部门排序不能为空")
    private Long sort;

    @Length(max = 150, message = "备注的长度需要在255个字以内")
    private String remarks;

}