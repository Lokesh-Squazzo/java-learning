package com.lokesh.crudapplication.service;

import com.lokesh.crudapplication.model.Student;
import com.lokesh.crudapplication.repository.StudentRepo;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
    StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public String create(Student student){
        //we will write our business logic here in next upcoming commits.
        return studentRepo.save(student);
    }
}
