package CS_141.W7.InClass;

import java.util.Scanner;
// 11/5/19 Doug Gilchrist
public class BooleanStuff {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolStuff(console);
    }

    public static void boolStuff(Scanner console) {
        System.out.print("What is your age? ");
        int age = console.nextInt();
        System.out.print("What is your name? ");
        String name = console.next();
        System.out.print("Do you love CS? "); // not sure what's failing here
        String love = console.next();

        boolean minor = (age < 21);
        boolean isProf = name.contains("Prof");
        boolean lovesCS = love.equalsIgnoreCase("yes");

        if (minor || isProf || !lovesCS) {
            System.out.println("Not allowed in the club!");
        } else {
            System.out.println("You're in!");
        }
    }
}
