package CS_141.W6.W6PracticeIt;

import java.util.Random;

public class Exercise5_11 {
    public static void main(String[] args) {


        threeHeads();
    }

    public static void threeHeads() {
        Random rand = new Random();
        int flip = rand.nextInt(2);
        int previous = flip;
        int inARow = 0;

        if (flip == 1) {
            System.out.print("T");
        } else {
            System.out.print("H");
        }

        while (inARow < 3) {
            flip = rand.nextInt(2);
            if (flip == 1) {
                System.out.print(" T");
            } else {
                System.out.print(" H");
            }
            if (flip == previous) {
                inARow++;
            } else {
                inARow = 1;
            }
            previous = flip;
        }
        System.out.println();

        if(previous == 1) {
            System.out.println("Three tails in a row!");
        } else {
            System.out.println("Three heads in a row!");
        }

    }
}
