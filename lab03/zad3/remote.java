package zad3;
import java.util.Scanner;

public class remote {
    public static void main(String[] args) {
        tv kanal = new tv(1, 10, true);

        while (kanal.on) {
            System.out.printf("kanał: " + kanal.channel + " glosnosc: " + kanal.volume + "\n");
            System.out.println("podaj operacje:\n 1 - zmien kanał \n 2-zmien glosnosc \n 3- on/off \n");
            Scanner scan = new Scanner(System.in);
            int zmienna = scan.nextInt();
            switch (zmienna) {
                case 1 -> {
                    if (kanal.on) {
                        System.out.println("wpisz nr kanalu");
                        kanal.channel = scan.nextInt();
                    } else {
                        System.out.println("telewizor jest wylaczony");
                    }
                }
                case 2 -> {
                    if (kanal.on) {
                        System.out.println("+zwieksz glosnosc \n-zmniejsz glosnsc ");
                        String glos = scan.next();
                        if (glos.equals("+")) {
                            kanal.volume++;
                        } else if (glos.equals("-")) {
                            kanal.volume--;
                        } else {
                            System.out.println("error");
                        }
                    } else {
                        System.out.println("telewizor jest wylaczony");
                    }
                }
                case 3 -> {
                    kanal.on = false;
                }
                default -> {
                    return;
                }
            }
        }
    }
}
