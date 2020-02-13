package CS_141.W6.W6InClass;

import java.util.Scanner;
// Doug Gilchrist 10/29/2019 While Loops
public class While {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = console.nextInt();

        printNumbers1(num);
        printNumbers2(num);
    }

    public static void printNumbers1(int num) {
        int i;
        for (i = 1; i < num; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(i);
    }

    public static void printNumbers2(int num) {
        int i = 1;
        while (i < num) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println(i);
    }
}
