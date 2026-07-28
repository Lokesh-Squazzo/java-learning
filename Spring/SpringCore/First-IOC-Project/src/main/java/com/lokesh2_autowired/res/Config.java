package com.lokesh2_autowired.res;

import com.lokesh2_autowired.beans.Address;
import com.lokesh2_autowired.beans.Student;
import com.lokesh2_autowired.beans.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Config {

    @Bean()
    Address getAddress(){
        return new Address("Shirpur",14);
    }

    @Bean()
    Subject getSubjects(){
        Subject subject = new Subject();
        List<String> sub = new ArrayList<>();
        sub.add("Math");
        sub.add("Java");
        sub.add("C++");
        sub.add("DBMS");
        subject.setSubjects(sub);
        return subject;
    }

    @Bean("std")
    Student getStudent(){
        Student student = new Student();
        student.setName("Lokesh");
        student.setRoll(1);
        return student;
    }
}
