package com.mars.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beanRefContext.xml")
@EnableAspectJAutoProxy
@EnableAutoConfiguration
@Configuration
@MapperScan("com.mars.*.mapper")
public class SaMarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaMarsApplication.class, args);
	}




}
