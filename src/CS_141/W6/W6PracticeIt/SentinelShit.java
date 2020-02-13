package CS_141.W6.W6PracticeIt;

import java.util.Scanner;

public class SentinelShit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        sentinel(console);
    }

    public static void sentinel(Scanner console) {
        System.out.print("Type a number (or -1 to stop): ");
        int input = console.nextInt();
        int max = input;
        int min = input;

        while (input != -1) {
            System.out.print("Type a number (or -1 to stop): ");
            input = console.nextInt();
            if (input > max) {
                max = input;
            } else if (input < min && input != -1) {
                min = input;
            }
        }
        if (max != -1 && min != -1) {
            System.out.println("Maximum was " + max);
            System.out.println("Minimum was " + min);
        }
    }
}
