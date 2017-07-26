package com.mars.generator.service.impl;

import com.mars.generator.mapper.GenDataBaseDictDao;
import com.mars.generator.model.GenTable;
import com.mars.generator.model.GenTableColumn;
import com.mars.generator.service.GenTableService;
import com.mars.generator.utils.GenUtils;
import com.mars.generator.utils.StringUtils;
import com.mars.share.common.enums.YesNoEnum;
import com.mars.share.common.message.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 * @author stonew
 * @data 2017-07-25 14:31
 **/

@Service
public class GenTableServiceImpl implements GenTableService {

    @Autowired
    private GenDataBaseDictDao genDataBaseDictDao;

    @Override
    public BaseResult<List<GenTable>> getTableListFromDb(GenTable genTable) {

        List list = genDataBaseDictDao.getTableList(genTable);
        return BaseResult.createBySuccess(list);
    }

    @Override
    public BaseResult<List<GenTableColumn>> getTableColumnList(GenTable genTable) {
        return null;
    }

    @Override
    public BaseResult<List<String>> getTablePK(GenTable genTable) {
        return null;
    }

    @Override
    public BaseResult<GenTable> getTableFormDb(GenTable genTable) {
        // 如果有表名，则获取物理表
        if (StringUtils.isNotBlank(genTable.getName())){

            List<GenTable> list = genDataBaseDictDao.getTableList(genTable);
            if (list.size() > 0){

                // 如果是新增，初始化表属性
                if (null != genTable.getId()){
                    genTable = list.get(0);
                    // 设置字段说明
                    if (StringUtils.isBlank(genTable.getComments())){
                        genTable.setComments(genTable.getName());
                    }
                    genTable.setClassName(StringUtils.toCapitalizeCamelCase(genTable.getName()));
                }

                // 添加新列
                List<GenTableColumn> columnList = genDataBaseDictDao.getTableColumnList(genTable);
                for (GenTableColumn column : columnList){
                    boolean b = false;
                    for (GenTableColumn e : genTable.getColumnList()){
                        if (e.getName().equals(column.getName())){
                            b = true;
                        }
                    }
                    if (!b){
                        genTable.getColumnList().add(column);
                    }
                }

                // 删除已删除的列
                for (GenTableColumn e : genTable.getColumnList()){
                    boolean b = false;
                    for (GenTableColumn column : columnList){
                        if (column.getName().equals(e.getName())){
                            b = true;
                        }
                    }
                    if (!b){
                        e.setIsDeleted(YesNoEnum.No.getCode());
                    }
                }

                // 获取主键
                genTable.setPkList(genDataBaseDictDao.getTablePK(genTable));

                // 初始化列属性字段
                GenUtils.initColumnField(genTable);

            }
        }
        return BaseResult.createBySuccess(genTable);
    }
}
