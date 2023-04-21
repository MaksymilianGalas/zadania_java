package zad1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValidInput = false;
        Osoba osoba = null;

        while(!isValidInput) {
            try {
                System.out.print("Podaj imię: ");
                String imie = scanner.nextLine();

                System.out.print("Podaj nazwisko: ");
                String nazwisko = scanner.nextLine();

                System.out.print("Podaj rok urodzenia: ");
                int rokUrodzenia = Integer.parseInt(scanner.nextLine());

                osoba = new Osoba(imie, nazwisko, rokUrodzenia);
                if(Osoba.sprawdzException == 0){
                    isValidInput = true;
                }

            } catch (Exception e) {
                System.out.println("Nie udało się utworzyć obiektu Osoba: " + e.getMessage());
            }
        }

        System.out.println("Utworzono obiekt Osoba: " + osoba.toString());
    }
}