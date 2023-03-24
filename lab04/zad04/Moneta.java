package zad04;

import java.util.Random;
public class Moneta {
    int wylosowana;
    public Moneta(){
        Random rand = new Random();
        this.wylosowana = rand.nextInt(2);
    }
}
