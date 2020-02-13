package CS_141.W6.W6InClass;

import java.util.Random;
// Doug Gilchrist 10/29/2019 Using More Random Numbers
public class RandomDice2 {
    public static void main(String[] args) {
        Random rand = new Random();

        dice(rand);
    }

    public static void dice(Random rand) {
        System.out.println("Let's roll some dice!");
        // First rolls as a fencepost before while loop
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;
        int numRolls = 2;
        int numPairs = 0;
        System.out.println("Pair #" + (numRolls / 2) + " is: " + roll1 + " and " + roll2);
        // First pair check as a fencepost before while loop
        if (pair(roll1, roll2)) {
            numPairs++;
        }

        while (numPairs < 2) {
            roll1 = rand.nextInt(6) + 1;
            roll2 = rand.nextInt(6) + 1;
            numRolls += 2;
            System.out.println("Pair #" + (numRolls / 2) + " is: " + roll1 + " and " + roll2);
            if (pair(roll1, roll2)) { // If the rolls are a pair (Odd + Even), increment numPairs
                numPairs++;
            } else if (!pair(roll1, roll2)) { // If the rolls are not a pair (Odd + Even), reset numPairs
                numPairs = 0;
            }
        }
        System.out.println("Two pairs of Odd + Even after " + numRolls + " rolls.");
    }

    public static boolean pair(int roll1, int roll2) {
        boolean oddEven = false; // Initial state is false, unless the if statements below return true
        if (roll1 % 2 == 1) {
            if (roll2 % 2 == 0) {
                oddEven = true; // Only if roll1 is Odd and roll2 is Even does it return true
            }
        }
        return oddEven;
    }
}
