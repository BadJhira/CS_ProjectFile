package CS_141.W11.InClass;
// Doug Gilchrist 12/3/19 [Classes & Objects]
public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(); // instantiation of class
        Point p2 = new Point(7, 10);

        p1.x = 5; // assigning "x-coordinate" field of object p1
        p1.y = 7; // assigning "y-coordinate" field of object p1

        System.out.println("Coordinates of p1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Coordinates of p2: (" + p2.x + ", " + p2.y + ")");

        p1.translate(5, 5);
        System.out.println("Coordinates of p1: (" + p1.x + ", " + p1.y + ")");

        p2.setCoordinates(12, 22);
        System.out.println("Coordinates of p2: (" + p2.x + ", " + p2.y + ")");

        System.out.printf("Distance from p1 to p2: %.1f\n", p1.distance(p2));
        System.out.printf("Distance from p2 to origin: %.1f\n", p2.distanceFromOrigin());
    }
}
