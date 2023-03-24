package zad02;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("podaj zakres górny (np 1-50): ");
        Scanner scan = new Scanner(System.in);
        int gora = scan.nextInt();
        new Gra(gora);
    }
}
