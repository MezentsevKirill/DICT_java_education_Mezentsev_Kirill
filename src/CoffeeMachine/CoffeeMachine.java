package CoffeeMachine;
import java.util.Scanner;



public class CoffeeMachine {
    public static int [] numbers = {400, 540, 120, 9, 550};
    public static Scanner scanner = new Scanner(System.in);

    public static void printBoard() {
        System.out.println("\nThe coffee machine has:\n" +
                numbers[0] + " of water\n" +
                numbers[1] + " of milk\n" +
                numbers[2] + " of coffee beans\n" +
                numbers[3] + " of disposable cups\n" +
                numbers[4] + " of money");
    }

    public static int [] espresso (){
         numbers[0] -= 250;
         numbers[2] -= 16;
         numbers[3] -= 1;
         numbers[4] -= 4;
         return numbers;
    }

    public static int [] latte (){
        numbers[0] -= 350;
        numbers[1] -= 75;
        numbers[2] -= 20;
        numbers[3] -= 1;
        numbers[4] -= 7;
        return numbers;
    }

    public static int [] cappuccino () {
        numbers[0] -= 200;
        numbers[1] -= 100;
        numbers[2] -= 12;
        numbers[3] -= 1;
        numbers[4] -= 6;
        return numbers;

    }

    public static void buy() {
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:\n> ");
        int userChoice = scanner.nextInt();
        if (userChoice == 1) {
            numbers = espresso();

        } else if (userChoice == 2) {
            numbers = latte();

        } else if (userChoice == 3) {
            numbers = cappuccino();

        }


    }

    public static void fill() {
        System.out.print("Write how many ml of water the coffee machine has:\n> ");
        int userWater = scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has:\n> ");
        int userMilk = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has:\n> ");
        int userCoffeeBeans = scanner.nextInt();
        System.out.print("Write how many disposable coffee cups you will need:\n> ");
        int userDisposableCups = scanner.nextInt();
        numbers[0] += userWater;
        numbers[1] += userMilk;
        numbers[2] += userCoffeeBeans;
        numbers[3] += userDisposableCups;
    }

    public static void take() {
        System.out.println("I gave you " + numbers[4]);
        numbers[4] -= numbers[4];
    }

    public static void main(String[] args) {
        printBoard();
        System.out.print("Write action (buy, fill, take):\n> ");
        String userAction = scanner.next();
        if (userAction.equals("buy")) {
            buy();

        } else if (userAction.equals("fill")) {
            fill();

        } else if (userAction.equals("take")) {
            take();

        }

        printBoard();



    }
}
