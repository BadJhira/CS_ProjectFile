package CS_141.W2.BJPTextbookExercises_Improved;

import java.util.Scanner;

public class Spending {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        spending(console, "John");
        spending(console, "Jane");
}

    public static void spending(Scanner console, String name) {
        System.out.print("How much will " + name + " be spending? ");
        double amount = console.nextDouble();
        System.out.println();

        int numBills = (int) (amount / 20.0);
        if (numBills * 20.0 < amount) {
            numBills++;
        }
        System.out.println(name + " needs " + numBills + " bills.");
    }
}
