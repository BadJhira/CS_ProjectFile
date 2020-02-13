package CS_141.W6.W6PracticeIt;

import java.util.Scanner;

public class MoreInputStuff {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Type a number: ");
        if (console.hasNextInt()) {
            int number = console.nextInt();
            System.out.println("You typed the integer " + number);
        } else if (console.hasNextDouble()) {
            double number = console.nextDouble();
            System.out.println("You typed the real number " + number);
        }
    }
}
