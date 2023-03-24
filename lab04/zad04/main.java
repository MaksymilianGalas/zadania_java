package zad04;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ilosc = scan.nextInt();
        Symulacja doniczka = new Symulacja(ilosc);
        double reszka = 100 - doniczka.wynik;
        System.out.println("orzeł :" + doniczka.wynik + " %" + "\nreszka: " + reszka + " %");

    }
}
