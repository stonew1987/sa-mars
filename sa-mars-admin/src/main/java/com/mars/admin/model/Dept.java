package com.mars.admin.model;

import lombok.*;

import java.util.Date;

@Setter
@Getter
//生成无参的构造函数
@NoArgsConstructor
//为类提供一个全参的构造方法
@AllArgsConstructor
@ToString
@Builder
public class Dept {
    //主键
    private Long id;
    //上级部门id
    private Long parentId;
    //部门名称
    private String deptName;
    //部门层级
    private String level;
    //部门在当前层级下的顺序，由小到大
    private Long sort;
    //备注
    private String remarks;
    //创建人
    private Long creator;
    //修改人
    private Long modifier;
    //创建人
    private Date gmtCreated;
    //最后修改时间
    private Date gmtModified;
    //删除状态
    private String isDeleted;

}