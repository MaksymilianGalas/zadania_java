import java.util.Random;
import java.util.Scanner;
public class zad10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int komputer1 = rand.nextInt(3);
        System.out.println("podaj liczbe 0-2 \n0-kamien \n1-papier \n2-nozyce");
        int czlowiek1 = scan.nextInt();
        if(komputer1 == czlowiek1){
            System.out.println("remis");
        } else if ((komputer1==0 && czlowiek1==2)|| (komputer1 ==2 && czlowiek1 ==1) || (komputer1) == 1 && czlowiek1 == 0) {
            System.out.println("maszyna wygrala(maszyny górą)");
        } else{
            System.out.println("czlowiek wygral, gratuluje :D");
        }

    }
}
