package com.lokesh.crudapplication.repository;

import com.lokesh.crudapplication.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepo {
    public String save(Student student){
        return "Success";
    }

}
