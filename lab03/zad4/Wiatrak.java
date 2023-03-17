package zad4;

public class Wiatrak {
    public Wiatrak() {}

    static Wiatrak wiatraczek = new Wiatrak(1, true, 5, "niebieski");
    public static void main(String[] args){
        new Wiatrak();
        String inf1 = informacje();
        System.out.println(inf1);
    }

    public static String informacje(){
        String inf;
        inf = "predkosc: " + wiatraczek.speed + "\non: " + wiatraczek.on + "\nsrednica: " + wiatraczek.radius + "\nkolor: " + wiatraczek.color;
        return inf;
    }
    static int SLOW = 1;
    static int MEDIUM = 2;
    static int FAST = 3;
    int speed;
    boolean on;
    int radius;
    String color;
    public Wiatrak(int speed, boolean on, int radius, String color){
        this.speed=speed;
        this.on=on;
        this.radius = radius;
        this.color = color;
    }

}
