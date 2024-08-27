import java.util.Scanner;
import java.util.Random;

public class GuessingGame{
    public static void main(String[] args){
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have generated a random number between 1 and 100. Can you guess the number?");
        
        while(guess != numberToGuess){
            System.out.print("Enter the guess: ");
            guess = scanner.nextInt();
            attempts++;
        
        if(guess < numberToGuess) {
            System.out.println("Too low! Try again.");
        }else if(guess > numberToGuess) {
            System.out.println("Too high! Try again.");
        }
        
        }
        
        System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly in " + attempts + " attempts.");
        
    }
}
