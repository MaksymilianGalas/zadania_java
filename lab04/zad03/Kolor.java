package zad03;
public enum Kolor {
    KIER("Kier"),
    KARO("Karo"),
    TREFL("Trefl"),
    PIK("Pik");

    private final String nazwaKoloru;

    Kolor(String nazwaKoloru) {
        this.nazwaKoloru = nazwaKoloru;
    }

    public String getNazwaKoloru() {
        return nazwaKoloru;
    }
}