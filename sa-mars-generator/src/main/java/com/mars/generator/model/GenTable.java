package com.mars.generator.model;

import com.google.common.collect.Lists;
import com.mars.share.common.model.BaseEntity;

import java.util.List;

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

    private List<GenTableColumn> columnList = Lists.newArrayList();	// 表列

    private String nameLike; 	// 按名称模糊查询

    private List<String> pkList; // 当前表主键列表

    private GenTable parent;	// 父表对象
    private List<GenTable> childList = Lists.newArrayList();	// 子表列表

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

    public List<GenTableColumn> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<GenTableColumn> columnList) {
        this.columnList = columnList;
    }

    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public List<String> getPkList() {
        return pkList;
    }

    public void setPkList(List<String> pkList) {
        this.pkList = pkList;
    }

    public GenTable getParent() {
        return parent;
    }

    public void setParent(GenTable parent) {
        this.parent = parent;
    }

    public List<GenTable> getChildList() {
        return childList;
    }

    public void setChildList(List<GenTable> childList) {
        this.childList = childList;
    }

}
