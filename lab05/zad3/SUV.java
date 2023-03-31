package zad3;

public class SUV extends Car {
    public SUV(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void drive() {
        System.out.println("Jade samochodem  " + getColor() + " " + getBrand() + " jest to SUV.");
    }

    public void offroad() {
        System.out.println("Jade na offroad w samochodzie " + getColor() + " " + getBrand());
    }
}