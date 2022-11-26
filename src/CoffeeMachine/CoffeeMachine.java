package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;
        System.out.print("Write how many ml of water the coffee machine has:\n> ");
        int userWater = scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has:\n> ");
        int userMilk = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has:\n> ");
        int userCoffeeBeans = scanner.nextInt();
        System.out.print("Write how many cups of coffee you will need:\n> ");
        int userCups = scanner.nextInt();

        if (userWater >= userCups * water && userMilk >= userCups * milk && userCoffeeBeans >= userCups *
                coffeeBeans) {
            int moreCups = (userWater + userMilk + userCoffeeBeans) / (userCups * water + userCups * milk +
                    userCups * coffeeBeans);
            if (moreCups - userCups == 0) {
                System.out.println("Yes, I can make that amount of coffee");
            } else {
                System.out.println("Yes, I can make that amount of coffee (and even " + (moreCups - userCups) +
                        " more than that)");

            }
        }

        if (userWater < userCups * water || userMilk < userCups * milk || userCoffeeBeans < userCups *
                coffeeBeans) {
            int moreCups = (userWater + userMilk + userCoffeeBeans) / (water + milk + coffeeBeans);
            System.out.println("No, I can make only " + (moreCups) + " cups of coffee");
        }


    }
}
