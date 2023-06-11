package Project;
import java.util.Random;
public class RandomWords extends Gallows{
    String[] words = new String[]{
            "dom", "kot", "pies", "drzewo", "telefon", "kwiat", "samochód", "komputer", "książka", "lampa", "piłka", "woda",
            "telewizor", "kawa", "okno", "słońce", "deszcz", "lato", "zima", "wiosna", "jesień", "wiatr", "chmura", "góra",
            "morze", "rzeka", "łąka", "kwiat", "trawa", "papier", "długopis", "ołówek", "farba", "obraz", "muzyka", "gitara",
            "klawisze", "śpiew", "kino", "teatr", "muzeum", "obraz", "rzeźba", "sport", "piłka", "koszykówka", "siatkówka",
            "tenis", "basen", "bieganie", "jazda", "spacer", "planeta", "gwiazda", "księżyc", "wszechświat", "galaktyka",
            "meteor", "satelita", "planeta", "krajobraz", "miasto", "ulica", "dom", "drzwi", "pokój", "łóżko", "stół", "krzesło", "kuchnia",
            "lodówka", "piekarnik", "telewizor", "komputer", "programowanie", "algorytm", "zmienna", "funkcja", "klasa", "interfejs", "tablica",
            "lista", "plik", "folder", "internet", "strona", "link", "przeglądarka", "serwer", "dane", "hasło", "logowanie", "rejestracja",
            "wysyłanie", "odbieranie", "komunikacja", "napis", "liczba", "punkty", "maksymalnie", "operacja", "warunek", "pętla", "funkcja",
            "sortowanie", "wyszukiwanie", "baza", "SQL", "system", "plik", "grafika", "dźwięk", "wideo", "zdjęcie", "animacja",
            "projekt", "zadanie", "raport", "prezentacja", "książka", "czasopismo", "gazeta", "czytanie", "pisanie", "język", "tłumaczenie", "słownik", "nauka", "szkoła", "uczeń",
            "nauczyciel", "egzamin", "wynik", "klasa", "lekcja", "zadanie", "podręcznik", "laboratorium", "próba", "doświadczenie", "wynalazek", "innowacja",
            "technologia", "program", "aplikacja", "system", "komponent", "algorytm", "debugowanie", "kod", "interfejs", "testowanie",
            "projektowanie", "zarządzanie", "wydajność", "bezpieczeństwo", "sieć", "protokół", "serwer", "klient", "administrator", "haker", "atakuje",
            "firewall", "antywirus", "optymalizacja", "kompilacja", "interpretacja", "debugowanie", "rozszerzenie", "dekompozycja", "integracja", "cykl",
            "rozwój", "planowanie", "specyfikacja", "analiza", "projekt", "implementacja", "testowanie", "wdrożenie", "konserwacja",
            "naprawa", "poprawka", "aktualizacja", "wydanie", "wersja", "backup", "odzyskiwanie", "replikacja", "synchronizacja", "archiwizacja", "kopia",
            "odzyskiwanie", "plan", "krytyczny", "ryzyko", "zarządzanie", "zasoby", "budżet", "harmonogram",
            "przydział", "monitoring", "raportowanie", "przywództwo", "motywacja", "kreatywność", "innowacyjność", "komunikacja", "negocjacje",
            "rozwiązywanie", "decyzje", "współpraca", "dyscyplina", "odpowiedzialność", "efektywność", "produktywność",
            "jakość", "doskonalenie", "rozwój", "szkolenie", "mentor", "ocena", "awans", "kariera", "zarobki",
            "praca", "zadanie", "projekt", "spotkanie", "raport", "prezentacja", "negocjacje", "współpraca", "biuro",
            "wydajność", "motywacja", "stres", "kreatywność", "decyzyjność", "asertywność", "negocjacje", "wizualizacja", "koncentracja", "efektywność", "produktywność", "jakość",
            "doskonalenie", "uczciwość", "integrytet", "etyka", "społeczność", "różnorodność", "inkluzywność", "ekologia", "odpady", "energia", "papuga",
            "recykling", "świadomość", "ekosystem", "środowisko", "zmiany", "ekologiczny", "równowaga", "życie", "odpady",
            "woda", "przyroda", "zasoby", "ochrona", "przyroda", "lasy", "piękno", "hodowla", "ogrodnictwo", "krajobraz", "wakacje", "podróże", "przygoda", "relaks",
            "wypoczynek", "zdrowie", "aktywność", "dieta", "powietrze", "medytacja", "yoga", "fitness", "zabawa", "muzyka", "film", "gra", "sztuka",
            "kultura", "historia", "nauka", "czytanie", "edukacja", "kształcenie", "badania", "innowacje", "postęp", "społeczeństwo", "technologia",
            "kultura", "wartości", "misja", "wizja", "strategia", "cel", "kształtowanie", "lider", "pracownik", "zespół", "współpraca", "dowództwo",
            "motywacja", "kreatywność", "innowacyjność", "zaangażowanie", "efektywność",
    }; //23 letter max
    Random random = new Random();
    public String drawnWord(){
        String drawnWord = words[random.nextInt(words.length)];
        return drawnWord;
    }



}
