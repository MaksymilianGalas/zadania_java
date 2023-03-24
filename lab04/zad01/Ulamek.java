package zad01;
import java.util.Scanner;
public class Ulamek {
    public Ulamek(int liczba1, int liczba2, int liczba2_1, int liczba2_2) {
        ;
        Scanner scan = new Scanner(System.in);

            System.out.println("jaka operacje chcesz wykonac: \n1-dodawanie \n2-odejmowanie\n3-dzielenie\n4-mnozenie\n5-wyswietl ulamki\n6-wyjdz z programu");
            int polecenie = scan.nextInt();
            switch (polecenie) {
                case 1:
                    Dodawanie(liczba1, liczba2, liczba2_1, liczba2_2);
                    break;
                case 2:
                    Odejmowanie(liczba1, liczba2, liczba2_1, liczba2_2);
                    break;
                case 3:
                    Dzielenie(liczba1, liczba2, liczba2_1, liczba2_2);
                    break;
                case 4:
                    Mnozenie(liczba1, liczba2, liczba2_1, liczba2_2);
                    break;
                case 5:
                    Wyswietl(liczba1, liczba2, liczba2_1, liczba2_2);
                    break;
            }
        }
        public void Dodawanie ( int liczba1, int liczba2, int liczba2_1, int liczba2_2){
            int pomocnicza = liczba2;
            liczba1 = liczba1 * liczba2_2;
            liczba2 = liczba2 * liczba2_2;
            liczba2_1 = liczba2_1 * pomocnicza;
            liczba2_2 = liczba2_2 * pomocnicza;
            System.out.println(liczba1 + liczba2_1 + "/" + liczba2_2);
        }
        public void Odejmowanie ( int liczba1, int liczba2, int liczba2_1, int liczba2_2){
            int pomocnicza = liczba2;
            liczba1 = liczba1 * liczba2_2;
            liczba2 = liczba2 * liczba2_2;
            liczba2_1 = liczba2_1 * pomocnicza;
            liczba2_2 = liczba2_2 * pomocnicza;
            System.out.println(liczba1 - liczba2_1 + "/" + liczba2_2);
        }
        public void Dzielenie ( int liczba1, int liczba2, int liczba2_1, int liczba2_2){
            System.out.println((liczba1 * liczba2_2) + "/" + (liczba2 * liczba2_1));
        }
        public void Mnozenie ( int liczba1, int liczba2, int liczba2_1, int liczba2_2){
            System.out.println((liczba1 * liczba2_1) + "/" + (liczba2 * liczba2_2));
        }
        public void Wyswietl ( int liczba1, int liczba2, int liczba2_1, int liczba2_2){
            System.out.println("ulamek 1: " + liczba1 + "/" + liczba2);
            System.out.println("ulamek 2: " + liczba2_1 + "/" + liczba2_2);
        }

}
