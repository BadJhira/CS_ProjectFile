package CS_202.W6.PracticeIt;

public class BJP5_12_2 {
    public static void main(String[] args) {
        writeNums(12);
    }

    public static void writeNums(int n) {
        if (n < 1)
            throw new IllegalArgumentException();
        else if (n == 1)
            System.out.print(n);
        else {
            writeNums(n - 1);
            System.out.print(", " + n);
        }
    }
}
