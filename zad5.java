import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok trojkata: ");
        int bok1 = scan.nextInt();
        System.out.println("Podaj drugi bok trojkata: ");
        int bok2 = scan.nextInt();
        System.out.println("Podaj trzeci bok trojkata: ");
        int bok3 = scan.nextInt();
        if (bok1 > 0 && bok2 > 0 && bok3 > 0) {
            if (bok1 + bok2 > bok3 && bok1 + bok3 > bok2 && bok3 + bok2 > bok1) {
                System.out.println("trojkat jest prawidlowy ");
            } else {
                System.out.println("trojkat nie jest prawidlowy ");
            }
        }else{
            System.out.println("podaj dodatnie wartosci ");
        }
    }
}
