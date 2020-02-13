package CS_141.W6.W6PracticeIt;

import java.util.Random;
import java.util.Scanner;

public class Exercise5_7 {
    public static void main(String[] args) {

        diceSum();
    }

    public static void diceSum() {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Desired dice sum: ");
        int desiredSum = console.nextInt();
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;
        int sum = roll1 + roll2;
        System.out.println(roll1 + " and " + roll2 + " = " + sum);

        while (sum != desiredSum) {
            roll1 = rand.nextInt(6) + 1;
            roll2 = rand.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " and " + roll2 + " = " + sum);
        }
    }
}
