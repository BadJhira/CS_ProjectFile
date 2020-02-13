package CS_141.W6.W6PracticeIt;

import java.util.Random;

public class RandomBullshit2 {
    public static void main(String[] args) {
        Random rand = new Random();

    }

    public static void over900(Random rand) {
        int n;
        do {
            n = rand.nextInt(1000);
            System.out.println("Random number: " + n);
        } while (n < 900);
    }
}
