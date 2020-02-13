package CS_141.W5;

import java.util.Scanner;
// Doug Gilchrist - 10/24/19 - Chars!
public class Chars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = getName(console);
        letterByLetter(name);
        firstAndLast(name);
    }

    public static String getName(Scanner console) {
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        return name;
    }

    public static void letterByLetter(String name) {
        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);
            System.out.print(character);
        }
        System.out.println();
    }

    public static void firstAndLast(String name) {
        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);

        System.out.println("First letter: " + first);
        System.out.println("Last letter: " + last);
    }
}
