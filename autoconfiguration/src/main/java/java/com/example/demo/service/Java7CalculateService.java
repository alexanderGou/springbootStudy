package java.com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * sum 求和for 循环实现
 */
@Profile("Java7")
@Service
@Slf4j
public class Java7CalculateService implements CalculateService{
    @Override
    public Integer sum(Integer... args) {
        log.info("Java 7 实现");
        Integer result =0;
        for (int i = 0; i < args.length; i++) {
            result+=args[i];
        }
        return  result;
    }
}
