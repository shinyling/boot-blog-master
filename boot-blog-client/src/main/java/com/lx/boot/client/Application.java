package com.lx.boot.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shiny
 * @since 2016/10/18 14:40
 */
@SpringBootApplication
@EnableSwagger2
public class Application implements EmbeddedServletContainerCustomizer{

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);

    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8081);
    }
}
