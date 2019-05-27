package com.example.demo.annotation;

import com.example.demo.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.METHOD})
@Conditional(ConditionOnSystemProperty.class)
public @interface ConditionalOnSystemProperty {
    String name();

    String value();
}
