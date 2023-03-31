package zad3;

public class SportsCar extends Car {
    public SportsCar(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void drive() {
        System.out.println("Jade samochodem  " + getColor() + " " + getBrand() + " jest to sportowy samochod.");
    }

    public void race() {
        System.out.println("Scigam sie w " + getColor() + " " + getBrand() + ".");
    }
}