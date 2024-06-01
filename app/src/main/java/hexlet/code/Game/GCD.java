package hexlet.code.Game;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class GCD {

    public static final int MAX_NUMBER = 100;

    public static void run() {
        String[][] questions = new String[ROUNDS_COUNT][];
        String rules = "Find the greatest common divisor of given numbers.";

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, rules);
    }

    private static String[] generateRound() {
        Random random = new Random();
        int randomNumber1 = random.nextInt(1, MAX_NUMBER);
        int randomNumber2 = random.nextInt(1, MAX_NUMBER);
        String question = randomNumber1 + " " + randomNumber2;
        int correctAnswer = makeGreatestDivisor(randomNumber1, randomNumber2);
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    private static int makeGreatestDivisor(int randomNumber1, int randomNumber2) {
        int divisor = 0;
        for (int i = 1; i <= Math.max(randomNumber1, randomNumber2); i++) {
            if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                divisor = i;
            }
        }
        return  divisor;
    }
}