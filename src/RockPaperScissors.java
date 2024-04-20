import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];


            String playerMove;

            while (true) {
                System.out.println("Enter your move: [r / p / s]");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + ": Invalid move");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("Tie!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lost.");
                } else if (computerMove.equals("s")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("You win.");
                } else if (computerMove.equals("s")) {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("You win.");
                } else if (computerMove.equals("r")) {
                    System.out.println("You lose!");
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }

        }

    }

}