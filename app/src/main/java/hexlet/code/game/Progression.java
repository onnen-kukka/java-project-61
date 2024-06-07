package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Utils.generateNumber;

public class Progression {

    public static final int RANDOM_LIMIT = 100;
    public static final int MAX_INDEX = 9;
    public static final int PROGRESSION_STEP = 3;

    public static void run() {
        String[][] questions = new String[Engine.ROUNDS_COUNT][];
        String rules = "What number is missing in the progression?";

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = generateNumber(1, RANDOM_LIMIT);
            int step = PROGRESSION_STEP;
            int length = MAX_INDEX + 1;
            String[] progression = makeProgression(firstNumber, step, length);
            int hiddenMemberIndex = Utils.generateNumber(0, length - 1);
            String answer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);
            questions[i] = new String[] {question, answer};
        }
        Engine.run(questions, rules);
    }

    private static String[] makeProgression(int firstNumber, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(firstNumber + i * step);
        }
        return progression;
    }
}


