package lab10;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MojeMetody {

    public static <T> Set<T> metoda1(List<T> lista) {
        Set<T> unikalneElementy = new HashSet<>();
        Set<T> zduplikowaneElementy = new HashSet<>();

        for (T element : lista) {
            if (!unikalneElementy.add(element)) {
                zduplikowaneElementy.add(element);
            }
        }

        return zduplikowaneElementy;
    }

    public static <T> Set<T> metoda2(List<T> lista){
        Set<T> zduplikowaneElementy = metoda1(lista);
        Set<T> unikalne = new HashSet<>();
        for (T element : lista) {
            if (zduplikowaneElementy != element) {
                unikalne.add(element);
            }
        }
        return unikalne;
    }
    public static void main(String[] args) {
        List<Integer> listaLiczb = List.of(1, 2, 2, 3, 5, 5, 5);

        System.out.println(metoda1(listaLiczb));
        System.out.println(metoda2(listaLiczb));
    }
}
