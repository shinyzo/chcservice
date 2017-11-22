package com.lming.chcservice;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
@Cacheable
@MapperScan(basePackages = "com.lming.chcservice.mapper")
public class ChcserviceApplication {


    public static void main(String[] args) {
        SpringApplication.run(ChcserviceApplication.class, args);
    }
}
