import java.util.Scanner;
public class zad6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj liczbe 1-7");
        int dzien = scan.nextInt();
        if(dzien >= 1 && dzien <= 7){
            switch(dzien) {
                case 1:
                    System.out.println("Poniedzialek");
                case 2:
                    System.out.println("wtorek");
                case 3:
                    System.out.println("sroda");
                case 4:
                    System.out.println("czwartek");
                case 5:
                    System.out.println("piatek");
                case 6:
                    System.out.println("sobota");
                case 7:
                    System.out.println("niedziela");
            }
        }
    }
}
