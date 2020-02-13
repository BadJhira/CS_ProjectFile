package CS_141.W4;
// Doug Gilchrist 10/17/19 ElseIf
import java.util.*;

public class IfElseStuff {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What percentage did you earn? ");
        int percentGrade = console.nextInt();

        if (percentGrade >= 90) {
            System.out.println("You got an A!");
        } else if (percentGrade >= 80) {
            System.out.println("You got a B!");
        } else if (percentGrade >= 70) {
            System.out.println("You got a C!");
        } else if (percentGrade >= 60) {
            System.out.println("You got a D!");
        } else if (percentGrade < 60) {
            System.out.println("You got an F!");
        }
        System.out.println("==============");
    }
}
