package com.lokesh.crudapplication.service;

import ch.qos.logback.core.pattern.parser.OptionTokenizer;
import com.lokesh.crudapplication.model.Student;
import com.lokesh.crudapplication.repository.StudentRepo;
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
        student.setDeleted(false);
        return studentRepo.save(student);
    }

    public Student getAStd(Long id) {
        Optional<Student> studentOptional = studentRepo.findByIdAndDeletedFalse(id);
        return studentOptional.orElse(null);
    }

    public List<Student> getAllStudent() {
        return studentRepo.findByDeletedFalse();
    }

    public boolean deleteById(Long id) {
        Optional<Student> studentOptional = studentRepo.findById(id);
        if(studentOptional.isEmpty()){
            return false;
        }
        studentRepo.deleteById(id);
        return true;
    }

    public Student updateStd(Long id, Student studentReqBody) {
        Optional<Student> studentOptional = studentRepo.findByIdAndDeletedFalse(id);
        Student student = studentOptional.orElse(null);
        if(student == null){
            return null;
        }
        student.setDeleted(false);
        student.setName(studentReqBody.getName());
        student.setEmail(studentReqBody.getEmail());
        student.setPrn(studentReqBody.getPrn());
        student.setPhone(studentReqBody.getPhone());
        return studentRepo.save(student);
    }

    public boolean softDelete(Long id) {
        Student student = studentRepo.findByIdAndDeletedFalse(id).orElse(null);
        if(student==null){
            return false;
        }
        student.setDeleted(true);
        studentRepo.save(student);
        return true;
    }

    public boolean recoverStudent(String email) {
        Optional<Student> studentOptional = studentRepo.findByEmail(email);
        Student student = studentOptional.orElse(null);
        if(student == null){
            return false;
        }
        student.setDeleted(false);
        studentRepo.save(student);
        return true;
    }
}
