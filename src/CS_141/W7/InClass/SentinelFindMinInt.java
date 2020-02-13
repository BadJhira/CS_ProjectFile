package CS_141.W7.InClass;

import java.util.Scanner;
// 11/5/19 Doug Gilchrist
public class SentinelFindMinInt {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        findMinimum(console);
    }

    public static void findMinimum(Scanner console) {
        String prompt = "Enter an integer (0 to quit): ";
        System.out.print(prompt);
        String integers = "";
        int num = testInput(console, prompt);
        int min = num;
        if (num != 0) {
            integers += num + " ";
        }

        while (num != 0) {
            if (num < min) {
                min = num;
            }
            System.out.print(prompt);
            num = testInput(console, prompt);
            if (num != 0) {
                integers += num + " ";
            }
        }
        if (min != 0) {
            System.out.println("The minimum is " + min);
        } else {
            System.out.println("No integers were entered.");
        }
        System.out.println("Integers: " + integers);
    }

    public static int testInput(Scanner console, String prompt) {
        while (!console.hasNextInt()) {
            System.out.println("Not an integer!");
            System.out.print(prompt);
            console.next();
        }
        return console.nextInt();
    }
}
