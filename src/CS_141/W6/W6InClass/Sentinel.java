package CS_141.W6.W6InClass;

import java.util.Scanner;
// Doug Gilchrist 10/29/2019 Using Sentinels
public class Sentinel {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        sentinel(console);
    }

    public static void sentinel(Scanner console) {
        System.out.print("Enter a number (0 to quit): ");
        int input = console.nextInt();
        int sum = 0;

        while (input != 0) {
            sum += input;
            System.out.print("Enter a number (0 to quit): ");
            input = console.nextInt();
        }
        System.out.print("The sum is: " + sum);

    }
}
