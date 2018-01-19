package com.mars.manage.model;

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
public class Menu {
    private Long id;

    private Long parentId;

    private String menuName;

    private String href;

    private String icon;

    private String sort;

    private String remarks;

    private Long creatorId;

    private Long modifierId;

    private Date gmtCreated;

    private Date gmtModified;

    private String isDeleted;

}