package com.lokesh1_dependency_injection.beans;

public class Address {
    private int plot;
    private String city;

    public Address() {
    }

    public Address(int plot, String city) {
        this.plot = plot;
        this.city = city;
    }

    @Override
    public String toString() {
        return "# "+plot+"- "+city;
    }
}
