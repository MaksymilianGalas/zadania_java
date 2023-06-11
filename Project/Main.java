package Project;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main extends RandomWords{
    public static void main(String[] args) {
        RandomWords randomWords = new RandomWords(); //constructor
        Gallows gallows = new Gallows(); //constructor
        String drawn = randomWords.drawnWord();
        Scanner scan = new Scanner(System.in);
        String[] wordArr;  //array to store chosen word, one letter at a time
        String[] guessedArr = new String[drawn.length()];
        String[] notGuessedArr = new String[50];
        wordArr = drawn.split("(?!^)"); //function to split drawn word
        Arrays.fill(guessedArr, "_"); //fills up empty spaces
        Arrays.fill(notGuessedArr, "");
        System.out.println("The word has been chosen!");
        String playerGuess;
        System.out.println(drawn); //test -------------------------------------------------------------------------------------------------------

        for(int j=0; j<drawn.length(); j++){
            System.out.printf("_");
        }
        System.out.println("\n");
        String wrongLetters = "";
        while (true) {
            System.out.println("Input one letter: ");
            try {
                playerGuess = scan.nextLine();
                try {
                    if (playerGuess.length() != 1) {
                        throw new IllegalArgumentException("Too much data, try again");
                    } else if (!playerGuess.matches("[a-ząćęłńóśźż]")) {
                        if (playerGuess.matches("[A-Z]")) {
                            throw new IllegalArgumentException("Please input small letters only");
                        } else {
                            throw new IllegalArgumentException("Please input letters only");
                        }
                    } else {
                        if (drawn.contains(playerGuess)) {    // if letter chosen by the player exists in word, function changes "_" for letter
                            for (int i = 0; i < drawn.length(); i++) {
                                if (playerGuess.equals(wordArr[i])) {
                                    guessedArr[i] = playerGuess;
                                }
                            }
                        } else {
                            if (!wrongLetters.contains(playerGuess)) {
                                wrongLetters += playerGuess + ",";
                            } else {
                                System.out.println("Don't input the same letter twice.");
                                continue;
                            }
                        }

                    }


                    if (!wrongLetters.isEmpty()) {
                        if ((wrongLetters.length() - 1) < 13) {
                            gallows.gallows((wrongLetters.length() - 1));
                            System.out.println("Wrong letters: " + wrongLetters.substring(0, wrongLetters.length() - 1));
                        } else {
                            gallows.gallows((wrongLetters.length() - 1)); //end of game
                            break;
                        }
                    }
                    if (Arrays.equals(wordArr, guessedArr)) {
                        System.out.println("\nCongratulations! You guessed the word correctly.");
                        break;
                    }

                    for (int j = 0; j < drawn.length(); j++) {
                        System.out.printf(guessedArr[j]);
                    }
                    System.out.println("\n");
                } catch (NullPointerException e) {
                    System.out.println("Please input one letter");
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }

    }
}
