package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void run(String[][] questions, String rules) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (String[] round : questions) {
            System.out.println("Question: " + round[0]);
            String answer = scanner.next();
            if (answer.equals(round[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + round[1] + "'.\n" +
                        "Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
