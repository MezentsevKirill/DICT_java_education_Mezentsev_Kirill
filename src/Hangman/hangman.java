package Hangman;
import java.util.Scanner;
import java.util.Arrays;

public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        Scanner scanner = new Scanner(System.in);
        String[] rightWord = {"python"};
        System.out.print("Guess the word: > ");
        String userWord = scanner.next();
        boolean found = Arrays.asList(rightWord).contains(userWord);
        if (found) {
            System.out.println("You survived!");
        }

    }
}
