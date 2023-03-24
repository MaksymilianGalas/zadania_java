package zad03;

public class Karta {
    private final Kolor kolor;
    private final int figura;

    public Karta(Kolor kolor, int figura) {
        this.kolor = kolor;
        this.figura = figura;
    }




    public String getNazwaFigury() {
        return Figura.values()[figura - 2].toString();
    }

    public String toString() {
        return getNazwaFigury() + " " + kolor.getNazwaKoloru();
    }
}