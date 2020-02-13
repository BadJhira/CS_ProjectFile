package CS_141.W2.BJPTextbookExercises;
// Doug Gilchrist  10/8/19  Programming Project 3
public class Project3 {
    public static final int LENGTH = 4;

    public static void main(String[] args) {
        System.out.println("Programming Project 3");
        System.out.println("=====================");
        System.out.println();

        separator();
        block1();
        block2();
        separator();
        block2();
        block1();
        separator();
    }

    public static void separator() {
        System.out.print("+");
        for (int width = 1; width <= (LENGTH * 2) + 1; width++) {
            System.out.print("-");
        }

        System.out.print("+");
        System.out.println();
    }

    public static void block1() {
        for (int line = 1; line <= LENGTH; line++) {
            System.out.print("|");

            for (int space = 1; space <= LENGTH - (line - 1); space++) {
                System.out.print(" ");
            }

            for (int forwardSlash = 1; forwardSlash <= (line - 1); forwardSlash++) {
                System.out.print("/");
            }

            System.out.print("*");
            for (int backSlash = 1; backSlash <= (line - 1); backSlash++) {
                System.out.print("\\");
            }

            for (int space = 1; space <= LENGTH - (line - 1); space++) {
                System.out.print(" ");
            }

            System.out.print("|");
            System.out.println();
        }
    }

    public static void block2() {
        for (int line = 1; line <= LENGTH; line++) {
            System.out.print("|");

            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }

            for (int slash = 1; slash <= LENGTH - line; slash++) {
                System.out.print("\\");
            }

            System.out.print("*");
            for (int slash = 1; slash <= LENGTH - line; slash++) {
                System.out.print("/");
            }

            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }

            System.out.print("|");
            System.out.println();
        }
    }

}
