import com.example.motorwhow.Car;
import com.example.motorwhow.Motorcycle;
import com.example.motorwhow.Truck;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = args.length > 0 ? args[0] : "src/main/resources/vehicles.txt";
        readVehiclesFromFile(filePath);
    }

    private static void readVehiclesFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static void processLine(String line) {
        String[] parts = line.split(",");

        if (parts.length < 6) {
            System.err.println("Invalid data format: " + line);
            return;
        }

        String type = parts[0];
        String brand = parts[1];
        String model = parts[2];
        int year;
        double price;

        try {
            year = Integer.parseInt(parts[3]);
            price = Double.parseDouble(parts[4]);
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number in line: " + line + "; Error: " + e.getMessage());
            return;
        }

        String color = parts[5];

        switch (type) {
            case "Car":
                printVehicle(new Car(brand, model, year, price, color));
                break;
            case "Truck":
                printVehicle(new Truck(brand, model, year, price, color));
                break;
            case "Motorcycle":
                printVehicle(new Motorcycle(brand, model, year, price, color));
                break;
            default:
                System.err.println("Unknown vehicle type: " + type + " in line: " + line);
                break;
        }
    }

    private static void printVehicle(Object vehicle) {
        System.out.println(vehicle);
    }
}