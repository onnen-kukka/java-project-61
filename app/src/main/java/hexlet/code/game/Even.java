package hexlet.code.game;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateNumber;

public class Even {

    public static final int RANDOM_LIMIT = 100;

    public static void run() {
        String[][] questions = new String[Engine.ROUNDS_COUNT][];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, rules);
    }

    private static String[] generateRound() {
        int randomNumber = generateNumber(1, RANDOM_LIMIT);
        String correctAnswer = isEven(randomNumber) ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), correctAnswer};
    }

    private static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}

