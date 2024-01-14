package main.example.motorwhow;

public class Truck extends Vehicle {

    public Truck(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price, color);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id='" + id + '\'' +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void moveForward() {
        System.out.println("Truck is moving forward.");
    }
}