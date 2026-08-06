package com.lokesh.crudapplication.repository;

import com.lokesh.crudapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface StudentRepo extends JpaRepository<Student, Long> {
    /*
    //this is our own created method name,
    JPA will write query according to name at run time.
     */
    Optional<Student> findByIdAndDeletedFalse(Long id);
    List<Student> findByDeletedFalse();

    Optional<Student> findByEmail(String email);
}
