package CS_141.W3.InClass;

public class Parameters {

    public static void main(String[] args) {
        printPizzaArea(5.0);
        printPizzaArea(10.0);
        printPizzaArea(12.0);
        printPizzaArea(16.0);
        printPizzaArea(20.0);
    }

    public static void printPizzaArea(double pizzaDiameter) {
        double pizzaRadius;
        double pizzaArea;
        double piVal = 3.14159265;

        pizzaRadius = pizzaDiameter / 2.0;
        pizzaArea = piVal * pizzaRadius * pizzaRadius;
        System.out.print(pizzaDiameter + " inch pizza is ");
        System.out.println(pizzaArea + " inches squared.");
    }
}
