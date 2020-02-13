package CS_141.W6.W6PracticeIt;

import java.util.Random;

public class RandomBullshit {
    public static void main(String[] args) {
        Random rand = new Random();

    }

    public static void randomOdd50to99(Random rand) {
        int n = rand.nextInt(25) * 2 + 51;
        System.out.print(n);
    }
}
