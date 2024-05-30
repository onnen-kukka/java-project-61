package hexlet.code.Game;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Calc {

    public static final int MAX_NUMBER = 100;

    public static void run() {
        String[][] questions = new String[ROUNDS_COUNT][];
        String rules = "What is the result of the expression?";

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, rules);
    }

    private static String[] generateRound() {
        Random random = new Random();
        int randomNumber1 = random.nextInt(1, MAX_NUMBER);
        int randomNumber2 = random.nextInt(1, MAX_NUMBER);
        char plus = '+';
        char minus = '-';
        char multiplication = '*';
        char operator = generateOperator(plus, minus, multiplication);
        String question = randomNumber1 + "" + operator + randomNumber2;
        String correctAnswer = String.valueOf(calculate(randomNumber1, randomNumber2, operator));
        return new String[]{question, correctAnswer};
    }

    private static char generateOperator(char plus, char minus, char multiplication) {
        char[] operators = new char[]{plus, minus, multiplication};
        Random random = new Random();
        int randomNumberForOperator = random.nextInt(0, ROUNDS_COUNT);
        return operators[randomNumberForOperator];
    }

    private static int calculate(int randomNumber1, int randomNumber2, char operator) {
        return switch (operator) {
            case '+' -> randomNumber1 + randomNumber2;
            case '-' -> randomNumber1 - randomNumber2;
            case '*' -> randomNumber1 * randomNumber2;
            default -> throw new RuntimeException("Unknown operation");
        };
    }
}