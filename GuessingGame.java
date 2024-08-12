import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Random number between 1 and 100

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Your task is to guess the number.");
        System.out.println("You will receive feedback if your guess is too high or too low.");
        System.out.println("Let's begin!");

        
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        int numberOfAttempts = 0;

   
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess (1-100): ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;

          
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Invalid guess. Please enter a number between 1 and 100.");
            } else {
                
                if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                }
            }
        }

        System.out.println("Congratulations! You've guessed the number " + targetNumber + " correctly.");
        System.out.println("It took you " + numberOfAttempts + " attempts to guess the right number.");

        
        scanner.close();
    }
}
