package CS_141.W6.W6InClass;

import java.util.*;
// Doug Gilchrist 10/29/2019 Using Random Numbers
public class RandomDice {
    public static void main(String[] args) {
        Random rand = new Random();

        diceOdds(rand);
        diceEvens(rand);
    }

    public static void diceOdds(Random rand) {
        System.out.println("Let's roll some dice!");
        int oddsInARow = 0;
        int numRolls = 0;

        while (oddsInARow < 3) { // Checking for 3 odd rolls in a row
            numRolls++;
            int roll = rand.nextInt(6) + 1;
            System.out.println("Roll #" + numRolls + " is: " + roll);
            if (roll % 2 == 1) { // Logic to determine if roll is odd
                oddsInARow++;
            } else { // Logic to reset if roll is even
                oddsInARow = 0;
            }
        }
        System.out.println("Three odds in a row after " + numRolls + " rolls.");
    }

    public static void diceEvens(Random rand) {
        System.out.println("Let's roll some dice!");
        int evensInARow = 0;
        int numRolls = 0;

        while (evensInARow < 3) { // Checking for 3 even rolls in a row
            numRolls++;
            int roll = rand.nextInt(6) + 1;
            System.out.println("Roll #" + numRolls + " is: " + roll);
            if (roll % 2 == 0) { // Logic to determine if roll is even
                evensInARow++;
            } else { // Logic to reset if roll is odd
                evensInARow = 0;
            }
        }
        System.out.println("Three evens in a row after " + numRolls + " rolls.");
    }
}
