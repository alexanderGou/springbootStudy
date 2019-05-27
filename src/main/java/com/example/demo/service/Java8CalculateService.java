package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * sum 求和lambda实现
 */
@Profile("Java8")
@Service
@Slf4j
public class Java8CalculateService implements CalculateService{
    @Override
    public Integer sum(Integer... args) {
        log.info("Java 8 实现");
        return Stream.of(args).reduce(0,Integer::sum);
    }

}
