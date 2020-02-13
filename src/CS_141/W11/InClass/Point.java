package CS_141.W11.InClass;
// Doug Gilchrist 12/3/19 [Classes & Objects]
public class Point {
    // class properties
    int x;
    int y;

    // class constructors
    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // class methods
    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distance(Point other) {
         int xSqr = (other.x - this.x) * (other.x - this.x);
         int ySqr = (other.y - this.y) * (other.y - this.y);
         return Math.sqrt(xSqr + ySqr);
    }

    public double distanceFromOrigin() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }
}
