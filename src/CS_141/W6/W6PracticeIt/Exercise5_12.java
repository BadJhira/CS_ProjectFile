package CS_141.W6.W6PracticeIt;

import java.util.Scanner;

public class Exercise5_12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        printAverage(console);
    }

    public static void printAverage(Scanner console) {
        System.out.print("Type a number: ");
        int num = console.nextInt();
        int sum = 0;
        int n = 0;

        while (num >= 0) {
            sum += num;
            n++;
            System.out.print("Type a number: ");
            num = console.nextInt();
        }
        if (sum > 0) {
            System.out.println("Average was " + ((double) sum / (double) n));
        }
    }
}
