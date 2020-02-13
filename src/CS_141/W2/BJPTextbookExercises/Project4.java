package CS_141.W2.BJPTextbookExercises;
// Doug Gilchrist  10/8/19  Programming Project 4
public class Project4 {
    public static final int LENGTH = 4;
    public static final int WIDTH = (LENGTH * 2) + 2;

    public static void main(String[] args) {
        System.out.println("Programming Project 4");
        System.out.println("=====================");
        System.out.println();

        cap();
        block1();
        separator();
        block2();
        cap();
    }

    public static void cap() {
        System.out.print("|");

        for (int width = 1; width <= WIDTH; width++) {
            System.out.print("\"");
        }
        System.out.print("|");
        System.out.println();
    }

    public static void separator() {
        for (int space = 1; space <= LENGTH + 1; space++) {
            System.out.print(" ");
        }

        System.out.print("||");
        for (int space = 1; space <= LENGTH + 1; space++) {
            System.out.print(" ");
        }

        System.out.println();
    }

    public static void block1() {
        for (int line = 1; line <= LENGTH; line++) {
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }

            System.out.print("\\");
            for (int colon = 1; colon <= WIDTH - (line * 2); colon++) {
                System.out.print(":");
            }

            System.out.print("/");
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void block2() {
        for (int line = 1; line <= LENGTH; line++) {
            for (int space = 1; space <= (LENGTH + 1) - line; space++) {
                System.out.print(" ");
            }

            System.out.print("/");
            for (int colon = 1; colon <= line * 2; colon++) {
                System.out.print(":");
            }

            System.out.print("\\");
            for (int space = 1; space <= (LENGTH + 1) - line; space++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
