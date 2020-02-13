package CS_141.W7.BJPTextbookExerciseProjects;

import java.util.Random;
import java.util.Scanner;
// 11/6/19 Doug Gilchrist [Week 7 BJP Textbook Exercises] Project 4
public class Project4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        guessNumber(console, rand);
    }

    public static void guessNumber(Scanner console, Random rand) {
        System.out.println("Let's play a guessing game!");
        System.out.println("You think of a number between 1 and 100, and I'll guess!");

        int lowBound = 0;
        int highBound = 100;
        // setting the bounds for guessing a random number
        int range = highBound - lowBound;
        // this is the number used in rand.nextInt() as the bound
        int numGuesses = 0;
        int guess;
        String confirmation;

        do {
            guess = rand.nextInt(range) + lowBound + 1;
            /*
            Formula for producing a random integer between the bounds [ lowBound, highBound ]
            rand.nextInt picks a number between 0 and (lowBound - highBound - 1) inclusive
            We add 1 to it so the number is now between 1 and (lowBound - highBound) inclusive
            We then add the lowBound to it to bring it into the actual desired range
            For example:
            lowBound = 3 , highBound = 9 , range = ( 9 - 3 ) = 6
            rand.nextInt(range) picks a number between 0 and 5 (inclusive)
            + 1 forces the range between 1 and 6 (inclusive)
            + lowBound forces the range up between 4 and 9 (inclusive)
            --> The lowBound starts at 0 because we want the program to guess between 1 and highBound (inclusive)
            This matters later when we adjust the bounds
             */

            confirmation = testInput(console, "y", "n", "Is it " + guess + "? (y/n) ");
            // ask user if the guess is correct

            if (!confirmation.equals("y")) {
                String hiLow = testInput(console, "h", "l", "Was the guess HIGH or LOW? (h/l) ");
                // ask user if the guess was HIGH or LOW
                if (hiLow.equals("h")) {
                    // if user input is HIGH, adjust highBound
                    highBound = guess - 1;
                    /* Adjusting the highBound like this forces the program into a range where it
                    cannot guess the high value it just guessed again. */
                } else {
                    // if user input is LOW, adjust lowBound
                    lowBound = guess;
                    /* Because of how our random formula works, we don't have to adjust the lowBound
                    guess by any factor; it automatically ends up excluding the lower bound correctly */
                }
            }
            range = highBound - lowBound;
            // re-evaluate the range
            numGuesses++;
            // increment the total guesses
            if (range <= 0) {
                /* if the user forces the program into a state where the highBound ends up equaling
                or being less-than the lowBound, break out of the do-while loop */
                System.out.println("You cheated!");
                break;
            }
        } while (!confirmation.equals("y"));

        if (range > 0) {
            // as long as the user didn't 'cheat', the program prints its success
            System.out.println("I got your number (" + guess + ") in " + numGuesses + " guesses!");
        }
    }

    public static String testInput(Scanner console, String test1, String test2, String prompt) {
        // method accepts user input, two test Strings, and a prompt
        String values = test1 + test2;
        // concat the test strings --> this isn't the most ideal manner to accomplish this test (an array is likely better)
        System.out.print(prompt);
        String input = console.next();

        while (!values.contains(input)) {
            // if the user input isn't either of the test strings, re-prompt the user
            System.out.println("*** Invalid entry! ***");
            System.out.print(prompt);
            input = console.next();
        }

        return input;
    }
}
