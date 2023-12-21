package main.example.motorwhow;

public class Motorcycle extends Vehicle implements Movable {
    public Motorcycle(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price, color);
    }

    @Override
    public void moveForward() {
        System.out.println("vehicles.Car is moving forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("vehicles.Car is moving backward.");
    }
}
