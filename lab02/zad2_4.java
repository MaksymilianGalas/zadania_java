import java.util.Arrays;
import java.util.Scanner;
public class zad2_4 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj szerokosc tablicy: ");
            int szerokosc = scan.nextInt();
            System.out.println("Podaj wysokosc tablicy: ");
            int wysokosc = scan.nextInt();
            int[][] tablica = new int[wysokosc][szerokosc];
            for(int i = 0; i<wysokosc; i++ ){
                for(int j =0; j<szerokosc; j++){
                    tablica[i][j] = scan.nextInt();
                }
            }
            for(int i = 0; i<wysokosc; i++ ){
                for(int j =0 ; j<szerokosc; j++){
                    System.out.print(tablica[i][j] + " ");
                }
                System.out.println("");
            }

        }
    }

