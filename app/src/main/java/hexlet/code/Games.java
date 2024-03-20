package hexlet.code;

import java.util.Scanner;

public class Games {
    public static void printDescription(String game) {
        switch (game) {
            case "Even":
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            default:
                break;
        }
    }

    public static void playGame(String game, String username) {
        printDescription(game);
        int count = 0;
        final int correctCount = 3;

        Scanner scanner = new Scanner(System.in);
        boolean failure = false;

        while (count < correctCount) {
            String[] calc = calculateQuestionResult(game);
            System.out.println("Question: " + calc[0]);
            System.out.print("Answer: ");
            String answer = scanner.nextLine();
            String result = calc[1];
            if (answer.equals(result)) {
                System.out.println("Correct!");
                count += 1;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", answer, result);
                System.out.println("Let's try again, " + username + "!");
                failure = true;
                break;
            }
        }
        if (!failure) {
            System.out.println("Congratulations, " + username + "!");
        }
    }

    public static String[] calculateQuestionResult(String game) {
        String question = "";
        String result = "";
        int num1;
        int num2;
        int start = 1;
        final int stop = 100;

        switch (game) {
            case "Even":
                question = Integer.toString(getRandomNumber(start, stop));
                result = isEven(Integer.parseInt(question));
                break;
            default:
                break;
        }
        return new String[]{question, result};
    }

    public static int getRandomNumber(int start, int stop) {
        return (int) (Math.random() * stop) + start;
    }

    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
