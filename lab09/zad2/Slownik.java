package zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Slownik<K, V> {
    private K[] klucze;
    private V[] wartosci;
    private int iloscElementow;

    public Slownik(int size) {
        klucze = (K[]) new Object[size];
        wartosci = (V[]) new Object[size];
        iloscElementow = 0;
    }

    public boolean dodaj(K klucz, V wartosc) {
        if (iloscElementow < klucze.length) {
            int indeks = znajdzIndeks(klucz);
            if (indeks != -1) {
                wartosci[indeks] = wartosc;
            } else {
                klucze[iloscElementow] = klucz;
                wartosci[iloscElementow] = wartosc;
                iloscElementow++;
            }
            return true;
        }
        return false;
    }

    public boolean czyZawiera(K klucz) {
        return znajdzIndeks(klucz) != -1;
    }

    public int wielkosc() {
        return iloscElementow;
    }

    private int znajdzIndeks(K klucz) {
        for (int i = 0; i < iloscElementow; i++) {
            if (klucze[i].equals(klucz)) {
                return i;
            }
        }
        return -1;
    }


    public static Slownik<String, String> wczytajSlownik(File file) {
        Slownik<String, String> slownik = null;

        try {
            Scanner scanner = new Scanner(file);
            slownik = new Slownik<>(100); // ustal rozmiar słownika

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("->");

                if (parts.length == 2) {
                    String klucz = parts[0].trim();
                    String wartosc = parts[1].trim();
                    slownik.dodaj(klucz, wartosc);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return slownik;
    }
}
