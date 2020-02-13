package CS_141.W7.InClass;

import java.util.Scanner;
// 11/7/19 Doug Gilchrist
public class WhileSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int sum = digitSum(testInput(console, "Type an integer: "));
        System.out.print(" = " + sum);
    }

    public static int digitSum(int n) {
        n = Math.abs(n);
        int sum = 0;
        String string = Integer.toString(n % 10);
        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
            string += " + " + (n % 10);
        }
        System.out.print(string);
        return sum;
    }

    public static int testInput(Scanner console, String prompt) {
        System.out.print(prompt);
        while (!console.hasNextInt()) {
            System.out.println("*** Not an integer! ***");
            System.out.print(prompt);
            console.next();
        }
        return console.nextInt();
    }
}
