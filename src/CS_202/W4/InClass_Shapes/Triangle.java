package CS_202.W4.InClass_Shapes;
// Doug Gilchrist 1/27/20 [Shape Interface/Implementation]
public class Triangle implements Shape{
    // properties
    private double a, b, c;

    // constructors
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // methods
    public double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s- b) * (s - c));
    }

    public double perimeter() { return a + b + c; }

    public String toString() { return "Triangle"; }
}
