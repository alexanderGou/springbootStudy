package java.com.example.demo.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,ElementType.TYPE})
@Documented
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloworld {
    String name();
    String value();
}
