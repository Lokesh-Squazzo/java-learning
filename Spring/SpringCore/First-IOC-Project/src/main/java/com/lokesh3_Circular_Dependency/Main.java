package com.lokesh3_Circular_Dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        B b = context.getBean(B.class);
        b.doSomething();
    }
}
