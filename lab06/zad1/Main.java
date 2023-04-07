package zad1;

class main {

    public static void main(String[] args) {
        Pracownik[] pracownicy = new Pracownik[3];
        pracownicy[0] = new Pracownik("Jan", "Kowalski", 100);
        pracownicy[1] = new Pracownik("Anna", "Nowak", 150);
        pracownicy[2] = new Pracownik("Piotr", "Zieliński", 200);



        double kosztFirmy = ObliczKosztFirmy.obliczKosztFirmy(Czas.MIESIAC, 6, pracownicy);
        System.out.println("Koszt działalności firmy przez 6 miesięcy: " + kosztFirmy);


        kosztFirmy = ObliczKosztFirmy.obliczKosztFirmy(Czas.ROK, 2, pracownicy);
        System.out.println("Koszt działalności firmy przez 2 lata: " + kosztFirmy);
    }
}
