package zad3;

public class ElectricCar extends Car {
    public ElectricCar(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void drive() {
        System.out.println("Jade samochodem  " + getColor() + " " + getBrand() + " jest to elektryk.");
    }

    public void charge() {
        System.out.println("Laduje " + getColor() + " " + getBrand() + " ktory jest elektrycznym samochodem.");
    }
}