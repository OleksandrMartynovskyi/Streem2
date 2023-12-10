package vehicles;

public class ElectricCar extends Vehicle {
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, double price, String color, int batteryCapacity) {
        super(brand, model, year, price, color);
        int capacity = this.batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void start() {
        System.out.println("System switched on.");
    }

    public static class ElectricCarBuilder {
        private String brand;
        private String model;
        private int year;
        private double price;
        private String color;
        private int batteryCapacity;

        public ElectricCarBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public ElectricCarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public ElectricCarBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public ElectricCarBuilder setBatteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public ElectricCarBuilder setBatteryCapacity(String color) {
            this.color = color;
            return this;
        }
        public ElectricCar build() {
            return new ElectricCar(brand, model, year, price, color, batteryCapacity);
        }

        public ElectricCar setColor(String color) {
            this.color = color;
            return null;
        }
    }
}
