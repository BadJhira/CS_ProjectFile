package CS_141.W3.InClass;
// Doug Gilchrist
public class BetterNestedLoops {
    public static final int SIZE = 4;
    public static void main(String[] args) {
        for(int line = 1; line <= SIZE; line++) {
            // Consider an equation for each for loop, with scalability in mind
            // Equation: (-4 * line + 20) /
            for(int slash = 1; slash <= (-4 * line + (4 * SIZE)); slash++) {
                System.out.print("/");
            }
            // Equation: (8 * line - 8) *
            for(int star = 1; star <= (8 * line - 8); star++) {
                System.out.print("*");
            }
            // Equation: (-4 * line -20) \
            for(int slash = 1; slash <= (-4 * line + (4 * SIZE)); slash++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
