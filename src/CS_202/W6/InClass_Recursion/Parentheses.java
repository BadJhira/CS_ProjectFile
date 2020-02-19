package CS_202.W6.InClass_Recursion;
// Doug Gilchrist 2/12/20 [Recursion - Parentheses]
public class Parentheses {
    public static void main(String[] args) {
        System.out.println(parentheses("Hello", 5));
        System.out.println(parentheses("none", 0));
        System.out.println(parentheses("Goodbye", 3));
//        System.out.println(parentheses("Exception", -5));
    }

    public static String parentheses(String word, int n) {
        if (n < 0)
            throw new IllegalArgumentException("ERROR - Negative values cannot be printed: " + n);
        else if (n == 0) {
            return word;
        } else {
            return "(" + parentheses(word, n - 1) + ")";
        }
    }
}
