package Hangman;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        Scanner scanner = new Scanner(System.in);
        String[] rightWord = {"python","java", "javascript", "kotlin"};
        System.out.print("Guess the word: > ");
        String userWord = scanner.next();
        int a = (int) (Math.random() * 4);
        if (userWord.equals(rightWord[a])) {
            System.out.println("You survived!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}
