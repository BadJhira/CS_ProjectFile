package CS_141.W2.BJPTextbookExercises_Improved;
// Doug Gilchrist  10/16/19  Programming Project 1 Remaster
public class Project1 {
    public static final int LENGTH = 6;

    public static void main(String[] args) {
        System.out.println("Programming Project 1 Remaster");
        System.out.println("==============================");
        System.out.println();

        pattern("*", " ", "//", "\\\\", LENGTH);
        /*
        for (int line = 1; line <= LENGTH; line++) {
            for (int star = 1; star <= LENGTH - line; star++) {
                System.out.print("*");
            }

            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }

            for (int forSlash = 1; forSlash <= LENGTH - line; forSlash++) {
                System.out.print("//");
            }

            for (int backSlash = 1; backSlash <= line - 1; backSlash++) {
                System.out.print("\\\\");
            }

            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= LENGTH - line; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
         */
    }

    public static void pattern(String fillChar1, String fillChar2, String fillChar3, String fillChar4, int length) {
        for (int line = 1; line <= length; line++) {
            printLine(fillChar1, (length - line));
            printLine(fillChar2, line);
            printLine(fillChar3, (length - line));
            printLine(fillChar4, (line - 1));
            printLine(fillChar2, line);
            printLine(fillChar1, (length - line));
            System.out.println();
        }
    }

    public static void printLine(String fillChar, int numLines) {
        for (int line = 1; line <= numLines; line++) {
            System.out.print(fillChar);
        }
    }
}
