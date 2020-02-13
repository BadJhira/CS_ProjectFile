package CS_141.W5;

import java.util.Scanner;
// Doug Gilchrist - 10/22/19 - Switch Statement
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        switchInt(console);
        switchString(console);
    }

    public static void switchInt(Scanner console) {
        System.out.print("Enter an integer between 1 and 5: ");
        int number = console.nextInt();

        switch (number) {
            case 1:
                System.out.println("The number is 1.");
                break;
            case 2:
                System.out.println("The number is 2.");
                break;
            case 3:
                System.out.println("The number is 3.");
                break;
            case 4:
                System.out.println("The number is 4.");
                break;
            case 5:
                System.out.println("The number is 5.");
                break;
            default:
                System.out.println("Please enter an integer between 1 and 5.");
                break;
        }
    }

    public static void switchString(Scanner console) {
        System.out.print("Please enter your name: ");
        String name = console.next();

        switch (name) {
            case "Doug":
            case "Douglas":
                System.out.println("That is your name.");
                break;
            default:
                System.out.println("That is not your name.");
                break;
        }
    }
}
