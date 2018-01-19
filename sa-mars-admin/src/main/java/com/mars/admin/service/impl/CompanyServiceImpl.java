package com.mars.admin.service.impl;

import com.mars.admin.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompanyServiceImpl{

    @Autowired
    private CompanyMapper companyMapper;
}
