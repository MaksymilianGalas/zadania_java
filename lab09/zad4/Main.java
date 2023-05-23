package zad4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tworzenie kilku zawodników
        Zawodnik zawodnik1 = new Zawodnik("Maksymilian", "Galas", 1, 13.5);
        Zawodnik zawodnik2 = new Zawodnik("Adam", "Nowak", 2, 9.8);
        Zawodnik zawodnik3 = new Zawodnik("Konrad", "Butkiewicz", 3, 3.2);

        List<Zawodnik> listaZawodnikow = new ArrayList<>();
        listaZawodnikow.add(zawodnik1);
        listaZawodnikow.add(zawodnik2);
        listaZawodnikow.add(zawodnik3);

        // Sortowanie po imieniu
        System.out.println("Sortowanie po imieniu:");
        Collections.sort(listaZawodnikow, new ImieComparator());
        for (Zawodnik zawodnik : listaZawodnikow) {
            System.out.println(zawodnik.getImie() + " " + zawodnik.getNazwisko());
        }

        // Sortowanie po numerze
        System.out.println("Sortowanie po numerze:");
        Collections.sort(listaZawodnikow, new NumerComparator());
        for (Zawodnik zawodnik : listaZawodnikow) {
            System.out.println(zawodnik.getNumer() + ": " + zawodnik.getImie() + " " + zawodnik.getNazwisko());
        }

        // Sortowanie po prędkości maksymalnej
        System.out.println("Sortowanie po prędkości maksymalnej:");
        Collections.sort(listaZawodnikow, new PredkoscMaxComparator());
        for (Zawodnik zawodnik : listaZawodnikow) {
            System.out.println(zawodnik.getPredkoscMax() + " m/s: " + zawodnik.getImie() + " " + zawodnik.getNazwisko());
        }
    }
}
