package CS_202.W6.InClass_Recursion;

public class Stars {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("For Loop: ");
        printStarsLoop(num);

        System.out.println("Recursive Method: ");
        printStarsRecursive(num, "*");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            printStarsRecursive(i, "*");
        }
    }

    public static void printStarsLoop(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarsRecursive(int n, String symbol) {
        if (n < 0) {
            throw new IllegalArgumentException("ERROR - Negative values cannot be printed: " + n);
        } else if (n == 0) {
            System.out.println();
        } else {
            System.out.print(symbol);
            printStarsRecursive(n - 1, symbol);
        }
    }
}
