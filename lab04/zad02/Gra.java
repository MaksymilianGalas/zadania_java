package zad02;
import java.util.Random;
import java.util.Scanner;
public class Gra {
    public Gra(int gora){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int wylosowana = rand.nextInt(gora);
        System.out.println("Komputer wylosowal liczbe. Podaj swoja: ");
        int i =1;
        int traf = 0;
        while(i <5){
            traf = scan.nextInt();
            if(traf == wylosowana){
                System.out.println("Gratulacje, wygrales!");
                break;
            } else if (traf <wylosowana) {
                System.out.println("za mala");
            }else{
                System.out.println("za duza");
            }
            i++;
        }
        if(traf != wylosowana){
            System.out.println("Przykro mi, wpisales niepoprawna liczbe 5 razy!");
        }
    }
}
