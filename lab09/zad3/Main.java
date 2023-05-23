package zad3;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\makse\\IdeaProjects\\lab09\\src\\zad3\\slownik.txt"); // nie wiem dlaczego inaczej nie działa :))
        Slownik<String, String> slownik = Slownik.wczytajSlownik(file);

        System.out.println(slownik.toString());
    }
}
