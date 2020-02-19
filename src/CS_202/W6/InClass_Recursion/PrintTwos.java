package CS_202.W6.InClass_Recursion;
// Doug Gilchrist 2/12/20 [Recursion - PrintTwos]
public class PrintTwos {
    public static void main(String[] args) {
        printTwos(80);
        System.out.println();
        printTwos(20);
        System.out.println();
        printTwos(5);
        System.out.println();
        printTwos(96);
        System.out.println();
        printTwos(2);
        System.out.println();
    }

    public static void printTwos(int n) {
        if (n < 1)
            throw new IllegalArgumentException();
        else if (n % 4 == 0) {
            System.out.print("2 * ");
            printTwos(n / 4);
            System.out.print(" * 2");
        } else if (n % 2 == 0) {
            System.out.print("2 * " + (n / 2));
        } else {
            System.out.print(n);
        }
    }
}
