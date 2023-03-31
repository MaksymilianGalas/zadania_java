package zad6;

public class Calculator {
    public double calculate(double number) {
        return Math.pow(number, 2);
    }

    public double calculate(double first, double second) {
        return first * second;
    }

    public double calculate(double first, double second, double third) {
        return first + second + third;
    }
}
