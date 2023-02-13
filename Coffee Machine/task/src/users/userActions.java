package users;
import beverages.*;
import theCoffeeMachine.TheMachine;

import java.util.Scanner;

public class userActions {

    public static void actions(Integer userActions, TheMachine coffeeMachine){
        if(userActions == 1){
            buy(coffeeMachine);
        } else if (userActions == 2) {
            fill(coffeeMachine);
        } else if (userActions == 3) {
            take(coffeeMachine);
        } else if(userActions == 4){
            show(coffeeMachine);
        } else if(userActions == 5){
            System.exit(0);
        }
    }

    public static void buy(TheMachine coffeeMachine){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

        int coffeeType = 0;
        String revert = "";
        try{
            coffeeType = scanner.nextInt();
        }catch(Exception e){
            revert = scanner.nextLine();
        }

        if(revert.equals("back")) return;


        if(coffeeType == 1){
            espresso drink = new espresso();
            Boolean isEmpty = coffeeMachine.isMachineEmpty(drink.money, drink.water, drink.milk, drink.coffee, drink.cups);
            if(!isEmpty) {
                System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine.setNewCoffeeMachineState(drink.money, drink.water, drink.milk, drink.coffee, drink.cups);
            }
        } else if(coffeeType == 2){
            latte drink = new latte();
            Boolean isEmpty = coffeeMachine.isMachineEmpty(drink.money, drink.water, drink.milk, drink.coffee, drink.cups);
            if(!isEmpty) {
                System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine.setNewCoffeeMachineState(drink.money, drink.water, drink.milk, drink.coffee, drink.cups);
            }
        } else if(coffeeType == 3) {
            cappuccino drink = new cappuccino();
            Boolean isEmpty = coffeeMachine.isMachineEmpty(drink.money, drink.water, drink.milk, drink.coffee, drink.cups);
            if(!isEmpty) {
                System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine.setNewCoffeeMachineState(drink.money, drink.water, drink.milk, drink.coffee, drink.cups);
            }
        }
    }

    public static void fill(TheMachine coffeeMachine) {
        coffeeMachine.setTheMachine();
    }
    public static void take(TheMachine coffeeMachine){
        coffeeMachine.setMoney();
    }
    public static void show(TheMachine coffeeMachine){
        coffeeMachine.getState();
    }
}
