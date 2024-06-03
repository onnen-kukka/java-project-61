package hexlet.code.Game;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;

import static hexlet.code.Game.Even.RANDOM_LIMIT;

public class Progression {

    public static final int MAX_INDEX = 10;

    public static void run() {
        String[][] questions = new String[Engine.ROUNDS_COUNT][];
        String rules = "What number is missing in the progression?";

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateProgression();
        }
        Engine.run(questions, rules);
    }

    private static String[] generateProgression() {
        String[] numbers = new String[10];
        int progressionStep = 3;
        Random random = new Random();
        int number = random.nextInt(1, RANDOM_LIMIT);

        for (int i = 0; i < numbers.length; i++ ) {
            number = number + progressionStep;
            numbers[i] = String.valueOf(number);
        }
        String correctAnswer = numbers[generateIndex()];
        return new String[]{Arrays.toString(makeProgressionWithHiddenChar(numbers, correctAnswer)), correctAnswer};
    }

    private static int generateIndex() {
        Random random = new Random();
        int index = random.nextInt(0, MAX_INDEX);
        return index;
    }

    private static String[] makeProgressionWithHiddenChar(String[] numbers, String correctAnswer) {
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i].equals(correctAnswer)) {
               numbers[i] = "..";
           }
        }
        return numbers;
    }
}

