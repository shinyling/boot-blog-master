package com.lx.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shiny
 * @since 2016/10/17 17:55
 */
@SpringBootApplication
@EnableSwagger2 //启用controller swagger注解
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
