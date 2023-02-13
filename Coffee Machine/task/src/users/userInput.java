package users;
import java.util.*;

public class userInput {

    public static int getUserInput(){
    int answer = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write action (buy, fill, take, remaining, exit):");
    String userAnswer = scanner.nextLine();

    switch (userAnswer){
        case "buy":
            answer = 1;
            break;
        case "fill":
            answer = 2;
            break;
        case "take":
            answer = 3;
            break;
        case "remaining":
            answer = 4 ;
            break;
        case "exit":
            answer = 5;
            break;
    }
    return answer;
    }
}
