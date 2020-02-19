package CS_202.W6;

import java.util.*;

public class Zylabs_NumberPattern {
    // TODO: Write recursive printNumPattern() method
    public static void printNumPattern(int base, int sub) {
        if (base <= 0)
            System.out.print(base);
        else {
            System.out.print(base + " ");
            printNumPattern(base - sub, sub);
            System.out.print(" " + base);
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        printNumPattern(num1, num2);
    }
}