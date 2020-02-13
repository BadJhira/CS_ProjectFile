package CS_141.W7.InClass;

import java.util.Scanner;
// 11/5/19 Doug Gilchrist
public class BooleanStringStuff {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

    }

    /*
    Write another While/DoWhile that terminates when the user enters "the end"
     */

    public static void method(Scanner console) {
        System.out.print("Type something: ");
        String string = console.nextLine();

        if (string.equals("acb def")) {
            System.out.println("Nice alphabet!");
        } else if (string.contains("distressed")) {
            System.out.println("Why are you distressed?");
        } else if (string.equalsIgnoreCase("the quick brown fox")) {
            System.out.println("jumped over the lazy dog.");
        } else if (string.startsWith("Douglas")) {
            System.out.println("Hey, that's my name too!");
        } else if (string.endsWith("regards")) {
            System.out.println("Indeed!");
        } else {
            System.out.println("What else do you have?");
        }
    }

    /*
    String Test Methods:
    .equals(string)
    .equalsIgnoreCase(string);
    .startsWith(string)
    .endsWith(string);
    .contains(string);
     */
}
