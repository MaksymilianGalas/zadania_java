package Zad1;
import java.util.Scanner;
public class zad1_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj bok kwadratu: ");
        int bok123 = scan.nextInt();
        Kwadrat kwadrat = new Kwadrat(bok123);
        System.out.println("Pole: " + kwadrat.pole() + "\n");
        System.out.println("Obwod: " + kwadrat.obwod() + "\n");

    }
}
