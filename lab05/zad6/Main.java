package zad6;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(2));
        System.out.println(calculator.calculate(4, 5));
        System.out.println(calculator.calculate(1, 2, 3));
    }
}
