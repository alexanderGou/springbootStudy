package java.com.example.demo.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.com.example.demo.service.CalculateService;

@ComponentScan(basePackages = "com.example.demo.service")
public class CalculateServiceBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java7")
                .run(args);
        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println(calculateService.sum(0,1,2,3,4,5,6,7,8,9,10));
        context.close();
    }
}
