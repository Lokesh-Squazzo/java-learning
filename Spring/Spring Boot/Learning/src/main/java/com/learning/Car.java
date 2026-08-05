package com.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Value("${car_prop.model:maruti}")
    private String model;
    @Value("${car_prop.price:10000}")
    private int price;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
