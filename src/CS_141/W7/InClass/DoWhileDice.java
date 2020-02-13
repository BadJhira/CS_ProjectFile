package CS_141.W7.InClass;

import java.util.Random;
// 11/5/19 Doug Gilchrist
public class DoWhileDice {
    public static void main(String[] args) {
        Random rand = new Random();

        diceGame(rand);
    }

    /*
    Turn this into 3 random dice rolls looking for an average of 7 (instead of a sum)
     */

    public static void diceGame(Random rand) {
        int tries = 0;
        int sum;

        do {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " + " + roll2 + " = " + sum);
            tries++;
        } while (sum != 7);

        System.out.println("You won after " + tries + " tries!");
    }
}
