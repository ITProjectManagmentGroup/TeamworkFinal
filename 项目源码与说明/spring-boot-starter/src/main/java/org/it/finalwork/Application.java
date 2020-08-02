package org.it.finalwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication //注解说明这是一个spring boot应用
@EnableConfigurationProperties

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}