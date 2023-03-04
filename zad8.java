import java.util.Arrays;
import java.util.Scanner;
public class zad8 {
   public static void main(String[] args) {
       int liczby[] = new int[3];
       Scanner scan = new Scanner(System.in);
       System.out.println("podaj pierwsza liczbe: ");
       liczby[0] = scan.nextInt();
       System.out.println("podaj druga liczbe: ");
       liczby[1] = scan.nextInt();
       System.out.println("podaj trzecia liczbe: ");
       liczby[2] = scan.nextInt();
       Arrays.sort(liczby);
       for(int i=liczby.length; i>0; i--){
           System.out.printf(liczby[i-1] + "        "); //tak ladniej wyglada :)
       }

   }
}
