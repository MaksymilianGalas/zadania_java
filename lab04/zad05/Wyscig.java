package zad05;

import java.util.Arrays;

public class Wyscig {
    public static void main(String[] args) {
        Zawodnik jasiu = new Zawodnik("Michał","Brzeszczot", 1, 7);
        Zawodnik arek = new Zawodnik("Włodzimierz","Biały", 3, 6);
        Zawodnik grzes = new Zawodnik("Adam","Małysz", 4, 5);
        jasiu.przedstawSie();
        arek.przedstawSie();
        grzes.przedstawSie();
        double wynik1 = jasiu.biegnij(50);
        double wynik2 = arek.biegnij(50);
        double wynik3= grzes.biegnij(50);
        if(wynik1<wynik2 && wynik1<wynik3){
            System.out.println("Zwyciezca :" + jasiu.imie);
        } else if (wynik2<wynik3 && wynik2<wynik1){
            System.out.println("Zwyciezca :" + arek.imie);
        } else if (wynik3<wynik2 && wynik3<wynik1){
            System.out.println("Zwyciezca :" + grzes.imie);
        }else {
            System.out.println("Remis ");
        }
    }
}
