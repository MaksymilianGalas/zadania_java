package zad1;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double dzienneWynagrodzenie;

    public Pracownik(String imie, String nazwisko, double dzienneWynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzienneWynagrodzenie = dzienneWynagrodzenie;
    }

    public double getDzienneWynagrodzenie() {
        return dzienneWynagrodzenie;
    }


}
