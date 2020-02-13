package CS_141.W2.BJPTextbookExercises;
// Doug Gilchrist  10/8/19  Programming Project 1
public class Project1 {
    public static final int COUNT = 7;

    public static void main(String[] args) {
        System.out.println("Programming Project 1");
        System.out.println("=====================");
        System.out.println();

        for (int line = 1; line <= COUNT; line++) {
            for (int star = 1; star <= COUNT - line; star++) {
                System.out.print("*");
            }

            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }

            for (int forSlash = 1; forSlash <= COUNT - line; forSlash++) {
                System.out.print("//");
            }

            for (int backSlash = 1; backSlash <= line - 1; backSlash++) {
                System.out.print("\\\\");
            }

            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= COUNT - line; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
