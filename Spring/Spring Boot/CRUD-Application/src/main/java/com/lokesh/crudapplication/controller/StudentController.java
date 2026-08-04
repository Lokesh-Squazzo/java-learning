package com.lokesh.crudapplication.controller;

import com.lokesh.crudapplication.model.Student;
import com.lokesh.crudapplication.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    /*
    CRUD operation api points:
    localhost:8080/api/student
    1. POST - /create
    2. GET - /get/{id}
    3. GET - /getAll
    4. PUT -/update
    5. DELETE - /delete/{id}
     */
    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        studentService.create(student);
        System.out.println(student.getName());
        return student;
    }

}
