package users;


import theCoffeeMachine.TheMachine;

public class CoffeeMachine {
    public static void main(String[] args) {
        int userInput = 0;

        //1 - create an instance of a coffee machine
        TheMachine coffeeMachine = new TheMachine(550, 400, 540, 120, 9);

        while (userInput != 5) {

            // 2- get the user input
            userInput = users.userInput.getUserInput();
            System.out.println("");

            // 3 - act on input
            userActions.actions(userInput, coffeeMachine);
            System.out.println("");
        }

    }
}
