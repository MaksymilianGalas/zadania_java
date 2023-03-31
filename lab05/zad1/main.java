package zad1;

public class main {
    public static void main(String[] args) {
        Dog piesek = new Dog("Burek","Brazowy");
        System.out.printf(piesek.makeSound());
        Cat kotek = new Cat("Mruczek","Laciaty");
        System.out.println(kotek.makeSound());
    }
}
