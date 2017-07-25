package com.mars.generator.model;

import com.mars.share.common.model.BaseEntity;

/**
 * 业务表Entity
 * @author stonew
 * @data 2017-07-25 14:24
 **/

public class GenTable extends BaseEntity{

    private static final long serialVersionUID = 1L;

    private String name; 	// 名称
    private String comments;		// 描述
    private String className;		// 实体类名称
    private String parentTable;		// 关联父表
    private String parentTableFk;		// 关联父表外键

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getParentTable() {
        return parentTable;
    }

    public void setParentTable(String parentTable) {
        this.parentTable = parentTable;
    }

    public String getParentTableFk() {
        return parentTableFk;
    }

    public void setParentTableFk(String parentTableFk) {
        this.parentTableFk = parentTableFk;
    }
}
