package com.lokesh2_autowired.main;

import com.lokesh2_autowired.beans.Student;
import com.lokesh2_autowired.res.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student student = (Student)context.getBean("std");
        student.display();
    }
}
