package zad2;

public class Pozycja {
    private String nazwaTowaru;
    private int iloscSztuk;
    private double cenaSztuki;

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public double obliczWartosc() {
        return iloscSztuk * cenaSztuki;
    }

    public String toString() {
        return nazwaTowaru + " " + cenaSztuki + " zł " + iloscSztuk + " szt. " + obliczWartosc() + " zł";
    }
}
