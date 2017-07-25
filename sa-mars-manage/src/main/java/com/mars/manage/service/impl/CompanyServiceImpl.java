package com.mars.manage.service.impl;

import com.mars.manage.mapper.CompanyMapper;
import com.mars.manage.model.Company;
import com.mars.manage.service.CompanyService;
import com.mars.share.common.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompanyServiceImpl{// extends BaseServiceImpl<Company> implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;
}
