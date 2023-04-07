package zad6;

public class Main {
    public static String usunCoNte(String[] slowa, int n) {
        String wynik = "";
        for (int i = 0; i < slowa.length; i++) {
            if ((i + 1) % n != 0) {
                wynik += slowa[i] + " ";
            }
        }
        return wynik.trim();
    }

    public static void main(String[] args) {
        String[] slowa = {"Ala","nie","ma","test","kota i","psa","papuge"};
        int n = 2;
        String wynik = usunCoNte(slowa, n);
        System.out.println(wynik); // Ala ma kota i papugę
    }
}

