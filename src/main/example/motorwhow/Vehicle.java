package main.example.motorwhow;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double price;
    protected String color;

    // Конструктор
    public Vehicle(String brand, String model, int year, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    // Аксесори (гетери та сетери)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vehicle{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", year=").append(year);
        sb.append(", price=").append(price);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
