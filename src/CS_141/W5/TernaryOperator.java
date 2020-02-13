package CS_141.W5;

import java.util.Scanner;
// Doug Gilchrist - 10/22/19 - Ternary
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // ifElse(console);
        ternary1(console);
        ternary2(console);
    }

    public static void  ifElse(Scanner console) {
        System.out.print("What percentage did you earn? ");
        int percentGrade = console.nextInt();

        if (percentGrade >= 90) {
            System.out.println("You got an A!");
        } else if (percentGrade >= 80) {
            System.out.println("You got a B!");
        } else if (percentGrade >= 70) {
            System.out.println("You got a C!");
        } else if (percentGrade >= 60) {
            System.out.println("You got a D!");
        } else if (percentGrade < 60) {
            System.out.println("You got an F!");
        }
        System.out.println("==============");
    }

    public static void ternary1(Scanner console) {
        System.out.print("[ternary1] What percentage did you earn? ");
        int percentGrade = console.nextInt();

        String grade = (percentGrade >= 90) ? "[ternary1] You got an A!" : "[ternary1] You got less than an A.";
        System.out.println(grade);
        System.out.println("==============");
    }

    public static void ternary2(Scanner console) {
        System.out.print("[ternary2] Type an integer: ");
        int number = console.nextInt();

        String evenOdd = ((number % 2) > 0) ? "[ternary2] The number is odd." : "[ternary2] The number is even.";
        System.out.println(evenOdd);
        System.out.println("==============");
    }
}
