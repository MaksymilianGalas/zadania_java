package zad5;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("Czarne", "BMW", 2005);
        Samochod.SzybkiSamochod supercar = new Samochod.SzybkiSamochod("Czarne", "BMW", 2005);
        System.out.printf(samochod.toString());
        System.out.println(supercar.toString());
        if (supercar.equals(samochod)==true) {
            System.out.println("Samochod i SzybkiSamochod sa sobie rowne.");
        } else {
            System.out.println("Samochod i SzybkiSamochod sa rozne.");
        }
    }
}

