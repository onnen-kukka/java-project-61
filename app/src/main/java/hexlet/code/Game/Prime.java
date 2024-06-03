package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    public static final int RANDOM_LIMIT = 100;

    public static void run() {
        String[][] questions = new String[Engine.ROUNDS_COUNT][];
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, rules);
    }

    private static String[] generateRound() {
        Random random = new Random();
        int randomNumber = random.nextInt(1, RANDOM_LIMIT);
        String correctAnswer = isPrime(randomNumber) ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), correctAnswer};
    }

    private static boolean isPrime(int randomNumber) {
        int count = 0;
        for (int i = 1; i <= randomNumber; i++) {
            if (randomNumber % i == 0) {
                count++;
            }
        }
        return count <= 2;
    }
}

