package CS_141.W6.W6PracticeIt;

import java.util.Random;

public class Exercise5_6 {
    public static void main(String[] args) {

        makeGuesses();
    }

    public static void makeGuesses() {
        Random rand = new Random();

        int guess = rand.nextInt(50) + 1;
        System.out.println("guess = " + guess);
        int totalGuesses = 1;

        while (guess < 48) {
            guess = rand.nextInt(50) + 1;
            System.out.println("guess = " + guess);
            totalGuesses++;
        }
        System.out.println("total guesses = " + totalGuesses);
    }
}
