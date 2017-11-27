package com.lming.chcservice;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@SpringBootApplication
@Cacheable
@EnableTransactionManagement
@MapperScan(basePackages = "com.lming.chcservice.mapper")
public class ChcserviceApplication {


    public static void main(String[] args) {
        SpringApplication.run(ChcserviceApplication.class, args);
    }




}
