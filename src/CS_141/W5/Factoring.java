package CS_141.W5;

import java.util.Scanner;
// Doug Gilchrist - 10/24/19 - Factoring / Priming
public class Factoring {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int numInput = console.nextInt();

        int numFactors = countFactors(numInput);
        for (int i = 1; i <= numInput; i++) {
            String factor = ((numInput % i) > 0) ? "" : "" + i + " ";
            System.out.print(factor);
        }
        System.out.println();
        System.out.println("Your number has " + numFactors + " factors.");

        int numPrimes = countPrimes(numInput);
        System.out.println("Your number has " + numPrimes + " primes.");
    }

    public static int countFactors(int numInput) {
        // Check each integer between 1 and typed integer, and return the number of factors.
        int numFactors = 0;

        for (int i = 1; i <= numInput; i++) {
            numFactors = ((numInput % i) > 0) ? numFactors : numFactors + 1;
        }

        return numFactors;
    }

    public static int countPrimes(int numInput) {
        int numPrimes = 0;

        for (int i = 2; i <= numInput; i++) {
            if (countFactors(i) == 2) {
                numPrimes++;
                System.out.print(i + " ");
            }
        }
        System.out.println();

        return numPrimes;
    }
}
