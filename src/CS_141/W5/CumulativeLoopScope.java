package CS_141.W5;

import java.util.*;
// Doug Gilchrist - 10/22/19 - Cumulative Loop Scope
public class CumulativeLoopScope {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        cumulative1(1000);
        userCumulative(console);
    }

    public static void cumulative1(int num) {
        // Correct scope
        int i;
        int sum = 0;
        for (i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("[cumulative1] i is: " + i);
        System.out.println("[cumulative1] The sum is: " + sum);
    }

    public static void cumulative2(int num) {
        // Incorrect scope
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            sum += i;
        }
        // This fails because 'sum' and 'i' are only contained within
        // the scope of the loop.
//        System.out.println("The sum is: " + sum);
//        System.out.println("i is: " + i);
    }

    public static void userCumulative(Scanner console) {
        double sum = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("[userCumulative] Type a number (" + i + "): ");
            sum += console.nextDouble();
        }
        System.out.println("[userCumulative] The sum is: " + sum);
    }
}
