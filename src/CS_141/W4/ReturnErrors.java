package CS_141.W4;
// Doug Gilchrist 10/15/19 Return Errors
public class ReturnErrors {
    public static void main(String[] args) {
        // slope(0, 0, 6, 3);
        // System.out.println("The slope is: " + result);
        double answer = slope(0, 5, 6, 3);
        System.out.println("The slope is: " + answer);
        System.out.println("The slope is: " + slope(-2, 6, 3, 9));
    }

    public static double slope(int x1, int x2, int y1, int y2) {
        double dy = y2 - y1;
        double dx = x2 - x1;
        double result = dy / dx;
        return result;
    }
}
