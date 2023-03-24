package zad05;
import java.util.Random;

public class Zawodnik {

    Random rand = new Random();
    String imie;
    String nazwisko;
    int min;
    int max;
    public Zawodnik(String imie, String nazwisko, int min, int max){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.min = min;
        this.max = max;
    }
    public void przedstawSie(){
        System.out.printf("Jestem " + imie +" "+ nazwisko + " biegam z prędkością " + min + "-" + max + "\n");
    }
    public double biegnij(double odleglosc){
        double predkosc = rand.nextInt(max-min) + min;
        double czas = (odleglosc/predkosc);
        return czas;
    }
}
