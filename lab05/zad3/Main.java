package zad3;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new SportsCar("Porsche", "Czerwone"), new SUV("Jeep", "Zielone"), new ElectricCar("Tesla", "Biale")};

        for (Car car : cars) {
            car.drive();
            if (car instanceof SportsCar) {
                ((SportsCar) car).race();
            } else if (car instanceof SUV) {
                ((SUV) car).offroad();
            } else if (car instanceof ElectricCar) {
                ((ElectricCar) car).charge();
            }
            System.out.println();
        }
    }
}