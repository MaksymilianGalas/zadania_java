package zad5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lokal {
    private String nazwaLokalu;
    private String miejscowosc;
    private String kodPocztowy;
    private String ulica;
    private Integer numerDomu;
    private Integer numerLokalu;

    public Lokal(String nazwaLokalu, String adres) {
        this.nazwaLokalu = nazwaLokalu;

        Pattern pattern = Pattern.compile("(?<ulica>[^,]+),\\s*(?<numer>[\\d/]+),\\s*(?<kod>[\\d-]+)\\s*(?<miejscowosc>[^,]+)");
        Matcher matcher = pattern.matcher(adres);

        if (matcher.find()) {
            this.ulica = matcher.group("ulica");
            this.numerDomu = parseNumerDomu(matcher.group("numer"));
            this.kodPocztowy = matcher.group("kod");
            this.miejscowosc = matcher.group("miejscowosc");

            Pattern patternLokal = Pattern.compile("(?<numerLokalu>[\\d]+)");
            Matcher matcherLokal = patternLokal.matcher(adres);

            if (matcherLokal.find()) {
                this.numerLokalu = Integer.parseInt(matcherLokal.group("numerLokalu"));
            }
        } else {
            throw new IllegalArgumentException("Nieprawidłowy adres: " + adres);
        }
    }

    private Integer parseNumerDomu(String numer) {
        Pattern pattern = Pattern.compile("(?<numer>[\\d]+)");
        Matcher matcher = pattern.matcher(numer);

        if (matcher.find()) {
            return Integer.parseInt(matcher.group("numer"));
        } else {
            throw new IllegalArgumentException("Nieprawidłowy numer domu: " + numer);
        }
    }

    @Override
    public String toString() {
        return "Nazwa lokalu: " + nazwaLokalu + "\n" +
                "Miasto: " + miejscowosc + "\n" +
                "Ulica: " + ulica + "\n" +
                "Numer domu/lokalu: " + numerLokalu + "/" + numerDomu + "\n" +
                "Kod Pocztowy: " + kodPocztowy;
    }
}
