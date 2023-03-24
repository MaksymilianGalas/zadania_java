package zad01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("podaj 4 liczby (licznik 1, mianownik 1, licznik 2, mianownik 2)");
        new Ulamek(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
    }
}
