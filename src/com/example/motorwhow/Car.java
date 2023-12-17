package com.example.motorwhow;

import java.util.StringJoiner;

public class Car extends Vehicle{
    public Car(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price, color);
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
