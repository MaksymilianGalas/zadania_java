package zad03;

public enum Figura {
    DWA(2),
    TRZY(3),
    CZTERY(4),
    PIEC(5),
    SZESC(6),
    SIEDM(7),
    OSIEM(8),
    DZIEWIEC(9),
    DZIESIEC(10),
    WALET(11),
    DAMA(12),
    KROL(13),
    AS(14);


    private final int wartosc;

    Figura(int wartosc) {
        this.wartosc = wartosc;
    }

    public int getWartosc() {
        return wartosc;
    }


    public String toString() {
        return Integer.toString(wartosc);
    }
}