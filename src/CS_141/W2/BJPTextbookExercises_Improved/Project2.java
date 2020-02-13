package CS_141.W2.BJPTextbookExercises_Improved;
// Doug Gilchrist  10/16/19  Programming Project 2 Remaster
public class Project2 {
    public static final int LENGTH = 3;

    public static void main(String[] args) {
        System.out.println("Programming Project 2 Remaster");
        System.out.println("==============================");
        System.out.println();

        separator("+", "-", LENGTH);
        block1("|", " ", "^", LENGTH);
        block1("|", " ", "^", LENGTH);
        separator("+", "-", LENGTH);
        block2("|", " ", "v", LENGTH);
        block2("|", " ", "v", LENGTH);
        separator("+", "-", LENGTH);
    }

    // Any of the 'fillChar#' Strings can be passed as "" to functionally remove them

    public static void separator(String fillChar1, String fillChar2, int length) {
        String section = stringGen(fillChar2, length * 2);
        System.out.print(fillChar1 + section + fillChar1);
        System.out.println();
    }

    public static void block1(String fillChar1, String fillChar2, String fillChar3, int length) {
        for (int line = 1; line <= length; line++) {
            String section1 = stringGen(fillChar2, (length - line));
            String section2 = stringGen(fillChar2, (line * 2) - 2);
            System.out.print(fillChar1 + section1 + fillChar3 + section2 + fillChar3 + section1 + fillChar1);
            System.out.println();
        }
    }

    public static void block2(String fillChar1, String fillChar2, String fillChar3, int length) {
        for (int line = 1; line <= length; line++) {
            String section1 = stringGen(fillChar2, (line - 1));
            String section2 = stringGen(fillChar2, (length - line) * 2);
            System.out.print(fillChar1 + section1 + fillChar3 + section2 + fillChar3 + section1 + fillChar1);
            System.out.println();
        }
    }

    public static String stringGen(String fillChar, int length) {
        String returnString = "";
        for (int line = 1; line <= length; line++) {
            returnString = returnString + fillChar;
        }
        return returnString;
    }
}
