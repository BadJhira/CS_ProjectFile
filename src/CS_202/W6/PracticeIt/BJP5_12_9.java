package CS_202.W6.PracticeIt;

public class BJP5_12_9 {
    public static void main(String[] args) {
        System.out.println(sumTo(5));
    }

    public static double sumTo(int n) {
        if (n < 0)
            throw new IllegalArgumentException();
        else if (n == 0)
            return 0.0;
        else {
            return (1.0 / (double)n) + sumTo(n - 1);
        }
    }
}
