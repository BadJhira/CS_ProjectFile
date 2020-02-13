package CS_202.W4.InClass_Shapes;
// Doug Gilchrist 1/27/20 [Shape Interface/Implementation]
public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(1.0),
                new Rectangle(3.0, 5.0),
                new Triangle(3.0, 4.0, 5.0)
        };

        for (int i = 0; i < shapes.length; i++) {
            printInfo(shapes[i]);
            System.out.println();
        }
    }

    public static void printInfo(Shape shape) {
        System.out.println("Shape: " + shape);
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }
}
