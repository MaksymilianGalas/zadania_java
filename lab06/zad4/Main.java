package zad4;

public class Main {
    public static void main(String[] args) {
        Czas czas1 = new Czas(2, 45);
        Czas czas2 = new Czas(1, 30);

        System.out.println("czas1: " + czas1);
        System.out.println("czas2: " + czas2);

        Czas czas3 = czas1.dodaj(czas2);
        System.out.println("czas3: " + czas3);

        Czas czas4 = czas1.odejmij(czas2);
        System.out.println("czas4: " + czas4);

        Czas czas5 = czas1.pomnoz(3);
        System.out.println("czas5: " + czas5);
    }
}
