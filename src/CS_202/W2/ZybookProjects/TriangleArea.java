package CS_202.W2.ZybookProjects;

import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        // Read and set base and height for triangle1 (use setBase() and setHeight())
        triangle1.setBase(scnr.nextDouble());
        triangle1.setHeight(scnr.nextDouble());
        scnr.nextLine();

        // Read and set base and height for triangle2 (use setBase() and setHeight())
        triangle2.setBase(scnr.nextDouble());
        triangle2.setHeight(scnr.nextDouble());

        // Determine larger triangle (use getArea())
        System.out.println("Triangle with larger area:");
        // Output larger triangle's info (use printInfo())
        if (triangle1.getArea() > triangle2.getArea())
            triangle1.printInfo();
        else
            triangle2.printInfo();

    }
}
