package zad4;
public class Czas {
    private int godziny;
    private int minuty;

    public Czas(int godziny, int minuty) {
        this.godziny = godziny;
        this.minuty = minuty;
    }

    public String toString() {
        return godziny + "h " + minuty + "min";
    }

    public Czas dodaj(Czas t) {
        int minutySuma = this.minuty + t.minuty;
        int godzinySuma = this.godziny + t.godziny;

        if (minutySuma >= 60) {
            godzinySuma += 1;
            minutySuma -= 60;
        }

        return new Czas(godzinySuma, minutySuma % 60);
    }

    public Czas odejmij(Czas t) {
        int minutyRoznica = this.minuty - t.minuty;
        int godzinyRoznica = this.godziny - t.godziny;

        if (minutyRoznica < 0) {
            godzinyRoznica -= 1;
            minutyRoznica += 60;
        }

        return new Czas(godzinyRoznica, minutyRoznica);
    }

    public Czas pomnoz(int krotnosc) {
        int minutySuma = this.minuty * krotnosc;
        int godzinySuma = this.godziny * krotnosc;

        if (minutySuma >= 60) {
            godzinySuma += minutySuma / 60;
            minutySuma %= 60;
        }

        return new Czas(godzinySuma + minutySuma / 60, minutySuma % 60);
    }
}
