package com.resources;

import main.example.motorwhow.Vehicle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Vehicle> vehicles = new Vector<>();
        String filePath = "src/com/resources/homework.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String brand = parts[1];
                String model = parts[2];
                int year = Integer.parseInt(parts[3]);
                double price = Double.parseDouble(parts[4]);
                String color = parts[5];

                Vehicle vehicle = new Vehicle(id, brand, model, year, price, color);
                vehicles.add(vehicle);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        vehicles.stream()
                .sorted(Comparator.comparing(Vehicle::getPrice).reversed())
                .skip(17)
                .limit(10)
                .forEach(System.out::println);


        double someValue = 10000.0;
        vehicles.stream()
                .filter(v -> v.getPrice() > someValue)
                .limit(15)
                .forEach(System.out::println);
    }
}