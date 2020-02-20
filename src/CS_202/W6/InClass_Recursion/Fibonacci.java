package CS_202.W6.InClass_Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int n) {
        if (n < 1)
            throw new IllegalArgumentException();
        else if (n <= 2)
            return 1;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
