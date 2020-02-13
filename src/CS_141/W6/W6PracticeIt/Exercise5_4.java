package CS_141.W6.W6PracticeIt;

import java.util.Random;

public class Exercise5_4 {
    public static void main(String[] args) {

        randomX();
    }

    public static void randomX() {
        Random rand = new Random();
        int rand5to19 = rand.nextInt(15) + 5;
        for (int i = 1; i <= rand5to19; i++) {
            System.out.print("x");
        }
        System.out.println();

        while (rand5to19 < 16) {
            rand5to19 = rand.nextInt(15) + 5;
            for (int i = 1; i <= rand5to19; i++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
