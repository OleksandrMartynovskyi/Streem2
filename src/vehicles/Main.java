package vehicles;

public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F-150", 2021, 35000.0, "Blue");


        System.out.println("Truck details:");
        System.out.println(truck.toString());


        truck.moveForward();
    }
}

