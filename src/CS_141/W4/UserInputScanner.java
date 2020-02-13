package CS_141.W4;
// Doug Gilchrist 10/15/19 Scanner
import java.util.*;

public class UserInputScanner {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Triangle size? " );
        int triangleSize = console.nextInt();
        System.out.print("Fill character? ");
        String fillCharacter = console.next();

        drawTriangle(triangleSize, fillCharacter);
    }

    public static void drawTriangle(int size, String fill) {
        for (int line = 1; line <= size; line++) {
            printString(" ", size - line);
            printString(fill, (line * 2) - 1);
            System.out.println();
        }
    }

    public static void  printString(String string, int num) {
        for (int count = 1; count <= num; count++) {
            System.out.print(string);
        }
    }
}
