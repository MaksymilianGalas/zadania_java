import java.util.Scanner;
import java.util.Arrays;
public class zad2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        int wielkosc = scan.nextInt();
        System.out.println("Podaj pierwsza liczbe: ");
        int pierwsza = scan.nextInt();
        int[] tablica= new int[wielkosc];
        //tablica = new int[wielkosc];
        for(int i = 0; i<wielkosc; i++ ) {
            while (1==1) {
                if (pierwsza % 2 == 0 || pierwsza == 1) {
                    tablica[i] = pierwsza;
                    break;
                }
                pierwsza++;
            }pierwsza++;
        }
        int min = minimum1(tablica);
        maksimum(tablica);
        System.out.println("min: " + min);
        suma(tablica);
        srednia(tablica, wielkosc);
        mediana(tablica, wielkosc);
        System.out.println(Arrays.toString(tablica));
    }
    public static int minimum1(int[] tablica){
        int min = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            min = Math.min(min, tablica[i]);
        }
        return min;
    }
    public static int maksimum(int[] tablica){
        int max = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            max = Math.max(max, tablica[i]);
        }
        System.out.println("max: " + max);
        return 0;
    }
    public static int suma(int[] tablica){
        int suma = 0;
        for(int i=0; i<tablica.length; i++){
            suma = suma + tablica[i];
        }
        System.out.println("suma: " + suma);
        return suma;
    }
    public static double srednia(int[] tablica, int wielkosc){
        double suma = 0;
        for(int i=0; i<tablica.length; i++){
            suma = suma + tablica[i];
        }
        double srednia1 = suma / wielkosc;
        System.out.println("srednia: " + srednia1);
        return 0;
    }
    public static double mediana(int[] tablica, int wielkosc){
        double m = 0;
        if(wielkosc%2==1)
        {
            m=tablica[(wielkosc+1)/2-1];
        }
        else
        {
            m=(tablica[wielkosc/2-1]+tablica[wielkosc/2])/2;
        }
        System.out.println("mediana: "+ m);
        return 0;
    }
}

