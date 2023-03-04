import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        String[][] daneStudenta = new String[51][2];
        int[] iloscPunktow = new int[51];
        System.out.println("podaj ilosc studentow: ");
        Scanner scan = new Scanner(System.in);
        int ilosc = scan.nextInt();
        for(int i=0; i<ilosc; i++){
            System.out.println("podaj imie " + (i+1) + " studenta");
            daneStudenta[i][0] = scan.next();
            System.out.println("podaj nazwisko " + (i+1) + " studenta");
            daneStudenta[i][1] = scan.next();
            System.out.println("podaj ilosc punktow " + (i+1) + " studenta");
            iloscPunktow[i] = scan.nextInt();
        }
        int naj = najwieksza(iloscPunktow, ilosc);
        System.out.println("najlepszy student to: ");
        System.out.printf(daneStudenta[naj][0] /* +" "+ daneStudenta[naj][1]  */ + " "+ iloscPunktow[naj]);
        }

    public static int najwieksza(int[] iloscPunktow, int ilosc){
        int max = 0;
        int pamietajI =0;
        for(int i = 0; i < ilosc; i++){
            if(iloscPunktow[i] > max){
                max = iloscPunktow[i];
                pamietajI = i;
            }
        }
        return pamietajI;
    }
}
