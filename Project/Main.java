package Project;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main extends RandomWords{
    public static void main(String[] args) {
        RandomWords randomWords = new RandomWords();
        Gallows gallows = new Gallows();
        String drawn = randomWords.drawnWord();
        Scanner scan = new Scanner(System.in);
        String[] wordArr;
        String[] guessedArr = new String[drawn.length()];
        String[] notGuessedArr = new String[50];
        wordArr = drawn.split("(?!^)");
        Arrays.fill(guessedArr, "_");
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
            playerGuess = scan.nextLine();
            if (playerGuess.length() != 1 || !playerGuess.matches("[a-zA-Z]")) {
                System.out.println("Wrong input. Please enter a single letter.");
            } else {
                if (drawn.contains(playerGuess)) {
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
                if((wrongLetters.length()-1)<13){
                gallows.gallows((wrongLetters.length()-1));
                System.out.println("Wrong letters: " + wrongLetters.substring(0, wrongLetters.length() - 1));
                }else{
                    gallows.gallows((wrongLetters.length()-1));
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
        }

    }
}
