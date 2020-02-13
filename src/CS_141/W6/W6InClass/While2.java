package CS_141.W6.W6InClass;

import java.util.Scanner;
// Doug Gilchrist 10/29/2019 More While Loops
public class While2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = console.nextInt();

        factor(number);
    }

    public static void factor(int num) {
        int factor = 2;
        while (num % factor != 0) {
            factor++;
        }
        System.out.println("First factor is " + factor);
    }
}
