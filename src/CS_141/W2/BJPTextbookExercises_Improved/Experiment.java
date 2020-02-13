package CS_141.W2.BJPTextbookExercises_Improved;

public class Experiment {
    public static void main(String[] args) {
        System.out.println("Experiment");
        System.out.println("==========");
        System.out.println();

        block("|", " ", "^", 3);
        System.out.println();

        pattern("*", " ", "//", "\\\\", 7);
    }

    /*
    public static void block1(String fillChar1, String fillChar2, String fillChar3, int length) {
        for (int line = 1; line <= length; line++) {
            System.out.print(fillChar1);
            printLine(fillChar2, (length - line));
            System.out.print(fillChar3);
            printLine(fillChar2, ((line * 2) - 2));
            System.out.print(fillChar3);
            printLine(fillChar2, (length - line));
            System.out.print(fillChar1);
            System.out.println();
        }
    }
     */

    public static void block(String fillChar1, String fillChar2, String fillChar3, int length) {
        for (int line = 1; line <= length; line++) {
            String section1 = stringGen(fillChar2, (length - line));
            String section2 = stringGen(fillChar2, (line * 2) - 2);
            System.out.print(fillChar1 + section1 + fillChar3 + section2 + fillChar3 + section1 + fillChar1);
            System.out.println();
        }
    }

    /*
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
     */

    public static void pattern(String fillChar1, String fillChar2, String fillChar3, String fillChar4, int length) {
        for (int line = 1; line <= length; line++) {
            String section1 = stringGen(fillChar1, (length - line));
            String section2 = stringGen(fillChar2, line);
            String section3 = stringGen(fillChar3, (length - line));
            String section4 = stringGen(fillChar4, (line - 1));
            System.out.print(section1 + section2 + section3 + section4 + section2 + section1);
            System.out.println();
        }
    }

    public static void tree(int segments, int height) {
        int growth = height + 1;
        for (int line = 1; line <= height; line++) {

        }
    }

    // Instead of printing directly from the method, use the method to return a generated string value
    public static String stringGen(String fillChar, int length) {
        String returnString = "";
        for (int line = 1; line <= length; line++) {
            returnString = returnString + fillChar;
        }
        return returnString;
    }
}
