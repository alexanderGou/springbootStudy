package java.com.example.demo.configuration;


import com.example.demo.annotation.ConditionalOnSystemProperty;
import com.example.demo.annotation.EnableHelloworld;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloworld(name = "name", value = "test")
@ConditionalOnSystemProperty(name = "user.name", value = "39565")
public class HelloWorldAutoConfiguration {
}
