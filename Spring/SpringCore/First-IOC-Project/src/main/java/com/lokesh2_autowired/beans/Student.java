package com.lokesh2_autowired.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String name;
    private int roll;
    @Autowired
    private Address address;
    @Autowired
    private Subject subject;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name "+ name);
        System.out.println("Roll "+ roll);
        System.out.println("Address "+ address);
        System.out.println("Subjects "+ subject);

    }
}
