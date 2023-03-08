import java.util.Arrays;
import java.util.Scanner;
public class zad2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj szerokosc 1 tablicy: ");
        int szerokosc = scan.nextInt();
        System.out.println("Podaj wysokosc 1 tablicy: ");
        int wysokosc = scan.nextInt();
        int[][] tablica = new int[wysokosc][szerokosc];
        int[][] wynik = new int[wysokosc][szerokosc];
        for(int i = 0; i<wysokosc; i++ ){
            for(int j =0; j<szerokosc; j++){
                tablica[i][j] = scan.nextInt();
            }
        }
        System.out.println("Podaj szerokosc 2 tablicy: ");
        int szerokosc2 = scan.nextInt();
        System.out.println("Podaj wysokosc 2 tablicy: ");
        int wysokosc2 = scan.nextInt();
        int[][] tablica2 = new int[wysokosc2][szerokosc2];
        for(int i = 0; i<wysokosc2; i++ ){
            for(int j =0; j<szerokosc2; j++){
                tablica2[i][j] = scan.nextInt();
            }
        }
        if(szerokosc == szerokosc2 && wysokosc == wysokosc2) {
            for (int i = 0; i < wysokosc2; i++) {
                for (int j = 0; j < szerokosc2; j++) {
                    wynik[i][j] = tablica[i][j] + tablica2[i][j];
                }
            }
            for (int i = 0; i < wysokosc; i++) {
                for (int j = 0; j < szerokosc; j++) {
                    System.out.print(wynik[i][j] + " ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("blad");
        }
    }
}