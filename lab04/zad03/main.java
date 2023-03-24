package zad03;

public class main {
    public static void main(String[] args) {
        Karta[] talia = new Karta[Kolor.values().length * Figura.values().length];
        int i = 0;
        for (Kolor kolor : Kolor.values()) {
            for (Figura figura : Figura.values()) {
                talia[i] = new Karta(kolor, figura.getWartosc());
                i++;
            }
        }
        int j=0;
        for (Karta karta : talia) {
            System.out.println(talia[j]);
            j++;
        }
    }
}
