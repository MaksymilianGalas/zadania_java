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
        System.out.println("Podaj wartosi pierwszej tabeli: ");
        for(int i=0; i<n; i++)
        {
            tablica[i]=scan.nextInt();
        }
        System.out.println("Podaj wartosi drugiej tabeli: ");
        for(int i=0; i<n; i++)
        {
            tablica1[i]=scan.nextInt();
        }
        for(int i =0; i<n; i++){
            wynik[i] = tablica[i] + tablica1[i];
        }
        System.out.println(Arrays.toString(wynik));
    }
}
