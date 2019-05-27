package java.com.example.demo.bootstrap;

import com.example.demo.annotation.ConditionalOnSystemProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@Slf4j
public class ConditionOnSystemPropertyBootstrap {
    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value = "yihan")
    public String helloWorld(){
        return "hello world 2019";
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld", String.class);
        log.info("condition Success: result={}",helloWorld);
        context.close();
    }
}
