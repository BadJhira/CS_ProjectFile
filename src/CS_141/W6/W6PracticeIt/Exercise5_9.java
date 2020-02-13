package CS_141.W6.W6PracticeIt;

public class Exercise5_9 {
    public static void main(String[] args) {


        printFactors(24);
    }

    public static void printFactors(int n) {
        int factor = 1;
        System.out.print(factor);

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" and " + i);
            }
        }
    }
}
