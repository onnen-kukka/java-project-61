package hexlet.code.game;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;

import static hexlet.code.Utils.generateNumber;

public class Calc {

    public static final int RANDOM_LIMIT = 100;

    public static void run() {
        String[][] questions = new String[ROUNDS_COUNT][];
        String rules = "What is the result of the expression?";

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, rules);
    }

    private static String[] generateRound() {
        final char[] operators = {'+', '-', '*'};

        int randomNumber1 = generateNumber(1, RANDOM_LIMIT);
        int randomNumber2 = generateNumber(1, RANDOM_LIMIT);

        int indexOperator = generateNumber(0, operators.length - 1);
        char operator = operators[indexOperator];

        String strRandomNumber1 = randomNumber1 + " ";
        String strOperator = operator + " ";
        String question = strRandomNumber1 + strOperator + randomNumber2;
        String correctAnswer = String.valueOf(calculate(randomNumber1, randomNumber2, operator));
        return new String[]{question, correctAnswer};
    }

    private static int calculate(int randomNumber1, int randomNumber2, char operator) {
        return switch (operator) {
            case '+' -> randomNumber1 + randomNumber2;
            case '-' -> randomNumber1 - randomNumber2;
            case '*' -> randomNumber1 * randomNumber2;
            default -> throw new RuntimeException("Unknown operation " + operator);
        };
    }
}
