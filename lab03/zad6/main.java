package zad6;
import java.util.Random;

import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz poziom trudności: \n1 - Latwy \n2 - Sredni \n3-Trudny");
        int trudnosc = scan.nextInt();
        if(!(trudnosc >= 1 && trudnosc<= 3)){
            trudnosc = scan.nextInt();
            while(!(trudnosc >= 1 && trudnosc<= 3)) {
                if(!(trudnosc >= 1 && trudnosc<= 3)) {
                    trudnosc = scan.nextInt();
                }
            }
        }
        Gracz gracz = new Gracz(100);
        Przeciwnik przeciwnik = new Przeciwnik(100);

        Zbroja zbroja[] = new Zbroja[5];
        zbroja[0] = new Zbroja("Amelinumowa",5);
        zbroja[1] = new Zbroja("Skórzana",15);
        zbroja[2] = new Zbroja("Miedziana",30);
        zbroja[3] = new Zbroja("Stalowa",45);
        zbroja[4] = new Zbroja("Kamizelka kuloodporna",55);

        Bronie bronie[] = new Bronie[5];
        bronie[0] = new Bronie("Patyk",10,90);
        bronie[1] = new Bronie("gaz rurka",22,60);
        bronie[2] = new Bronie("katana",34,20);
        bronie[3] = new Bronie("Diamentowy miecz ostrość 5",43,10);
        bronie[4] = new Bronie("Rewolwer",50,10);

        System.out.println("Wybierz zbroje: ");
        for(int i =0; i< zbroja.length; i++){
            System.out.println(i + " - " + zbroja[i].nazwa + " ochrona: " + zbroja[i].obrona);
        }
        int graczZbroja = scan.nextInt();
        if(!(graczZbroja >= 0 && graczZbroja <= 4)){
            graczZbroja = scan.nextInt();
            while(!(graczZbroja >= 0 && graczZbroja <= 4)) {
                if(!(graczZbroja >= 0 && graczZbroja <= 4)) {
                    graczZbroja = scan.nextInt();
                }
            }
        }
        switch (trudnosc){
            case 1:
                przeciwnik.health = przeciwnik.health + 0;
                break;
            case 2:
                przeciwnik.health = przeciwnik.health + 25;
                break;
            case 3:
                przeciwnik.health = przeciwnik.health + 50;
                break;
        }
        System.out.println("Wybierz broń: ");
        for(int i =0; i< bronie.length; i++){
            System.out.println(i + " - " + bronie[i].nazwa + " obrazenia: " + bronie[i].atak);
        }
        int graczBron = scan.nextInt();
        if(!(graczBron >= 0 && graczBron <= 4)){
            graczBron = scan.nextInt();
            while(!(graczBron >= 0 && graczBron <= 4)) {
                if(!(graczBron >= 0 && graczBron <= 4)) {
                    graczBron = scan.nextInt();
                }
            }
        }

        Random rand = new Random();
        int przeciwnikZbroja = rand.nextInt(4);
        int przeciwnikBron = rand.nextInt(4);
        if(trudnosc == 3) {
            przeciwnikZbroja = rand.nextInt(5);
            przeciwnikBron = rand.nextInt(5);
        }
        System.out.println("oponent wylosował: \n bron: " + bronie[przeciwnikBron].nazwa + "  \n zbroje: " + zbroja[przeciwnikZbroja].nazwa+ "\n");
        System.out.printf("Zycie przeciwnika: " + przeciwnik.health+ "\n");
        System.out.println("Twoje zycie: " + gracz.health + "\n");
        System.out.println("Przycisnij dowolny przycisk aby kontynuowac:");
        String abc = scan.next();
        while(gracz.health > 0 && przeciwnik.health > 0){
            przeciwnik.health = przeciwnik.health - (atak(bronie[graczBron].atak, bronie[graczBron].procent, zbroja[przeciwnikZbroja].obrona, trudnosc));
            if(przeciwnik.health <= 0){
                System.out.println("Gratulacje, wygrałeś"+ "\n");
                System.out.println("Twoje zycie: " + gracz.health+ "\n");
                break;
            }else {
                System.out.println("Zycie przeciwnika: " + przeciwnik.health);
            }
            gracz.health = gracz.health - (atak(bronie[przeciwnikBron].atak, bronie[przeciwnikBron].procent, zbroja[graczZbroja].obrona, trudnosc));
            if(gracz.health <= 0){
                System.out.println("Przykro mi, przegrałeś"+ "\n");
                System.out.println("Zycie przeciwnika: " + przeciwnik.health+ "\n");
                break;
            }else {
                System.out.println("Twoje zycie: " + gracz.health);
            }
            System.out.println("Kolejna tura: \n");
        }


    }
    public static double atak(double atak, int procent, double zbroja, int poziomTrudnosci){
        Random rand = new Random();
        int n =rand.nextInt(100);
        double wynik = 0;
        switch (poziomTrudnosci){
            case 1:
                if(n <= procent){
                    wynik = (atak * 1.5 )/(1+(zbroja/100));// cricital attack

                }else{
                    wynik = (atak * 1)/(1+(zbroja/100));
                    break;
                }
                break;
            case 2:
                if(n <= procent){
                    wynik = atak * 2/(1+(zbroja/100));// cricital attack

                }else {
                    wynik = atak * 1/(1+(zbroja/100));
                }
                break;
            case 3:
                if(n <= procent){
                    wynik = atak * 2.1/(1+(zbroja/100)); // cricital attack

                }else {
                    wynik = atak * 1/(1+(zbroja/100));
                }
                break;
        }
        return (int) wynik;
    }
}
