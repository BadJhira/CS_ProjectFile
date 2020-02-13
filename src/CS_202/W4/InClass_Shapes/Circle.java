package CS_202.W4.InClass_Shapes;
// Doug Gilchrist 1/27/20 [Shape Interface/Implementation]
public class Circle implements Shape{
    // properties
    private double radius;

    // constructors
    public Circle(double radius) { this.radius = radius; }

    // methods
    public double area() { return Math.PI * radius * radius; }

    public double perimeter() { return 2 * Math.PI * radius; }

    public String toString() { return "Circle"; }
}
