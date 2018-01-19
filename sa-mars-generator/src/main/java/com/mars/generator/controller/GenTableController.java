package com.mars.generator.controller;

import com.mars.generator.model.GenScheme;
import com.mars.generator.model.GenTable;
import com.mars.generator.service.GenSchemeService;
import com.mars.generator.service.GenTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @Autowired
    private GenSchemeService genSchemeService;

//    @RequestMapping(value = "/tables", method = RequestMethod.GET)
//    public BaseResult<List<GenTable>> list(){
//        return genTableService.getTableListFromDb(new GenTable());
//    }
//
//    @RequestMapping(value = "/tables/{tableName}", method = RequestMethod.GET)
//    public BaseResult<GenTable> list(@PathVariable String tableName){
//        GenTable genTable = new GenTable();
//        genTable.setName(tableName);
//        return genTableService.getTableFormDb(genTable);
//    }
//
//    @RequestMapping(value = "/tables/generate", method = RequestMethod.GET)
//    public BaseResult<String> generateCode(GenScheme genScheme) {
//        genScheme.setName("单表");
//        genScheme.setCategory("curd");
//        genScheme.setPackageName("com.mars");
//        genScheme.setModuleName("generator");
//        genScheme.setFunctionName("单表生成");
//        genScheme.setReplaceFile(false);
//        genScheme.setFunctionAuthor("111");
//        genScheme.setFunctionNameSimple("单表");
//        genScheme.setSubModuleName("");
//
//        return genSchemeService.generateCode(genScheme);
//    }
}
