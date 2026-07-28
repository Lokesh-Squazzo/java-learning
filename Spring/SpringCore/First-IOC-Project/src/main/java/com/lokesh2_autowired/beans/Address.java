package com.lokesh2_autowired.beans;

public class Address {
    private int plot;
    private String city;

    public Address(String city, int plot) {
        this.city = city;
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "#"+plot+" - "+city;
    }
}
