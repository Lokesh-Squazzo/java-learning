package com.learning;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {
    /*
    it will automatically run when our spring-boot will start.
     */
    Student student;

    public MyRunner(Student student) {
        this.student = student;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        student.displayAll();
    }
}
