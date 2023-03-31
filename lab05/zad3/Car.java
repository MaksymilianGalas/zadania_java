package zad3;
public abstract class Car {
    private final String brand;
    private final String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void drive();

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}







