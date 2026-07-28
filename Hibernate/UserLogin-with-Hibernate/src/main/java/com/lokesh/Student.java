package com.lokesh;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;
    private String full_name;
    private long phone_number;
    private String email;
    private String city;
    private String password_hash;
    public Student(){

    }
    public Student(String full_name, long phone_number, String email, String city, String password_hash) {
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.email = email;
        this.city = city;
        this.password_hash = password_hash;
    }
}
