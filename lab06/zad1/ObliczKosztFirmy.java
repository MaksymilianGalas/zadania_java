package zad1;

public class ObliczKosztFirmy {
    public static double obliczKosztFirmy(Czas czas, int krotnosc, Pracownik[] pracownicy) {
        int dniWMiesiacu = czas.getDni();
        if (czas == Czas.ROK) {
            dniWMiesiacu *= 12;
        }

        double koszt = 0;
        for (Pracownik p : pracownicy) {
            koszt += p.getDzienneWynagrodzenie() * dniWMiesiacu * krotnosc;
        }

        return koszt;
    }

}
