package com.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;


public class DemoSpringbootApplcaition {
    public static void main(String[] args) {
        SpringApplication application =new SpringApplication();
        HashSet<String> sources = new HashSet<>();
        sources.add(SpringBootcnfig.class.getName());
        application.setSources(sources);
        application.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = application.run(args);
    }
    @SpringBootApplication
    public static class SpringBootcnfig{

    }
}
