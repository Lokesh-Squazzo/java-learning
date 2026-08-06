package com.lokesh.crudapplication.service;

import com.lokesh.crudapplication.model.Student;
import com.lokesh.crudapplication.repository.StudentRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student create(Student student){
        return studentRepo.save(student);
    }

    public Student getAStd(Long id) {
        Optional<Student> studentOptional = studentRepo.findById(id);
        return (studentOptional.isEmpty()? null : studentOptional.get());
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public void deleteById(Long id) {
        studentRepo.deleteById(id);
    }
}
