package lab10;

import java.util.HashMap;
import java.util.Map;

public class zad4 {
    public static void zliczWystapieniaSlow(String tekst){
        Map<String, Integer> slowa = new HashMap<String, Integer>();
        String[] result = tekst.split("");
        for (String slowo : result) {
            slowa.compute(slowo, (k, v) -> v == null ? 1 : v + 1);
        }
        System.out.println(slowa);
    }

    public static void main(String[] args) {
        zliczWystapieniaSlow("ala ma kota, kot ma ale");

    }
}
