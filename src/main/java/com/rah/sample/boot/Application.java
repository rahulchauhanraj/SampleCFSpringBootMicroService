package com.rah.sample.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
    value = {
        "com.rah.sample"
    },
    excludeFilters = {
    }
)
public class Application extends SpringBootServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).run(args);
        log.info("Application starting...................");
        log.info("Application started....................");
    }
}