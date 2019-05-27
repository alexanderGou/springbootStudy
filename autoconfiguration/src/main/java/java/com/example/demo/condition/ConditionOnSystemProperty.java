package java.com.example.demo.condition;

import com.example.demo.annotation.ConditionalOnSystemProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

@Slf4j
public class ConditionOnSystemProperty implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String name = String.valueOf(annotationAttributes.get("name"));
        String value = String.valueOf(annotationAttributes.get("value"));
        String username = System.getProperty(name);
        log.info("name=[{}],value=[{}]",name,value);
        return value.equals(username);
    }
}
