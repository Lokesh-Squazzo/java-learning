package com.lokesh1_dependency_injection.res;

import com.lokesh1_dependency_injection.beans.Address;
import com.lokesh1_dependency_injection.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("add")
    Address getAddress(){
        Address add = new Address(12,"Shirpur");
        return add;
    }
    @Bean("std")
    Student getStudent(Address address){
        Student student = new Student("Lokesh", 2, address );
        return student;
    }
}
