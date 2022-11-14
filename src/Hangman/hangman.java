package Hangman;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hangman {
    public static String [] words = {"python","java", "javascript", "kotlin"};
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> wordList = new ArrayList<>();

    public static void printBoard(ArrayList<String>wordList, int life){
        for (String x: wordList){
            System.out.print(x);

        }
    }

    public static boolean checkWinner(ArrayList<String>wordList, String theWord, int life){
        String winnerCheck = "";

        for (String x: wordList){
            winnerCheck += x;
        }

        if (winnerCheck.equals(theWord)){
            System.out.println("Thanks for playing!\nWe'll see how well you did in the next stage");
            return false;
        }else if (life == 0){
            System.out.println("You lost!");
            return  false;
        }


        return true;

    }
    public static void main(String[] args){

        String theWord = "";
        int life = 8;
        System.out.println("HANGMAN");

        int index = random.nextInt(words.length);
        theWord += words[index];


        for (int i = 0; i < theWord.length(); i++) {
            wordList.add("_");
        }
            while (checkWinner(wordList, theWord, life)) {
                printBoard(wordList, life);
                System.out.print("\nInput a letter: > ");
                String answer = scanner.nextLine();
                char letter = answer.charAt(0);

                if (wordList.contains(answer)){
                    life -= 1;
                }

                for (int i = 0; i < theWord.length(); i++) {
                    if (theWord.charAt(i) == letter) {
                        wordList.remove(i);
                        wordList.add(i, answer);

                    }
                }

                if (!wordList.contains(answer)) {
                    System.out.println("That letter doesn't appear in the word");
                    life -= 1;
                }


                System.out.println();
            }


    }
}
