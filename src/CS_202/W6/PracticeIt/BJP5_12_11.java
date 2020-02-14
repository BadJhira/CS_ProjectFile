package CS_202.W6.PracticeIt;

public class BJP5_12_11 {
    public static void main(String[] args) {

    }

    public static String repeat(String string, int n) {
        if (n < 0)
            throw new IllegalArgumentException();
        else if (n == 0)
            return "";
        else {
            return string + repeat(string, n - 1);
        }
    }
}
