package CS_141.W2.Week2Methods;
// Doug Gilchrist
public class forLoops {
    public static void main(String[] args) {
        // 3x Hello World!
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + ": Hello World!");
        }
        // Squaring numbers
        System.out.println("=== No for Loop ===");
        System.out.println("1 squared = " + 1 * 1);
        System.out.println("2 squared = " + 2 * 2);
        System.out.println("3 squared = " + 3 * 3);
        System.out.println("4 squared = " + 4 * 4);
        System.out.println("5 squared = " + 5 * 5);
        System.out.println("6 squared = " + 6 * 6);
        // Squaring numbers (for Loop)
        System.out.println("=== for Loop ===");
        for (int x = 1; x <=6; x++) {
            System.out.println(x + " squared = " + (x * x));
        }
        // Squaring numbers (for Loop), changed index
        System.out.println("=== for Loop (changing the index) ===");
        for (int x = 1; x <=10; x++) {
            System.out.println(x + " squared = " + (x * x));
        }
        // Pattern
        System.out.println("+----+");
        for (int i = 0; i < 3; i++) {
            System.out.println("\\    /");
            System.out.println("/    \\");
        }
        System.out.println("+----+");
        //Pattern variation
        System.out.println("+----+");
        for (int i = 0; i < 2; i++) {
            System.out.println("\\    /");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("/    \\");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("\\    /");
        }
        System.out.println("+----+");
        // Temperature
        System.out.println("=== Temperature ===");
        int highTemp = 5;
        double temp = 0;
        for (int i = -3; i <= highTemp / 2; i++) {
            temp = i * 1.8 + 32;
            System.out.println("Inside the loop: " + temp);
        }
        System.out.println("Outside the loop: " + temp);
        // Rocket
        System.out.println("=== Rocket ===");
        System.out.print("T-Minus ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + "-");
        }
        System.out.println("blast off!");
        System.out.println("The end.");
    }
}
