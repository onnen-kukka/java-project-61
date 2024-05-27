package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {

    public static final int MAX_NUMBER = 100;
    public static final int ROUNDS_COUNT = 3;

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(1, MAX_NUMBER);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            String playersAnswer = scanner.next();
            String correctAnswer = isEven(randomNumber) ? "yes" : "no";
            if (playersAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playersAnswer + "' is wrong answer ;(. Correct answer was 'no'." +
                        "\nLet's try again," + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    private static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}

