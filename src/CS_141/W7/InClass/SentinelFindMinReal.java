package CS_141.W7.InClass;

import java.util.Scanner;
// 11/5/19 Doug Gilchrist
public class SentinelFindMinReal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        findMinimum(console);
    }

    public static void findMinimum(Scanner console) {
        String prompt = "Enter a real number (0 to quit): ";
        System.out.print(prompt);
        String reals = "";
        double num = testInput(console, prompt);
        double min = num;
        if (num != 0) {
            reals += num + " ";
        }

        while (num != 0) {
            if (num < min) {
                min = num;
            }
            System.out.print(prompt);
            num = testInput(console, prompt);
            if (num != 0) {
                reals += num + " ";
            }
        }
        if (min != 0) {
            System.out.println("The minimum is " + min);
        } else {
            System.out.println("No numbers were entered.");
        }
        System.out.println("Numbers: " + reals);
    }

    public static double testInput(Scanner console, String prompt) {
        while (!console.hasNextDouble()) {
            System.out.println("Not a number!");
            System.out.print(prompt);
            console.next();
        }
        return console.nextDouble();
    }
}

