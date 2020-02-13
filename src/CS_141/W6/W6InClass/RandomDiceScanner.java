package CS_141.W6.W6InClass;

import java.util.Random;
import java.util.Scanner;
// Doug Gilchrist 10/29/2019 Using Random Numbers (plus Scanner)
public class RandomDiceScanner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        dice(console, rand);
    }

    public static void dice(Scanner console, Random rand) {
        System.out.println("Let's roll some dice!");
        System.out.print("Do you want Odds or Evens (enter 'odd' or 'even')? ");
        String oddEven = console.next();
        oddEven = oddEven.toLowerCase();
        System.out.print("How many in a row? ");
        int inARow = console.nextInt();
        int rollsInARow = 0;
        int numRolls = 0;

        while (rollsInARow < inARow) { // Checking for 3 odd rolls in a row
            numRolls++;
            int roll = rand.nextInt(6) + 1;
            System.out.println("Roll #" + numRolls + " is: " + roll);
            if (roll % 2 == 1 && oddEven.equals("odd")) {
                // Logic to determine if roll is odd and user input is 'odd'
                rollsInARow++;
            } else if (roll % 2 == 0 && oddEven.equals("even")) {
                // Logic to determine if roll is even and user input is 'even'
                rollsInARow++;
            } else {
                // Logic to reset if roll if neither is true
                rollsInARow = 0;
            }
        }
        System.out.println(inARow + " " + oddEven + "s in a row after " + numRolls + " rolls.");
    }
}
