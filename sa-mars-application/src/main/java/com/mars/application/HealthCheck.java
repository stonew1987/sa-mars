package com.mars.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查
 */
@RestController
public class HealthCheck {

    private static final String OK = "OK";

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health() {
        return OK;
    }

}
