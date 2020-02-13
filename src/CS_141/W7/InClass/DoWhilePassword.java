package CS_141.W7.InClass;

import java.util.Scanner;
// 11/5/19 Doug Gilchrist
public class DoWhilePassword {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String password = "abracadabra";
        passwordCheck(console, password);
    }

    public static void passwordCheck(Scanner console, String password) {
        String phrase;
        do {
            System.out.print("Password: ");
            phrase = console.nextLine();
            if (!phrase.equals(password)) {
                System.out.println("Incorrect password!");
            }
        } while (!phrase.equals(password));
        System.out.println("Success!");
    }
}
