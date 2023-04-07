package zad2;

public class Zamowienie {
    private Pozycja[] pozycje;
    final int maksRozmiar;

    public Zamowienie() {
        this(10);
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        this.pozycje = new Pozycja[maksRozmiar];
    }

    public void dodajPozycje(Pozycja pozycja) {
        if (pozycje[pozycje.length - 1] != null) {
            System.out.println("Nie można dodać kolejnej pozycji. Maksymalna liczba pozycji to " + pozycje.length);
        } else {
            for (int i = 0; i < pozycje.length; i++) {
                if (pozycje[i] == null) {
                    pozycje[i] = pozycja;
                    break;
                }
            }
        }
    }

    public double obliczWartosc() {
        double suma = 0;
        for (Pozycja pozycja : pozycje) {
            if (pozycja != null) {
                suma += pozycja.obliczWartosc();
            }
        }
        return suma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zamówienie:\n");
        for (Pozycja pozycja : pozycje) {
            if (pozycja != null) {
                sb.append(pozycja.toString()).append("\n");
            }
        }
        sb.append("Razem: ").append(obliczWartosc()).append(" zł");
        return sb.toString();
    }
}
