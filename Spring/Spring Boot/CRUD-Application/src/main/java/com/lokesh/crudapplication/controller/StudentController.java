package com.lokesh.crudapplication.controller;

import com.lokesh.crudapplication.model.Student;
import com.lokesh.crudapplication.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student student1= studentService.create(student);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(student1);
        /*
        let's return http response here by default it is returning 200 code.
        We use ResponseEntity class, which having different methods.
        Here we can use direct .ok() method which return 200 code, or
        .created() which return 201 but needs URI, but currently I don't
        know about this. So i have used here .status() with enum of HttpStatus
        which consist many status code like OK, CREATED, etc...
         */
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getOne(@PathVariable Long id){
        Student student = studentService.getAStd(id);
        return ResponseEntity.status((student==null)? HttpStatus.NOT_FOUND: HttpStatus.OK).body(student);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> studentList =studentService.getAllStudent();
        return ResponseEntity.status(HttpStatus.OK).body(studentList);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        studentService.deleteById(id);
        return ResponseEntity.ok("User Deleted");
    }

}
