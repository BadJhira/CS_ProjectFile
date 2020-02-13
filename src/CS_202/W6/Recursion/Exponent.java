package CS_202.W6.Recursion;

public class Exponent {
    public static void main(String[] args) {
        System.out.println("2: " + exponent(2, 4));
    }

    public static int exponent(int base, int exponent) {
        if (exponent < 0)
            throw new IllegalArgumentException("ERROR - Method exponent() only accepts positive integer values for exponent." +
                    "Entered: " + exponent);
        else if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            return exponent(base * base, exponent / 2);
        } else {
            return base * exponent(base, exponent - 1);
        }
    }
}
