package zad04;

public class Symulacja {
    double rzut = 0;
    double wynik = 0;
    public Symulacja(double ilosc){
        this.wynik = wynik;
        this.rzut = rzut;
        for(int i=0; i<ilosc; i++){
            Moneta adam = new Moneta();
            if(adam.wylosowana == 0){
                rzut = rzut +1;
            }
            wynik = (rzut/ilosc) * 100;
        }

    }
}
