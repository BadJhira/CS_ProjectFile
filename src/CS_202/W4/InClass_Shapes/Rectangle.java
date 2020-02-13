package CS_202.W4.InClass_Shapes;
// Doug Gilchrist 1/27/20 [Shape Interface/Implementation]
public class Rectangle implements Shape {
    // properties
    private double width, height;

    // constructors
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // methods
    public double area() { return width * height; }

    public double perimeter() { return 2 * (width + height); }

    public String toString() { return "Rectangle"; }
}
