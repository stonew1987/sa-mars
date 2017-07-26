package com.mars.generator.service.impl;

import com.mars.generator.mapper.GenDataBaseDictDao;
import com.mars.generator.mapper.GenSchemeDao;
import com.mars.generator.mapper.GenTableColumnDao;
import com.mars.generator.mapper.GenTableDao;
import com.mars.generator.model.*;
import com.mars.generator.service.GenSchemeService;
import com.mars.generator.utils.GenUtils;
import com.mars.generator.utils.StringUtils;
import com.mars.share.common.enums.YesNoEnum;
import com.mars.share.common.message.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *  todo
 * @author stonew
 * @data 2017-07-26 12:02
 **/

@Service
public class GenSchemeServiceImpl implements GenSchemeService {


    @Autowired
    private GenSchemeDao genSchemeDao;
    @Autowired
    private GenTableDao genTableDao;
    @Autowired
    private GenTableColumnDao genTableColumnDao;
    @Autowired
    private GenDataBaseDictDao genDataBaseDictDao;

    @Override
    public BaseResult<String> generateCode(GenScheme genScheme) {

        StringBuilder result = new StringBuilder();
        // 查询主表及字段列
//        GenTable genTable = genTableDao.get(genScheme.getGenTable().getId());
//
//        genTable.setColumnList(genTableColumnDao.getList(new GenTableColumn(new GenTable(genTable.getId()))));
        GenTable genTable = new GenTable();
        genTable.setName("sa_user");
        genTable = getTableFormDb(genTable);
        // 获取所有代码模板
        GenConfig config = GenUtils.getConfig();

        // 获取模板列表
        List<GenTemplate> templateList = GenUtils.getTemplateList(config, genScheme.getCategory(), false);
        genScheme.setGenTable(genTable);
        Map<String, Object> model = GenUtils.getDataModel(genScheme);
        for (GenTemplate tpl : templateList){
            result.append(GenUtils.generateToFile(tpl, model, genScheme.getReplaceFile()));
        }
        return BaseResult.createBySuccess(result.toString());
    }

    public GenTable getTableFormDb(GenTable genTable) {
        // 如果有表名，则获取物理表
        if (StringUtils.isNotBlank(genTable.getName())){
            List<GenTable> list = genDataBaseDictDao.getTableList(genTable);
            if (list.size() > 0){

                // 如果是新增，初始化表属性
                if (null == genTable.getId()){
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

                genTable.setPkList(genDataBaseDictDao.getTablePK(genTable));

                // 初始化列属性字段
                GenUtils.initColumnField(genTable);

            }
        }
        return genTable;
    }
}
