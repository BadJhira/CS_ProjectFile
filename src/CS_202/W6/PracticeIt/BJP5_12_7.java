package CS_202.W6.PracticeIt;

public class BJP5_12_7 {
    public static void main(String[] args) {
        writeChars(8);
        System.out.println();
        writeChars(5);
    }

    public static void writeChars(int n) {
        if (n < 1)
            throw new IllegalArgumentException();
        else if (n == 1)
            System.out.print("*");
        else if (n == 2)
            System.out.print("**");
        else {
            System.out.print("<");
            writeChars(n - 2);
            System.out.print(">");
        }
    }
}
