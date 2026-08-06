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
    4. PUT -/update/{id}
    5. DELETE - /delete/{id}
    6. PATCH - /soft-delete/{id}
    7. PATCH -/recover/{email}
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
        return (student==null)?
                ResponseEntity.status(HttpStatus.NOT_FOUND).build() :
                ResponseEntity.ok(student);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> studentList =studentService.getAllStudent();
        return (studentList.isEmpty() )?
                ResponseEntity.status(HttpStatus.NOT_FOUND).build() :
                ResponseEntity.ok(studentList);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStd(@PathVariable Long id,
                                             @RequestBody Student studentReqBody)
    {
        Student student = studentService.updateStd(id, studentReqBody);
        if(student==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(student);
    }


    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){

        boolean isDeleted = studentService.deleteById(id);
        if(!isDeleted){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Student found with this "+id+" id");
        }
        return ResponseEntity.ok("Student Deleted");
    }

    @PatchMapping("/soft-delete/{id}")
    public ResponseEntity<String> softDelete(@PathVariable Long id){
        boolean isDeleted = studentService.softDelete(id);
        if(!isDeleted){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Student found with this "+id+" id");
        }
        return ResponseEntity.ok("Student Deleted");
    }

    @PatchMapping("/recover/{email}")
    public ResponseEntity<String> recoverStudent(@PathVariable String email){
        boolean isRecovered = studentService.recoverStudent(email);
        if(!isRecovered){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Student is permanently deleted, can't be recover");
        }
        return ResponseEntity.ok("Student recovered successfully");
    }

}
