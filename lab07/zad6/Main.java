package zad6;

public class Main {
    public static void main(String[] args) {
        String tekst = "Ala ma kota i 2 psy!";

        // Usunięcie liczb z tekstu
        String tekstBezLiczb = TransformacjaString.usunZnaki(tekst, Znak.LICZBA);
        System.out.println("Tekst bez liczb: " + tekstBezLiczb);

        // Podmiana liter spółgłoskowych na gwiazdki
        String tekstZGwiazdkami = TransformacjaString.podmienZnaki(tekst, Znak.SPOLGLOSKA, "*");
        System.out.println("Tekst z gwiazdkami w miejscu liter spółgłoskowych: " + tekstZGwiazdkami);

        // Pozostawienie tylko samogłosek
        String tekstTylkoSamogloski = TransformacjaString.pozostawZnaki(tekst, Znak.SAMOGLOSKA);
        System.out.println("Tekst z pozostawionymi tylko samogłoskami: " + tekstTylkoSamogloski);
    }
}
