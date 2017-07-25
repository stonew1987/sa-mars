package com.mars.generator.mapper;

import com.mars.generator.model.GenTable;
import com.mars.generator.model.GenTableColumn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * todo
 * @author stonew
 * @data 2017-07-25 14:57
 **/
@Mapper
public interface GenDataBaseDictDao {
    /**
     * 查询表列表
     * @param genTable
     * @return
     */
    List<GenTable> getTableList(GenTable genTable);

    /**
     * 获取数据表字段
     * @param genTable
     * @return
     */
    List<GenTableColumn> getTableColumnList(GenTable genTable);

    /**
     * 获取数据表主键
     * @param genTable
     * @return
     */
    List<String> getTablePK(GenTable genTable);

}
