package java.com.example.demo.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.com.example.demo.annotation.EnableHelloworld;

@EnableHelloworld(name = "username",value = "sync")
public class EnableHelloWorldBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("helloWorld = [" + helloWorld + "]");
        context.close();
    }
}
