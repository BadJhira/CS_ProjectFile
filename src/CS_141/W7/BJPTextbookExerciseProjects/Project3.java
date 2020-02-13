package CS_141.W7.BJPTextbookExerciseProjects;

import java.util.Random;
import java.util.Scanner;
// 11/6/19 Doug Gilchrist [Week 7 BJP Textbook Exercises] Project 3
public class Project3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        guessNumber(console, rand);
    }

    public static void guessNumber(Scanner console, Random rand) {
        System.out.println("Let's play a guessing game!");
        System.out.println("I'll think of a number between 1 and 100, and you guess!");

        int number = rand.nextInt(100) + 1;

        System.out.print("Okay! What's your first guess? (enter integer) ");
        int guess = testInput(console, "What's your first guess? (enter integer) ");
        int numGuesses = 1;

        while (guess != number) {
            System.out.print("Guess again! ");
            if (guess > number) {
                System.out.println("(your guess was HIGH)");
            } else {
                System.out.println("(your guess was LOW)");
            }
            System.out.print("What's your next guess? (enter integer) ");
            guess = testInput(console, "What's your next guess? (enter integer) ");
            numGuesses++;
        }

        System.out.println("You guessed it! My number was " + number + ", and it took you " + numGuesses + " guesses!");
    }

    public static int testInput(Scanner console, String prompt) {
        while (!console.hasNextInt()) {
            System.out.println("*** Not an integer! ***");
            System.out.print(prompt);
            console.next();
        }
        return console.nextInt();
    }

    /*
    Consider extending this program by making it play multiple games until the user chooses to stop
    Print statistics about the player's total & average number of guesses
     */
}
