package CS_202.W6.Recursion;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i + "! = " + factorial(i));
        }
    }

    public static int factorial(int n) {
        if (n < 1)
            throw new IllegalArgumentException("ERROR - Method factorial() requires positive " +
                    "integer greater than zero. Entered: " + n);
        else if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
}
