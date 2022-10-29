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

        System.out.println("Let me guess your age");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age =  (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
}
