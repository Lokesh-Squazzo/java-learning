package com.lokesh.crudapplication.repository;

import com.lokesh.crudapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepo extends JpaRepository<Student, Long> {

}
