package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;

public class HelloWorldConfiguration {
    @Bean
    public String helloWorld(){
        return "hello 2019";
    }
}
