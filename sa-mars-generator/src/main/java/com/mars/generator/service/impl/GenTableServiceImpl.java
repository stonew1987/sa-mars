package com.mars.generator.service.impl;

import com.mars.generator.mapper.GenDataBaseDictDao;
import com.mars.generator.model.GenTable;
import com.mars.generator.model.GenTableColumn;
import com.mars.generator.service.GenTableService;
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
}
