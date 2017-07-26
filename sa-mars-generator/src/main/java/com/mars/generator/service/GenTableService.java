package com.mars.generator.service;

import com.mars.generator.model.GenTable;
import com.mars.generator.model.GenTableColumn;
import com.mars.share.common.message.BaseResult;

import java.util.List;

/**
 * todo
 *
 * @author stonew
 * @data 2017-07-25 14:29
 **/
public interface GenTableService{

    /**
     * 获取物理数据表列表
     * @param genTable
     * @return
     */
    BaseResult<List<GenTable>> getTableListFromDb(GenTable genTable);

    /**
     * 获取数据表字段
     * @param genTable
     * @return
     */
    BaseResult<List<GenTableColumn>> getTableColumnList(GenTable genTable);

    /**
     * 获取数据表主键
     * @param genTable
     * @return
     */
    BaseResult<List<String>> getTablePK(GenTable genTable);

    /**
     * 获取物理数据表列表
     * @param genTable
     * @return
     */
    BaseResult<GenTable> getTableFormDb(GenTable genTable);

}
