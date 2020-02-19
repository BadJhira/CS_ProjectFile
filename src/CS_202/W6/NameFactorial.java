package CS_202.W6;

public class NameFactorial {
    public static void main(String[] args) {
        nameCrunch(4, "D", "O", "U", "G");
    }

    public static void nameCrunch(int n, String a, String b, String c, String d) {
        if (n == 1)
            System.out.println();
        else {
            // TODO: Doesn't work.
            System.out.print(a);
            nameCrunch(n - 1, a, b, c, d);
            System.out.print(b);
            nameCrunch(n - 1, a, b, c, d);
            System.out.print(c);
            nameCrunch(n - 1, a, b, c, d);
            System.out.print(d);
            nameCrunch(n - 1, a, b, c, d);
        }
    }
}
