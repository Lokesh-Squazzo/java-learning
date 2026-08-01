package com.DI2;

import com.DI2.bean.Student;
import com.DI2.res.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
//        Student student = new Student();
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student std1 =(Student) context.getBean("std1");
        System.out.println(std1);
//        just trying something
//        List<String> beans = new ArrayList<>();
//        beans.add("std1");
//        for(String bean : beans){
//            Student bean1 =(Student) context.getBean(bean);
//            System.out.println(bean1);
//        }
//        System.out.println(student.toString());

    }
}
