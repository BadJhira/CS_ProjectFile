package CS_141.W2.BJPTextbookExercises;
// Doug Gilchrist  10/8/19  Programming Project 2
public class Project2 {
    public static final int LENGTH = 3;

    public static void main(String[] args) {
        System.out.println("Programming Project 2");
        System.out.println("=====================");
        System.out.println();

        separator();
        for (int repeat = 1; repeat <= LENGTH - 1; repeat++) {
            firstBlock();
        }

        separator();
        for (int repeat = 1; repeat <= LENGTH - 1; repeat++) {
            secondBlock();
        }

        separator();
    }

    public static void separator() {
        System.out.print("+");
        for (int width = 1; width <= LENGTH * 2; width++) {
            System.out.print("-");
        }

        System.out.print("+");
        System.out.println();
    }

    public static void firstBlock() {
        for (int line = 1; line <= LENGTH; line++) {
            System.out.print("|");
            for (int space = 1; space <= LENGTH - line; space++) {
                System.out.print(" ");
            }

            System.out.print("^");
            for (int space = 1; space <= (line * 2) - 2; space++) {
                System.out.print(" ");
            }

            System.out.print("^");
            for (int space = 1; space <= LENGTH - line; space++) {
                System.out.print(" ");
            }

            System.out.print("|");
            System.out.println();
        }
    }

    public static void secondBlock() {
        for (int line = 1; line <= LENGTH; line++) {
            System.out.print("|");
            for (int space = 1; space <= line - 1; space++) {
                System.out.print(" ");
            }

            System.out.print("v");
            for (int space = 1; space <= (LENGTH - line) * 2; space++) {
                System.out.print(" ");
            }

            System.out.print("v");
            for (int space = 1; space <= line - 1; space++) {
                System.out.print(" ");
            }

            System.out.print("|");
            System.out.println();
        }
    }
}
