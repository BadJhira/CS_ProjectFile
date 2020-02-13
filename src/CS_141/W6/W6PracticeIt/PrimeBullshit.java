package CS_141.W6.W6PracticeIt;

import java.util.Scanner;

public class PrimeBullshit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

    }

    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static boolean contains(String str, char ch) {
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                found = true;
            }
        }
        return found;
    }
}
