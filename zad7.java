import java.util.Scanner;
public class zad7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza litere ");
        char litera1 = scan.next().charAt(0);
        System.out.println("Podaj druga litere ");
        char litera2 = scan.next().charAt(0);
        if(litera1 == litera2){
            System.out.println("litery sa takie same");
        } else if (litera1 > litera2) {
            System.out.println("litera pierwsza jest dalej w alfabecie");
        }else{
            System.out.println("litera druga jest dalej w alfabecie");
        }
    }
}
