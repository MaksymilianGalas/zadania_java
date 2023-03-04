import java.util.Scanner;

import static java.lang.Math.sqrt;

public class zad9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj x1: ");
        int x1 = scan.nextInt();
        System.out.println("podaj y1: ");
        int y1 = scan.nextInt();
        System.out.println("podaj x2: ");
        int x2 = scan.nextInt();
        System.out.println("podaj y2: ");
        int y2 = scan.nextInt();
        System.out.println(odleglosc(x1,y1,x2,y2));
    }
    public static double odleglosc(int x1, int y1, int x2, int y2){
        return(sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))));
    }
}
