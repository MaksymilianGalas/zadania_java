import java.util.Scanner;
public class zad2_5 {
    public static void main(String[] args) {
        macierze();
        }
        public static int macierze(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj szerokosc  tablic: ");
            int szerokosc = scan.nextInt();
            System.out.println("Podaj wysokosc tablic: ");
            int wysokosc = scan.nextInt();
            int[][] tablica = new int[wysokosc][szerokosc];
            int[][] wynik = new int[wysokosc][szerokosc];
            int[][] tablica2 = new int[wysokosc][szerokosc];

            for (int i = 0; i < wysokosc; i++) {
                for (int j = 0; j < szerokosc; j++) {
                    tablica[i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i < wysokosc; i++) {
                for (int j = 0; j < szerokosc; j++) {
                    tablica2[i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i < wysokosc; i++) {
                for (int j = 0; j < szerokosc; j++) {
                    wynik[i][j] = tablica[i][j] + tablica2[i][j];
                }
            }
            for (int i = 0; i < wysokosc; i++) {
                for (int j = 0; j < szerokosc; j++) {
                    System.out.print(wynik[i][j] + " ");
                }
                System.out.println(" ");
            }
            return 0;
        }
    }
