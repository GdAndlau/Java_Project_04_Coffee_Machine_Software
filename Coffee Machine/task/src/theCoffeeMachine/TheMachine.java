package theCoffeeMachine;

import java.util.Scanner;

public class TheMachine {
    private int money;
    private int water;
    private int milk;
    private int coffee;
    private int cups;

    public TheMachine(int money, int water, int milk, int coffee, int cups){
        this.money = money;
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cups = cups;
    }

    public  void getState() {
        System.out.printf("The coffee machine has:\n"+
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n", water, milk, coffee, cups, money);
    }

    public void setNewCoffeeMachineState(int newMoney, int newWater, int newMilk, int newCoffee, int newCups){
        this.water = this.water - newWater;
        this.milk = this.milk - newMilk;
        this.coffee = this.coffee - newCoffee;
        this.money = this.money + newMoney;
        this.cups = this.cups - newCups;
    }

    public void setMoney(){
        System.out.printf("I gave you $%d", this.money);
        System.out.println("");
        this.money = 0;
    }

    public void setTheMachine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        int waterAmount = scanner.nextInt();
        this.water = this.water + waterAmount;

        System.out.println("Write how many ml of milk you want to add: ");
        int milkAmount = scanner.nextInt();
        this.milk = this.milk + milkAmount;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeAmount = scanner.nextInt();
        this.coffee = this.coffee + coffeeAmount;

        System.out.println("Write how many disposable cups you want to add:");
        int cupsAmount = scanner.nextInt();
        this.cups = this.cups + cupsAmount;
    }

    public boolean isMachineEmpty(int newMoney, int newWater, int newMilk, int newCoffee, int newCups){
        Boolean isEmpty = false;
        if(water < newWater){
            System.out.println("Sorry, not enough water!");
            return isEmpty = true;
        } else if (coffee < newCoffee) {
            System.out.println("Sorry, not enough coffee!");
            return isEmpty = true;
        } else if (milk < newMilk) {
            System.out.println("Sorry, not enough milk!");
            return isEmpty = true;
        } else if (money < newMoney) {
            System.out.println("Sorry, not enough money!");
            return isEmpty = true;
        } else if (cups < newCups) {
            System.out.println("Sorry, not enough cups!");
            return isEmpty = true;
        }
        return isEmpty;
    }
}


