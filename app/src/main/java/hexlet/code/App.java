package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String gameNumber = scanner.next();
        System.out.println();
        String userName = Cli.sayHello();

        switch (gameNumber) {
            case "2":
                Games.playGame("Even", userName);
                break;
            case "3":
                Games.playGame("Calc", userName);
                break;
            case "4":
                Games.playGame("GCD", userName);
                break;
            default:
                break;
        }
    }
}
