package zad4;

import java.util.Comparator;

public class Zawodnik {
    private String imie;
    private String nazwisko;
    private int numer;
    private double predkoscMax;

    public Zawodnik(String imie, String nazwisko, int numer, double predkoscMax) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
        this.predkoscMax = predkoscMax;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumer() {
        return numer;
    }

    public double getPredkoscMax() {
        return predkoscMax;
    }
}

class ImieComparator implements Comparator<Zawodnik> {
    @Override
    public int compare(Zawodnik z1, Zawodnik z2) {
        return z1.getImie().compareTo(z2.getImie());
    }
}

class NumerComparator implements Comparator<Zawodnik> {
    @Override
    public int compare(Zawodnik z1, Zawodnik z2) {
        return Integer.compare(z1.getNumer(), z2.getNumer());
    }
}

class PredkoscMaxComparator implements Comparator<Zawodnik> {
    @Override
    public int compare(Zawodnik z1, Zawodnik z2) {
        return Double.compare(z1.getPredkoscMax(), z2.getPredkoscMax());
    }
}
