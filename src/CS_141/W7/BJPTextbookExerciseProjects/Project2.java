package CS_141.W7.BJPTextbookExerciseProjects;

import java.util.Random;
import java.util.Scanner;
// 11/6/19 Doug Gilchrist [Week 7 BJP Textbook Exercises] Project 2
public class Project2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        hangman(console, rand);
    }

    /*
    Could break apart hangman() into multiple methods
    i.e. guessList(), confirmation() ...
    Not necessary though
     */

    public static void hangman(Scanner console, Random rand) {
        System.out.println("Let's play Hangman!");
        System.out.println("You think of a word, and tell me how many letters it has!");

        int hangman = 6;
        // initiate the loss condition at 6 (relatively standard rules have six 'strikes')
        int guess = (rand.nextInt(26) + 97);
        // initiate the first guess
        String guessList = Character.toString((char)guess);
        // initiate the list of already guessed letters with the first guess
        String word = "";
        // initiate the list of correctly guessed letters with an empty string

        System.out.print("How many letters? (enter an integer) ");
        int numLetters = testInput(console, "How many letters? (enter an integer) ");
        // user declares the length of their word

        while (hangman > 0 && numLetters > 0) {
            // while the program has neither lost (hangman reaches 6) nor won (letters left reaches 0)
            while (guessList.contains(Character.toString((char)guess))) {
                // if the program has already guessed a letter, guess again
                guess = (rand.nextInt(26) + 97);
            }
            guessList += (char)guess;
            // add new letter to the list of already guessed letters
            System.out.print("How many \"" + (char)guess + "\"s does it contain? (enter integer) ");
            int confirmation = testInput(console, "How many \"" + (char)guess + "\"s does it contain? (enter integer) ");
            // user declares how many of the new guessed letter is in the word they chose
            if (confirmation > 0) {
                // if the user declares more than 0 of a letter
                for (int i = 1; i <= confirmation; i++) {
                    // add the letter to the list of correct letters (equal to the number of letters the user declared)
                    word += (char)guess;
                    // reduce the number of letters left in the word appropriately
                    numLetters--;
                }
            } else {
                // if the user declares 0 or fewer instances of a letter, decrement the loss condition
                hangman--;
                System.out.println("Oh darn! (hangman = " + hangman + " failures left)");
            }
        }
        if (hangman == 0 && word.length() > 0) {
            // if the program lost but got some letters correct
            System.out.println("I lost! But the word contained the letters \"" + word + "\".");
        } else if (hangman == 0) {
            // if the program lost and got no letters correct
            System.out.println("I lost, and didn't even get one!");
        } else if (word.length() > 0) {
            // if the program won
            System.out.println("I won! The word contained the letters \"" + word + "\".");
        } else {
            // catch for extraneous circumstances, i.e. the user enters 0 for the word length
            System.out.println("Something went wrong!");
        }
    }

    public static int testInput(Scanner console, String prompt) {
        // tests whether user inputs an integer

        /*
        Probably add a check for the user entering numbers (less than 0) or (greater than the word length)
         */

        while (!console.hasNextInt()) {
            System.out.println("*** Not an integer! ***");
            System.out.print(prompt);
            // program passes in a prompt to re-print if the user enters incorrectly
            console.next();
        }
        return console.nextInt();
        // returns an integer if the user enters an integer
    }
}
