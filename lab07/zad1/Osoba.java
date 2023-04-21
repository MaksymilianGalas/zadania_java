package zad1;

import java.util.Scanner;

public class Osoba {
    public static int sprawdzException;
    private String imie;
    private String nazwisko;
    
    private int rokUrodzenia;



    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.sprawdzException = 0;
        try {
            sprawdz(imie, nazwisko, rokUrodzenia);
        } catch (Exception exception) {
            this.sprawdzException = 1;
            System.out.println(exception.getMessage());
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }


    private void sprawdz(String imie, String nazwisko, int rokUrodzenia) throws ImieException ,NazwiskoException, RokException{
       
            if (imie.isEmpty()) {
                throw new ImieException("Podano niewłaściwe imie");
            }
            if (nazwisko.isEmpty()) {
                throw new NazwiskoException("Podano niewłaściwe nazwisko!");
            }
            if (rokUrodzenia < 1900 || rokUrodzenia > 2023) {
                throw new RokException("Podano niewłaściwy rok urodzenia!");
            }
      
    }
    @Override
    public String toString(){
    return imie + " " + nazwisko + ", ur. " + rokUrodzenia;
    }

    private class ImieException extends Exception {
        ImieException(String error){
            super(error);
        }
    }

    private class NazwiskoException extends Exception {
        NazwiskoException(String error){
            super(error);
        }
    }

    private class RokException extends Exception {
        RokException(String error){
            super(error);
        }
    }
}
