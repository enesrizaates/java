import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int guess;
        int counter = 0;
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Guess a number between 1 and 100");
        guess = keyboard.nextInt();
        counter++;
        while (guess != randomNumber) {
            if (guess < 1 || guess > 100) {
                System.out.println("Guess is not between 1 and 100");
            }
            else if (guess > randomNumber) {
                System.out.println("Your guess is too high");
            }
            else if (guess < randomNumber) {
                System.out.println("Your guess is too low");
            }
            System.out.println("Guess again a number between 1 and 100");
            guess = keyboard.nextInt();
            counter++;
        }
        System.out.println("Congratulations! You have guessed the number in " + counter + " guesses");

    }
}
