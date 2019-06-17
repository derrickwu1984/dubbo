package com.wmx.gmall;

import org.springframework.boot.SpringApplication;
/*
 * 1、导入依赖
 * 	1)、导入dubbo-starter
 * 
 * 
 * */
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
//开启基于注解的dubbo功能
@EnableDubbo
@SpringBootApplication
public class BootUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceProviderApplication.class, args);
	}

}
