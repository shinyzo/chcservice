package com.lming.chcservice;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * tomcat容器依赖启动类
 * @Author shinyZo
 * @date 2017-11-27
 * @description
 */
public class ChcServiceStartup extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ChcserviceApplication.class);
    }
}
