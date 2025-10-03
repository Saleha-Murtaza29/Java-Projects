import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int secretnumber = rand.nextInt(10) + 1;  // random number between 1 and 10
        int attempts = 5;

        System.out.println("----------Welcome----------");
        System.out.println("----------Number Guessing Game----------");
        System.out.println("----------Let's start----------");
        System.out.println();
        System.out.println("You have 5 attempts to guess the number between 1 and 10. Think carefully!");
        System.out.println();

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Enter a number: ");
            int guess = scanner.nextInt();

            if (guess == secretnumber) {
                System.out.println("Correct! You guessed it in " + i + " attempts. Congratulations!\n");
                break;
            }
            else if (guess < secretnumber) {
                if (guess == secretnumber - 1) {
                    System.out.println("Very Close! You have " + (attempts - i) + " attempts left.");
                } else {
                    System.out.println("Too low! You have " + (attempts - i) + " attempts left.");
                }
                if (secretnumber % 2 == 0) {
                    System.out.println("Hint: The number is even.\n");
                } else {
                    System.out.println("Hint: The number is odd.\n");
                }
            }
            else if (guess > secretnumber) {
                if (guess == secretnumber + 1) {
                    System.out.println("Very Close! You have " + (attempts - i) + " attempts left.");
                } else {
                    System.out.println("Too high! You have " + (attempts - i) + " attempts left.");
                }
                if (secretnumber % 2 == 0) {
                    System.out.println("Hint: The number is even.\n");
                } else {
                    System.out.println("Hint: The number is odd.\n");
                }
            }

            if (i == attempts) {
                System.out.println("Game Over! The number was " + secretnumber);
                System.out.println("Thank You!\n");
            }
        }

        scanner.close();
    }
}
