package com.lokesh1_dependency_injection.beans;

public class Student {
    private String name;
    private int roll;
    private Address address;
    public Student(){

    }
    public Student(String name, int roll, Address address) {
        this.name = name;
        this.roll = roll;
        this.address = address;
    }
    public void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(address);
    }
}
