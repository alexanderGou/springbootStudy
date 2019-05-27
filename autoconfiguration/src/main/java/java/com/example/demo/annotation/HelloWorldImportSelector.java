package java.com.example.demo.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.StandardAnnotationMetadata;
import org.springframework.util.MultiValueMap;

import java.com.example.demo.configuration.HelloWorldConfiguration;
import java.lang.reflect.AnnotatedElement;

public class HelloWorldImportSelector implements ImportSelector {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //做了些拿去注解里的属性的操作，可以忽略
        AnnotatedElement element = null;
        if (importingClassMetadata instanceof StandardAnnotationMetadata) {
            element = ((StandardAnnotationMetadata) importingClassMetadata).getIntrospectedClass();
            MultiValueMap<String, Object> allAnnotationAttributes = AnnotatedElementUtils.getAllAnnotationAttributes(element, EnableHelloworld.class.getName());
            allAnnotationAttributes.forEach((key, value) -> {
                logger.info("name = {}, value = {}", key, String.valueOf(value));
            });
        }
        //返回HelloWorldConfiguration的名字
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
