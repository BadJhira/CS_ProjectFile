package CS_141.W2.Week2Methods;
// Doug Gilchrist
public class Variables {
    public static void main(String[] args) {
        // Variables
        int x = 3;
        double myGPA = 4.0;
        double y = 2.0;

        // Integers
        System.out.println("x is " + x);
        System.out.println(5 * x - 1);
        x = 5 * x - 1;
        System.out.println("x is " + x);
        System.out.println();
        // Doubles
        System.out.println("myGPA is " + myGPA);
        myGPA = myGPA - 2.5;
        System.out.println("myGPA is " + myGPA);
        System.out.println("myGPA is " + (myGPA + 1.5));
        System.out.println();
        System.out.println("y is " + y);
        y = y * 2.4 + 2.25 * 4.0 / y;
        System.out.println("y is " + y);
        System.out.println();
        // Casting
        x = (int)y; // Assigns x (which is an int) with the int value of y (which is a double)
        System.out.println("new x is " + x);
    }
}
