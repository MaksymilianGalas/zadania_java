import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj temperature w stopniach celsjusza: ");
        double celsius = scan.nextDouble();
        double farenheit = (double) Math.round (((celsius * (9/5F) ) + 32)*100)/100; //zaokraglanie do 2 miejsc po przecinku
        System.out.println(farenheit);
    }
}
