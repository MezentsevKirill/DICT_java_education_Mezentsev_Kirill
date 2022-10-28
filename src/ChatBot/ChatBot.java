package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        System.out.println("Hello! My name is Alex");
        System.out.println("I was created in 2022");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, remind me your name");
        String userName = scanner.next();
        System.out.println("What a great name you have, " + userName + "!");
    }
}
