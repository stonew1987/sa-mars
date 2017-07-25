package com.mars.generator.controller;

import com.mars.generator.model.GenTable;
import com.mars.generator.service.GenTableService;
import com.mars.share.common.message.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 业务表Controller
 * @author stonew
 * @data 2017-07-25 15:13
 **/
@RestController
public class GenTableController {

    @Autowired
    private GenTableService genTableService;

    @RequestMapping(value = "/tables", method = RequestMethod.GET)
    public BaseResult<List<GenTable>> list(GenTable genTable){
        return genTableService.getTableListFromDb(new GenTable());
    }
}
