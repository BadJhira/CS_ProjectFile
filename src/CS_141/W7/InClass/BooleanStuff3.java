package CS_141.W7.InClass;

import java.util.Scanner;
// 11/7/19 Doug Gilchrist [Testing Prime]
public class BooleanStuff3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean prime = isPrime(console);
        System.out.println(prime);
    }

    public static boolean isPrime(Scanner console) {
        int n = testInput(console, "Enter integer: ");
        int factors = 0;
        for (int i = 1; i <= n; i ++) {
            if (n % i == 0) {
                factors++;
            }
        }

        if (factors == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static int testInput(Scanner console, String prompt) {
        System.out.print(prompt);
        while (!console.hasNextInt()) {
            System.out.println("*** Not an integer! ***");
            System.out.print(prompt);
            console.next();
        }
        return console.nextInt();
    }
}
