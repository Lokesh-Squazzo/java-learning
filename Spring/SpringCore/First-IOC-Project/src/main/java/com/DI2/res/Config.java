package com.DI2.res;

import com.DI2.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.DI2.bean")
public class Config {
    @Bean("std1")
    Student getS(){
        Student student = new Student();
        student.setName("lokesh");
        student.setRoll(12);
        return student;
    }


}
