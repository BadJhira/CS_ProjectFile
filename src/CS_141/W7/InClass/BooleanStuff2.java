package CS_141.W7.InClass;

import java.util.Scanner;
// 11/5/19 Doug Gilchrist
public class BooleanStuff2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolStuff(console);
    }

    public static void boolStuff(Scanner console) {
        System.out.print("Age? ");
        int age = console.nextInt();
        System.out.print("Height? ");
        int height = console.nextInt();
        System.out.print("Salary? ");
        double salary = console.nextDouble();

        boolean goodAge     = age >= 23 && age < 37;
        boolean goodHeight  = height >= 50 && height < 75;
        boolean rich        = salary >= 100000.00;

        if ((goodAge && goodHeight) || rich) {
            System.out.println("Match");
        } else {
            System.out.println("No match");
        }
    }
}
