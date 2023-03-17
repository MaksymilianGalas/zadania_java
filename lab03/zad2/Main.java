package zad2;
import java.util.Scanner;
public class Main {
    static punkt zero = new punkt(0,0);
    public static double odleglosc1(int x1, int y1, int x2, int y2){
        return java.lang.Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    public static double odleglosc(int x2, int y2){
        return java.lang.Math.sqrt((zero.x-x2)*(zero.x-x2) + (zero.y-y2)*(zero.y-y2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj dwie wartosci: \n x1:");
        int x1 = scan.nextInt();
        System.out.println("y1 :");
        int y1 = scan.nextInt();

        System.out.println("odleglosc od punktu 0,0 : " + odleglosc(x1,y1));
        punkt abc = new punkt(0,0);
        punkt abc123 = new punkt(2,5);
        double dane123 = odleglosc1(abc.x, abc.y, abc123.x, abc123.y);
        System.out.println("odleglosc pomiedzy punktami abc oraz abc123: " + dane123);
    }

}
