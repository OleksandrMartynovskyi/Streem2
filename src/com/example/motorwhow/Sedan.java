package com.example.motorwhow;

public class Sedan extends Vehicle{
    public Sedan(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price, color);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sedan{");
        sb.append('}');
        return sb.toString();
    }
}
