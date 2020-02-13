package CS_141.W5;
// Doug Gilchrist - 10/24/19 - More Chars
public class Chars2 {
    public static void main(String[] args) {
        System.out.println((char)('a' + 2));

        int x = 3;
        int y = -17;
        System.out.printf("x is %d and y is %d\n", x, y);
        System.out.printf("x is %.2f and y is %.2f\n", (double)x, (double)y);
        System.out.println();

        double gpa = 3.25467;
        System.out.printf("Your GPA is %.1f\n", gpa);
        System.out.printf("More precisely: %8.3f\n", gpa);
        System.out.printf("To two decimals: %5.2f\n", gpa);
        System.out.println();

        table();
    }

    public static void table() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%5d", (i * j));
            }
            System.out.println();
        }
    }

}
