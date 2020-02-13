package CS_141.W9.InClass;

import java.io.*;
import java.util.*;
// 11/21/2019 Doug Gilchrist [Check Negative Sum]
public class NegativeSum {
    public static void main(String[] args) throws FileNotFoundException {
        checkNegativeSum(new File("Files\\integers_1"));
        System.out.println();
        checkNegativeSum(new File("Files\\integers_2"));
        System.out.println();
        checkNegativeSum(new File("Files\\integers_3")); // empty file
    }

    public static void checkNegativeSum(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);

        int sum = 0;
        int steps = 0;

        do {
            if (input.hasNextInt()) { // only take integer tokens
                sum += input.nextInt();
                steps++;
            } else if (input.hasNext())
                input.next(); // toss unwanted tokens
            else
                System.out.println("Error: No valid input!");
        } while (sum >= 0 && input.hasNext());

        System.out.println("Sum = " + sum);

        if (sum < 0)
            System.out.println("Sum is negative after " + steps + " steps.");
        else
            System.out.println("Sum is never negative.");

    }
}
