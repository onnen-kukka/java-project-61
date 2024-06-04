package hexlet.code;

import hexlet.code.Game.Even;
import hexlet.code.Game.Calc;
import hexlet.code.Game.GCD;
import hexlet.code.Game.Progression;
import hexlet.code.Game.Prime;

import java.util.Scanner;

class  App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                Please enter the game number and press Enter.\

                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        System.out.print("Your choice: ");
        String gameNumber = scanner.next();

        switch (gameNumber) {
            case "1":
                System.out.println("\n" + "Welcome to the Brain Games!");
                Cli.getName();
                break;
            case "2":
                Even.run();
                break;
            case "3":
                Calc.run();
                break;
            case "4":
                GCD.run();
                break;
            case "5":
                Progression.run();
                break;
            case "6":
                Prime.run();
                break;
            case "0":
                break;
            default:
                break;
            }
            scanner.close();
        }
    }
