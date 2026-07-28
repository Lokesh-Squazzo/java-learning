package com.lokesh.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int age;
    private String email;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println("Name: "+name+" Age: "+age+" Email: "+email);
    }
}
