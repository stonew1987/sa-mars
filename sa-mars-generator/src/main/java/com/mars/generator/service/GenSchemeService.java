package com.mars.generator.service;

import com.mars.generator.model.GenScheme;
import com.mars.share.common.message.BaseResult;

/**
 *  todo
 * @author stonew
 * @data 2017-07-26 11:59
 **/
public interface GenSchemeService {

    /**
     * 生成代码
     * @param genScheme
     * @return
     */
    BaseResult<String> generateCode(GenScheme genScheme);

}
