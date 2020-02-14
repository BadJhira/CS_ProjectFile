package CS_202.W6.PracticeIt;

public class BJP5_12_8 {
    public static void main(String[] args) {
        System.out.println(multiplyEvens(3));
    }

    public static int multiplyEvens(int n) {
        if (n < 1)
            throw new IllegalArgumentException();
        else if (n == 1)
            return 2;
        else {
            return 2 * n * multiplyEvens(n - 1);
        }
    }
}
