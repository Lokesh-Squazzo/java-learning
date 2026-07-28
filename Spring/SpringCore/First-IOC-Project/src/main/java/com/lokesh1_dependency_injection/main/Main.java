package com.lokesh1_dependency_injection.main;

import com.lokesh1_dependency_injection.beans.Student;
import com.lokesh1_dependency_injection.res.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student std = (Student) context.getBean("std");
        std.display();
    }
}
