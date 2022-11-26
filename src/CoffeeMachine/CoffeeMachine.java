package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;
        System.out.print("Write how many cups of coffee you will need:\n> ");
        int userInput = scanner.nextInt();
        System.out.println("For " + userInput + " cups of coffee you will need:\n" +
                water * userInput + " ml of water\n" +
                milk * userInput +" ml of milk\n" +
                coffeeBeans * userInput + " g of coffee beans");

    }
}
