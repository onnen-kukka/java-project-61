package hexlet.code;

import java.util.Scanner;

class  App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                Please enter the game number and press Enter.\

                1 - Greet
                2 - Even
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
            case "0":
                break;
            default:
                break;
            }
            scanner.close();
        }
    }
