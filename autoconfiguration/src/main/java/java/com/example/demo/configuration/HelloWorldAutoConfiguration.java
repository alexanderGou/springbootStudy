package java.com.example.demo.configuration;


import org.springframework.context.annotation.Configuration;

import java.com.example.demo.annotation.ConditionalOnSystemProperty;
import java.com.example.demo.annotation.EnableHelloworld;

@Configuration
@EnableHelloworld(name = "name", value = "test")
@ConditionalOnSystemProperty(name = "user.name", value = "39565")
public class HelloWorldAutoConfiguration {
}
