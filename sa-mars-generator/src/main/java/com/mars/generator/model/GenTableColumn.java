package com.mars.generator.model;

import org.springframework.context.annotation.Bean;

/**
 * ${DESCRIPTION}
 *
 * @author stonew
 * @data 2017-07-25 14:54
 **/

public class GenTableColumn {

    private static final long serialVersionUID = 1L;
    private GenTable genTable;	// 归属表
    private String name; 		// 列名
    private String comments;	// 描述
    private String jdbcType;	// JDBC类型
    private String javaType;	// JAVA类型
    private String javaField;	// JAVA字段名
    private String isPk;		// 是否主键（1：主键）
    private String isNull;		// 是否可为空（1：可为空；0：不为空）
    private String isInsert;	// 是否为插入字段（1：插入字段）
    private String isEdit;		// 是否编辑字段（1：编辑字段）
    private String isList;		// 是否列表字段（1：列表字段）
    private String isQuery;		// 是否查询字段（1：查询字段）
    private String queryType;	// 查询方式（等于、不等于、大于、小于、范围、左LIKE、右LIKE、左右LIKE）
    private String showType;	// 字段生成方案（文本框、文本域、下拉框、复选框、单选框、字典选择、人员选择、部门选择、区域选择）
    private String dictType;	// 字典类型
    private Integer sort;		// 排序（升序）

}
