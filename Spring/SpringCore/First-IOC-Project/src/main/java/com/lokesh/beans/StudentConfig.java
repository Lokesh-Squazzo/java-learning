package com.lokesh.beans;

import com.lokesh.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class StudentConfig{
    @Bean("std1")
    public Student std1(){
        Student std = new Student();
        return std;
    }
}