package hexlet.code.game;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateNumber;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.game.Even.RANDOM_LIMIT;

public class Gcd {

    public static void run() {
        String[][] questions = new String[ROUNDS_COUNT][];
        String rules = "Find the greatest common divisor of given numbers.";

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, rules);
    }

    private static String[] generateRound() {
        int randomNumber1 = generateNumber(1, RANDOM_LIMIT);
        int randomNumber2 = generateNumber(1, RANDOM_LIMIT);
        String question = randomNumber1 + " " + randomNumber2;
        int correctAnswer = gcd(randomNumber1, randomNumber2);
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    private static int gcd(int randomNumber1, int randomNumber2) {
        int divisor = 0;
        for (int i = 1; i <= Math.max(randomNumber1, randomNumber2); i++) {
            if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                divisor = i;
            }
        }
        return  divisor;
    }
}
