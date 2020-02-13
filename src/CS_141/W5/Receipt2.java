package CS_141.W5;

import java.util.*;
// Doug Gilchrist - 10/22/19 - Receipt
public class Receipt2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double subtotal = getMeals(console);
        getTotal(subtotal);
    }

    public static double getMeals(Scanner console) {
        System.out.print("How many people ate?: ");
        int numPeople = console.nextInt();
        double subtotal = 0;

        for (int i = 1; i <= numPeople; i++) {
            System.out.print("Meal cost for Person #" + i + ": ");
            double personCost = console.nextDouble();
            subtotal += sigFigs2(personCost);
            System.out.println("Current Subtotal: $" + subtotal);
        }
        return subtotal;
    }

    public static void getTotal(double subtotal) {
        double tip = sigFigs2(subtotal * 0.15);
        double tax = sigFigs2(subtotal * 0.10);
        double total = sigFigs2(subtotal + tip + tax);

        System.out.println("Subtotal: \t$" + sigFigs2(subtotal));
        System.out.println("Tip: \t\t$" + tip);
        System.out.println("Tax: \t\t$" + tax);
        System.out.println("Total: \t\t$" + total);
    }

    public static double sigFigs2(double num) {
        return (Math.round(num * 100.0) / 100.0);
    }
}
