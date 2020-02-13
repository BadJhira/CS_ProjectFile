package CS_141.W6.W6PracticeIt;

import java.util.Scanner;

public class InvalidInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Type your age: ");
        while (!console.hasNextInt()) {
            System.out.print("Type your age: ");
            console.next();
        }
        int age = console.nextInt();

        System.out.print("Type your GPA: ");
        while (!console.hasNextDouble()) {
            System.out.print("Type your GPA: ");
            console.next();
        }
        double gpa = console.nextDouble();

        System.out.println("age = " + age + ", GPA = " + gpa);
    }
}
