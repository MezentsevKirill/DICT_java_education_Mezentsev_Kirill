package Hangman;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        Scanner scanner = new Scanner(System.in);
        String[] rightWord = {"python","java", "javascript", "kotlin"};
        int a = (int) (Math.random() * 4);

        // 1-st if
        if (rightWord[a].equals("python")) {
            System.out.print("Guess the word py----: > ");
            String userWord = scanner.next();
            if (userWord.equals(rightWord[a])) {
                System.out.println("You survived!");
            } else {
                System.out.println("You lost!");
            }
        }

        // 2-nd stage
        if (rightWord[a].equals("java")) {
            System.out.print("Guess the word ja--: > ");
            String userWord = scanner.next();
            if (userWord.equals(rightWord[a])) {
                System.out.println("You survived!");
            } else {
                System.out.println("You lost!");
            }
        }

        // 3-nd stage
        if (rightWord[a].equals("javascript")) {
            System.out.print("Guess the word ja--------: > ");
            String userWord = scanner.next();
            if (userWord.equals(rightWord[a])) {
                System.out.println("You survived!");
            } else {
                System.out.println("You lost!");
            }
        }

        // 4-th stage
        if (rightWord[a].equals("kotlin")) {
            System.out.print("Guess the word ko----: > ");
            String userWord = scanner.next();
            if (userWord.equals(rightWord[a])) {
                System.out.println("You survived!");
            } else {
                System.out.println("You lost!");
            }
        }

    }
}
