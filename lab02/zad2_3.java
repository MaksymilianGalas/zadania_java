import java.util.Arrays;
import java.util.Scanner;
public class zad2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dlugosc tablic: ");
        int n = scan.nextInt();
        int[] tablica = new int[n];
        int[] tablica1 = new int[n];
        int[] wynik = new int[n];
        wpisywanie(tablica, tablica1, n, wynik);

    }

    public static int wpisywanie(int[] tablica, int[] tablica1, int n, int[] wynik) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            tablica[i] = scan.nextInt();
        }
        System.out.println("Podaj wartosi drugiej tabeli: ");
        for (int i = 0; i < n; i++) {
            tablica1[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wynik[i] = tablica[i] + tablica1[i];
        }
        System.out.println(Arrays.toString(wynik));
        return 0;
    }
}
