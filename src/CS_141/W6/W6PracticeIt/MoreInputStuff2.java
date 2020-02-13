package CS_141.W6.W6PracticeIt;

import java.util.Scanner;

public class MoreInputStuff2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

//        System.out.print("Type a number: ");
//        if (console.hasNextInt()) {
//            int number = console.nextInt();
//            System.out.println("You typed the integer " + number);
//        } else if (console.hasNextDouble()) {
//            double number = console.nextDouble();
//            System.out.println("You typed the real number " + number);
//        }

        int sum = 0;
        int i = 0;
        while (i < 3) {
            System.out.print("Type an integer: ");
            if (!console.hasNextInt()) {
                console.next();
            } else {
                i++;
                sum += console.nextInt();
            }
        }
        System.out.println("Average: " + (double)sum / 3.0);
    }
}
