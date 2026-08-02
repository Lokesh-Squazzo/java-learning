package com.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    StudentProperties studentProperties;

    public Student(StudentProperties studentProperties) {
        this.studentProperties = studentProperties;
    }
    void displayAll(){
        System.out.println(studentProperties);
    }
}
