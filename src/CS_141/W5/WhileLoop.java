package CS_141.W5;

import java.util.Scanner;
// Doug Gilchrist - 10/24/19 - While Loop
public class WhileLoop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        whileName(console);
    }

    public static void whileName(Scanner console) {
        System.out.print("Type your first name: ");
        String name = console.next();

        while (!name.equals("Doug")) {
            System.out.print("That is not your name, try again: ");
            name = console.next();
        }
        System.out.println("Correct, your name is Doug.");
    }
}
