package zad5;


public class Samochod {
    int predkosc = 0;
    String kolor;
    String marka;
    int rocznik;

    public Samochod(String kolor, String marka, int rocznik) {
        this.kolor = kolor;
        this.rocznik = rocznik;
        this.marka = marka;
    }

    public Samochod() {
    }

    public void przyspiesz() {
        if (this.predkosc <= 120) {
            this.predkosc += 20;
        }
    }

    public String toString() {
        return String.format("%s %s rocznik %d\n", kolor, marka, rocznik);
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Samochod)) return false;
        Samochod s = (Samochod) o;
        return this.kolor.equals(s.kolor) && this.marka.equals(s.marka) && this.rocznik == s.rocznik;
    }

    public static class SzybkiSamochod extends Samochod {
        public SzybkiSamochod(String kolor, String marka, int rocznik) {
            super(kolor, marka, rocznik);
        }

        public void przyspiesz() {
            if (this.predkosc <= 200) {
                this.predkosc += 20;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Samochod)) return false;
            Samochod s = (Samochod) o;
            return s instanceof SzybkiSamochod && this.kolor.equals(s.kolor) && this.marka.equals(s.marka) && this.rocznik == s.rocznik;
        }
    }
}
