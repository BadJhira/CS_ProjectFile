package CS_141.W6.W6PracticeIt;

import java.util.Scanner;

public class DoWhileShit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println(zeroDigits(0));
    }

    public static void seashells(Scanner console) {
        String input = "y";
        do {
            System.out.println("She sells seashells by the seashore.");
            System.out.print("Do you want to hear it again? ");
            input = console.next();
        } while (input.equals("y"));
    }

    public static int zeroDigits(int num) {
        String numString = Integer.toString(num);
        int numZero = 0;
        int count = 0;
        do {
            if (numString.charAt(count) == '0') {
                numZero++;
            }
            count++;
        } while (count < numString.length());

        return numZero;
    }

    public static int zeroDigits2(int num) {
        String numString = Integer.toString(num);
        int numZero = 0;
        int count = 0;
        do {
            if (numString.charAt(count) == '0') {
                numZero++;
            }
            count++;
        } while (count < numString.length());

        return numZero;
    }
}
