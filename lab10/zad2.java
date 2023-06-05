package lab10;

import java.util.*;

public class zad2 {

    public static <T> void lotto(List<T> lista) {
        Random generator = new Random();
        Set<Integer> wygraneLiczby = new HashSet<>();

        while (wygraneLiczby.size() < 6) {
            int losowaIndex = generator.nextInt(49) + 1;
            wygraneLiczby.add(losowaIndex);
        }
        for (T element : lista) {
            if(wygraneLiczby.contains(element)){
                System.out.println("Gratulacje! zgadłeś liczbę: " + element);
            }
        }
        System.out.println( "Wygrane liczby: " + wygraneLiczby);
    }

    public static void main(String[] args) {
        List<Integer> listaLiczb= new ArrayList<>(6);
        int liczbaLosow =0;
        while(liczbaLosow<6) {
            liczbaLosow += 1;
            try {
                System.out.println("Podaj liczbę od 1 do 49");
                Scanner scan = new Scanner(System.in);
                int liczbaUzytkownika = scan.nextInt();
                if (liczbaUzytkownika == (int) liczbaUzytkownika) {
                    listaLiczb.add(liczbaUzytkownika);
                }
            }catch(InputMismatchException e){
                System.out.println("Podaj prawidłową liczbe!");
            }
        }
        lotto(listaLiczb);
    }
}
