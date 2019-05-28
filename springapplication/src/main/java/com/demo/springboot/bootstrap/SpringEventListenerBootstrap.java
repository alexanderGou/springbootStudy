package com.demo.springboot.bootstrap;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventListenerBootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.addApplicationListener(event->{
            System.out.println("监听到事件:"+event.toString());
        });
        context.refresh();
        context.publishEvent(new ApplicationEvent("hello world") {
            @Override
            public Object getSource() {
                return super.getSource();
            }

            @Override
            public String toString() {
                return super.toString();
            }
        });
        context.close();
    }
}
