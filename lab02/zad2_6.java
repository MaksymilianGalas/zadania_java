import java.util.Scanner;
public class zad2_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj 1 liczbe: ");
        int liczba1 = scan.nextInt();
        System.out.println("podaj 2 liczbe: ");
        int liczba2 = scan.nextInt();
        System.out.println(nwd(liczba1, liczba2));
    }
    public static int nwd(int a, int b)
    {
        while(a!=b)
            if(a>b) {
                a -= b;
            }else {
                b -= a;
            }
        return a;
    }
}
