package com.lokesh.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        //By Using XML File
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student std = (Student) context.getBean("std1");
//        std.display();

//        //By Using Java Class:
//
//        ApplicationContext context= new AnnotationConfigApplicationContext(StudentConfig.class);
//        Student std = (Student) context.getBean("std1");
//        std.display();

        //By Using Annotation @Component

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        student.display();
    }
}
