package CS_141.W6.W6PracticeIt;

import java.util.Random;

public class Exercise5_8 {
    public static void main(String[] args) {

        randomWalk();
    }

    public static void randomWalk() {
        Random rand = new Random();

        int position = 0;
        int maxPosition = 0;
        System.out.println("position = " + position);

        while (position < 3 && position > -3) {
            int n = rand.nextInt();
            if (n % 2 == 0) {
                position++;
            } else {
                position--;
            }
            if (position > maxPosition) {
                maxPosition = position;
            }
            System.out.println("position = " + position);
        }
        System.out.println("max position = " + maxPosition);
    }
}
